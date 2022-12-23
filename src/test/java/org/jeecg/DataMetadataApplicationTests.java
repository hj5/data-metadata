package org.jeecg;

import com.linkedin.datahub.graphql.generated.GlossaryNode;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.graphql.client.ClientGraphQlResponse;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RunWith(SpringRunner.class)
@SpringBootTest
class DataMetadataApplicationTests {

	@Autowired
	HttpGraphQlClient graphQlClient;

	@Test
	void testGraphQL() {
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
//		HttpGraphQlClient graphQlClient = HttpGraphQlClient.create(webClient);
		Mono<Book> bookMono = graphQlClient.document(doc)
				.retrieve("bookById")
				.toEntity(Book.class);
		Book book = bookMono.block();
		System.out.println(book.getId()+">>>"+book.getAuthor().getId()+">>>"+book.getAuthor().getFirstName());
	}

	@Test
	void testGraphQL1() {
		String doc = "query getGlossaryNode($urn: String!) {\n" +
				"  glossaryNode(urn: $urn) {\n" +
				"    urn\n" +
				"    type\n" +
				"    properties {\n" +
				"      name\n" +
				"      description\n" +
				"      __typename\n" +
				"    }\n" +
				"    ownership {\n" +
				"      ...ownershipFields\n" +
				"      __typename\n" +
				"    }\n" +
				"    parentNodes {\n" +
				"      ...parentNodesFields\n" +
				"      __typename\n" +
				"    }\n" +
				"    privileges {\n" +
				"      canManageEntity\n" +
				"      canManageChildren\n" +
				"      __typename\n" +
				"    }\n" +
				"    children: relationships(\n" +
				"      input: {types: [\"IsPartOf\"], direction: INCOMING, start: 0, count: 10000}\n" +
				"    ) {\n" +
				"      total\n" +
				"      relationships {\n" +
				"        direction\n" +
				"        entity {\n" +
				"          type\n" +
				"          urn\n" +
				"          ... on GlossaryNode {\n" +
				"            ...glossaryNode\n" +
				"            __typename\n" +
				"          }\n" +
				"          ... on GlossaryTerm {\n" +
				"            ...childGlossaryTerm\n" +
				"            __typename\n" +
				"          }\n" +
				"          __typename\n" +
				"        }\n" +
				"        __typename\n" +
				"      }\n" +
				"      __typename\n" +
				"    }\n" +
				"    __typename\n" +
				"  }\n" +
				"}\n" +
				"\n" +
				"fragment ownershipFields on Ownership {\n" +
				"  owners {\n" +
				"    owner {\n" +
				"      ... on CorpUser {\n" +
				"        urn\n" +
				"        type\n" +
				"        username\n" +
				"        info {\n" +
				"          active\n" +
				"          displayName\n" +
				"          title\n" +
				"          email\n" +
				"          firstName\n" +
				"          lastName\n" +
				"          fullName\n" +
				"          __typename\n" +
				"        }\n" +
				"        properties {\n" +
				"          active\n" +
				"          displayName\n" +
				"          title\n" +
				"          email\n" +
				"          firstName\n" +
				"          lastName\n" +
				"          fullName\n" +
				"          __typename\n" +
				"        }\n" +
				"        editableProperties {\n" +
				"          displayName\n" +
				"          title\n" +
				"          pictureLink\n" +
				"          email\n" +
				"          __typename\n" +
				"        }\n" +
				"        __typename\n" +
				"      }\n" +
				"      ... on CorpGroup {\n" +
				"        urn\n" +
				"        type\n" +
				"        name\n" +
				"        properties {\n" +
				"          displayName\n" +
				"          email\n" +
				"          __typename\n" +
				"        }\n" +
				"        info {\n" +
				"          displayName\n" +
				"          email\n" +
				"          admins {\n" +
				"            urn\n" +
				"            username\n" +
				"            info {\n" +
				"              active\n" +
				"              displayName\n" +
				"              title\n" +
				"              email\n" +
				"              firstName\n" +
				"              lastName\n" +
				"              fullName\n" +
				"              __typename\n" +
				"            }\n" +
				"            editableInfo {\n" +
				"              pictureLink\n" +
				"              teams\n" +
				"              skills\n" +
				"              __typename\n" +
				"            }\n" +
				"            __typename\n" +
				"          }\n" +
				"          members {\n" +
				"            urn\n" +
				"            username\n" +
				"            info {\n" +
				"              active\n" +
				"              displayName\n" +
				"              title\n" +
				"              email\n" +
				"              firstName\n" +
				"              lastName\n" +
				"              fullName\n" +
				"              __typename\n" +
				"            }\n" +
				"            editableInfo {\n" +
				"              pictureLink\n" +
				"              teams\n" +
				"              skills\n" +
				"              __typename\n" +
				"            }\n" +
				"            __typename\n" +
				"          }\n" +
				"          groups\n" +
				"          __typename\n" +
				"        }\n" +
				"        __typename\n" +
				"      }\n" +
				"      __typename\n" +
				"    }\n" +
				"    type\n" +
				"    associatedUrn\n" +
				"    __typename\n" +
				"  }\n" +
				"  lastModified {\n" +
				"    time\n" +
				"    __typename\n" +
				"  }\n" +
				"  __typename\n" +
				"}\n" +
				"\n" +
				"fragment parentNodesFields on ParentNodesResult {\n" +
				"  count\n" +
				"  nodes {\n" +
				"    urn\n" +
				"    type\n" +
				"    properties {\n" +
				"      name\n" +
				"      __typename\n" +
				"    }\n" +
				"    __typename\n" +
				"  }\n" +
				"  __typename\n" +
				"}\n" +
				"\n" +
				"fragment glossaryNode on GlossaryNode {\n" +
				"  urn\n" +
				"  type\n" +
				"  properties {\n" +
				"    name\n" +
				"    __typename\n" +
				"  }\n" +
				"  children: relationships(\n" +
				"    input: {types: [\"IsPartOf\"], direction: INCOMING, start: 0, count: 10000}\n" +
				"  ) {\n" +
				"    total\n" +
				"    __typename\n" +
				"  }\n" +
				"  __typename\n" +
				"}\n" +
				"\n" +
				"fragment childGlossaryTerm on GlossaryTerm {\n" +
				"  urn\n" +
				"  type\n" +
				"  name\n" +
				"  hierarchicalName\n" +
				"  properties {\n" +
				"    name\n" +
				"    __typename\n" +
				"  }\n" +
				"  __typename\n" +
				"}\n";
		Mono<GlossaryNode> mono = graphQlClient.document(doc)
				.variable("urn", "urn:li:glossaryNode:9add6780-7130-47f4-96b6-d5fa36b252b9")
				//响应结果路径：根节点data不算
				.retrieve("glossaryNode")
				.toEntity(GlossaryNode.class);
		GlossaryNode node = mono.block();
		System.out.println(node.getUrn()+">>>"+node.getType()+">>>"+node.getProperties().getName());
	}

