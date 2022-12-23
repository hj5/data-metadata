package com.linkedin.datahub.graphql.generated;


/**
 * Fetch a specific ingestion source
urn: The primary key associated with the ingestion source.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface IngestionSourceQueryResolver {

    /**
     * Fetch a specific ingestion source
urn: The primary key associated with the ingestion source.
     */
    IngestionSource ingestionSource(String urn) throws Exception;

}