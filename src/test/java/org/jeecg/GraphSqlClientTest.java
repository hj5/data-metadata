package org.jeecg;

import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class GraphSqlClientTest {
    public static void main(String[] args) {
            String url = "http://localhost:8080/graphql";

            String doc = "query {\n" +
                    "  bookById(id: \"book-1\") {\n" +
                    "    id\n" +
                    "    name\n" +
                    "    pageCount\n" +
                    "    author {\n" +
                    "      id\n" +
                    "      firstName\n" +
                    "      lastName\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";
            WebClient webClient = WebClient.create(url);
            HttpGraphQlClient graphQlClient = HttpGraphQlClient.create(webClient);
            Mono<Book> bookMono = graphQlClient.document(doc)
                    .retrieve("bookById")
                    .toEntity(Book.class);
            Book book = bookMono.block();
            System.out.println(book.getId()+">>>"+book.getAuthor().getId()+">>>"+book.getAuthor().getFirstName());
    }
}
