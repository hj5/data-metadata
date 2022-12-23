package com.linkedin.datahub.graphql.generated;


/**
 * Update the metadata about a particular Data Flow (Pipeline)
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface UpdateDataFlowMutationResolver {

    /**
     * Update the metadata about a particular Data Flow (Pipeline)
     */
    DataFlow updateDataFlow(String urn, DataFlowUpdateInput input) throws Exception;

}