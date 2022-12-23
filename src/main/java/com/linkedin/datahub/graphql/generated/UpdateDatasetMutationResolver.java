package com.linkedin.datahub.graphql.generated;


/**
 * Update the metadata about a particular Dataset
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface UpdateDatasetMutationResolver {

    /**
     * Update the metadata about a particular Dataset
     */
    Dataset updateDataset(String urn, DatasetUpdateInput input) throws Exception;

}