	@Test
	void testGraphQL2() {
		String doc = "{\n" +
				"    \"variables\":\n" +
				"    {\n" +
				"        \"urn\": \"urn:li:glossaryNode:9add6780-7130-47f4-96b6-d5fa36b252b9\"\n" +
				"    },\n" +
				"    \"query\": \"query getGlossaryNode($urn: String!) {\\n  glossaryNode(urn: $urn) {\\n    urn\\n    type\\n    properties {\\n      name\\n      description\\n      __typename\\n    }\\n    ownership {\\n      ...ownershipFields\\n      __typename\\n    }\\n    parentNodes {\\n      ...parentNodesFields\\n      __typename\\n    }\\n    privileges {\\n      canManageEntity\\n      canManageChildren\\n      __typename\\n    }\\n    children: relationships(\\n      input: {types: [\\\"IsPartOf\\\"], direction: INCOMING, start: 0, count: 10000}\\n    ) {\\n      total\\n      relationships {\\n        direction\\n        entity {\\n          type\\n          urn\\n          ... on GlossaryNode {\\n            ...glossaryNode\\n            __typename\\n          }\\n          ... on GlossaryTerm {\\n            ...childGlossaryTerm\\n            __typename\\n          }\\n          __typename\\n        }\\n        __typename\\n      }\\n      __typename\\n    }\\n    __typename\\n  }\\n}\\n\\nfragment ownershipFields on Ownership {\\n  owners {\\n    owner {\\n      ... on CorpUser {\\n        urn\\n        type\\n        username\\n        info {\\n          active\\n          displayName\\n          title\\n          email\\n          firstName\\n          lastName\\n          fullName\\n          __typename\\n        }\\n        properties {\\n          active\\n          displayName\\n          title\\n          email\\n          firstName\\n          lastName\\n          fullName\\n          __typename\\n        }\\n        editableProperties {\\n          displayName\\n          title\\n          pictureLink\\n          email\\n          __typename\\n        }\\n        __typename\\n      }\\n      ... on CorpGroup {\\n        urn\\n        type\\n        name\\n        properties {\\n          displayName\\n          email\\n          __typename\\n        }\\n        info {\\n          displayName\\n          email\\n          admins {\\n            urn\\n            username\\n            info {\\n              active\\n              displayName\\n              title\\n              email\\n              firstName\\n              lastName\\n              fullName\\n              __typename\\n            }\\n            editableInfo {\\n              pictureLink\\n              teams\\n              skills\\n              __typename\\n            }\\n            __typename\\n          }\\n          members {\\n            urn\\n            username\\n            info {\\n              active\\n              displayName\\n              title\\n              email\\n              firstName\\n              lastName\\n              fullName\\n              __typename\\n            }\\n            editableInfo {\\n              pictureLink\\n              teams\\n              skills\\n              __typename\\n            }\\n            __typename\\n          }\\n          groups\\n          __typename\\n        }\\n        __typename\\n      }\\n      __typename\\n    }\\n    type\\n    associatedUrn\\n    __typename\\n  }\\n  lastModified {\\n    time\\n    __typename\\n  }\\n  __typename\\n}\\n\\nfragment parentNodesFields on ParentNodesResult {\\n  count\\n  nodes {\\n    urn\\n    type\\n    properties {\\n      name\\n      __typename\\n    }\\n    __typename\\n  }\\n  __typename\\n}\\n\\nfragment glossaryNode on GlossaryNode {\\n  urn\\n  type\\n  properties {\\n    name\\n    __typename\\n  }\\n  children: relationships(\\n    input: {types: [\\\"IsPartOf\\\"], direction: INCOMING, start: 0, count: 10000}\\n  ) {\\n    total\\n    __typename\\n  }\\n  __typename\\n}\\n\\nfragment childGlossaryTerm on GlossaryTerm {\\n  urn\\n  type\\n  name\\n  hierarchicalName\\n  properties {\\n    name\\n    __typename\\n  }\\n  __typename\\n}\\n\"\n" +
				"}";
		Mono<ClientGraphQlResponse> mono = graphQlClient.document(doc).execute();
		ClientGraphQlResponse response = mono.block();
		GlossaryNode node = response.toEntity(GlossaryNode.class);
		System.out.println(node.getUrn()+">>>"+node.getType()+">>>"+node.getProperties().getName());
	}

}
