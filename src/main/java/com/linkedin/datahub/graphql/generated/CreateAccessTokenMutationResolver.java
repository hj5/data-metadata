package com.linkedin.datahub.graphql.generated;


/**
 * Generates an access token for DataHub APIs for a particular user & of a particular type
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface CreateAccessTokenMutationResolver {

    /**
     * Generates an access token for DataHub APIs for a particular user & of a particular type
     */
    AccessToken createAccessToken(CreateAccessTokenInput input) throws Exception;

}