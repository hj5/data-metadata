package com.linkedin.datahub.graphql.generated;


/**
 * Generates a token that can be shared with existing native users to reset their credentials.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface CreateNativeUserResetTokenMutationResolver {

    /**
     * Generates a token that can be shared with existing native users to reset their credentials.
     */
    ResetToken createNativeUserResetToken(CreateNativeUserResetTokenInput input) throws Exception;

}