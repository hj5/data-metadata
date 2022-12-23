package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for IngestionSource
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface IngestionSourceResolver {

    /**
     * Previous requests to execute the ingestion source
     */
    IngestionSourceExecutionRequests executions(IngestionSource ingestionSource, Integer start, Integer count) throws Exception;

}