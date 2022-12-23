package com.linkedin.datahub.graphql.generated;


/**
 * Fetch details associated with the authenticated user, provided via an auth cookie or header
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface MeQueryResolver {

    /**
     * Fetch details associated with the authenticated user, provided via an auth cookie or header
     */
    AuthenticatedUser me() throws Exception;

}