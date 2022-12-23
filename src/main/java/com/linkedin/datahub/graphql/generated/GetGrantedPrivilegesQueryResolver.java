package com.linkedin.datahub.graphql.generated;


/**
 * Get all granted privileges for the given actor and resource
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface GetGrantedPrivilegesQueryResolver {

    /**
     * Get all granted privileges for the given actor and resource
     */
    Privileges getGrantedPrivileges(GetGrantedPrivilegesInput input) throws Exception;

}