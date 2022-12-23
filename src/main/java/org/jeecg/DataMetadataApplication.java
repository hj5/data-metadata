package org.jeecg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class DataMetadataApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataMetadataApplication.class, args);
	}

	@Value("${datahub.url}")
	private String datahubUrl;
	@Value("${datahub.token}")
	private String datahubToken;

	private final String AUTHORIZATION = "Authorization";

//	@Bean
	public WebClient webClient(){
//		return WebClient.builder().defaultHeader(AUTHORIZATION, datahubToken).baseUrl(datahubUrl).build();
		return WebClient.builder().defaultHeaders(httpHeaders -> {
			httpHeaders.set(AUTHORIZATION, datahubToken);
		}).baseUrl(datahubUrl).build();
	}

	@Bean
	public HttpGraphQlClient httpGraphQlClient(){
		return HttpGraphQlClient.create(webClient());
	}
}
