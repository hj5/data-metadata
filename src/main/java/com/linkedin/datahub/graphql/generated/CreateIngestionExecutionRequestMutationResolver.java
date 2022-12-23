package com.linkedin.datahub.graphql.generated;


/**
 * Create a request to execute an ingestion job
input: Input required for creating an ingestion execution request
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface CreateIngestionExecutionRequestMutationResolver {

    /**
     * Create a request to execute an ingestion job
input: Input required for creating an ingestion execution request
     */
    String createIngestionExecutionRequest(CreateIngestionExecutionRequestInput input) throws Exception;

}