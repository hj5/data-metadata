package com.linkedin.datahub.graphql.generated;


/**
 * List access tokens stored in DataHub.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface ListAccessTokensQueryResolver {

    /**
     * List access tokens stored in DataHub.
     */
    @javax.annotation.Nonnull
    ListAccessTokenResult listAccessTokens(ListAccessTokenInput input) throws Exception;

}