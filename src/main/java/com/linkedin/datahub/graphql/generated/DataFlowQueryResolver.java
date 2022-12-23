package com.linkedin.datahub.graphql.generated;


/**
 * Fetch a Data Flow (or Data Pipeline) by primary key (urn)
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface DataFlowQueryResolver {

    /**
     * Fetch a Data Flow (or Data Pipeline) by primary key (urn)
     */
    DataFlow dataFlow(String urn) throws Exception;

}