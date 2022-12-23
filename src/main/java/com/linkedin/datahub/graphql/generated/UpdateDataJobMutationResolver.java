package com.linkedin.datahub.graphql.generated;


/**
 * Update the metadata about a particular Data Job (Task)
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface UpdateDataJobMutationResolver {

    /**
     * Update the metadata about a particular Data Job (Task)
     */
    DataJob updateDataJob(String urn, DataJobUpdateInput input) throws Exception;

}