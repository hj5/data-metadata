package com.linkedin.datahub.graphql.generated;


/**
 * Change the status of a user. Requires Manage Users & Groups Platform Privilege
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface UpdateUserStatusMutationResolver {

    /**
     * Change the status of a user. Requires Manage Users & Groups Platform Privilege
     */
    String updateUserStatus(String urn, CorpUserStatus status) throws Exception;

}