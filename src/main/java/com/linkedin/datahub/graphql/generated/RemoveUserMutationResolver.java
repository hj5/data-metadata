package com.linkedin.datahub.graphql.generated;


/**
 * Remove a user. Requires Manage Users & Groups Platform Privilege
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface RemoveUserMutationResolver {

    /**
     * Remove a user. Requires Manage Users & Groups Platform Privilege
     */
    Boolean removeUser(String urn) throws Exception;

}