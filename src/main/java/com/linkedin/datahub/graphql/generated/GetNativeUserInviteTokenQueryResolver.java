package com.linkedin.datahub.graphql.generated;


/**
 * Gets the current invite token. If the optional regenerate param is set to true, generate a new invite token.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface GetNativeUserInviteTokenQueryResolver {

    /**
     * Gets the current invite token. If the optional regenerate param is set to true, generate a new invite token.
     */
    InviteToken getNativeUserInviteToken() throws Exception;

}