package com.linkedin.datahub.graphql.generated;


/**
 * Fetch an Assertion by primary key (urn)
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface AssertionQueryResolver {

    /**
     * Fetch an Assertion by primary key (urn)
     */
    Assertion assertion(String urn) throws Exception;

}