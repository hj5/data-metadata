package com.linkedin.datahub.graphql.generated;


/**
 * Create a new group. Returns the urn of the newly created group. Requires the Manage Users & Groups Platform Privilege
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface CreateGroupMutationResolver {

    /**
     * Create a new group. Returns the urn of the newly created group. Requires the Manage Users & Groups Platform Privilege
     */
    String createGroup(CreateGroupInput input) throws Exception;

}