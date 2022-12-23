package com.linkedin.datahub.graphql.generated;


/**
 * Cancel a running execution request, provided the urn of the original execution request
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface CancelIngestionExecutionRequestMutationResolver {

    /**
     * Cancel a running execution request, provided the urn of the original execution request
     */
    String cancelIngestionExecutionRequest(CancelIngestionExecutionRequestInput input) throws Exception;

}