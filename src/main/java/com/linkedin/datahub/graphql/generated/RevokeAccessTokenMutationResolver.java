package com.linkedin.datahub.graphql.generated;


/**
 * Revokes access tokens.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface RevokeAccessTokenMutationResolver {

    /**
     * Revokes access tokens.
     */
    boolean revokeAccessToken(String tokenId) throws Exception;

}