package com.linkedin.datahub.graphql.generated;


/**
 * Update the metadata about a particular Dashboard
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface UpdateDashboardMutationResolver {

    /**
     * Update the metadata about a particular Dashboard
     */
    Dashboard updateDashboard(String urn, DashboardUpdateInput input) throws Exception;

}