package com.linkedin.datahub.graphql.generated;


/**
 * Get an execution request
urn: The primary key associated with the execution request.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface ExecutionRequestQueryResolver {

    /**
     * Get an execution request
urn: The primary key associated with the execution request.
     */
    ExecutionRequest executionRequest(String urn) throws Exception;

}