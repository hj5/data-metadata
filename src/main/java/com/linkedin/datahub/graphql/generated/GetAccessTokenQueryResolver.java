package com.linkedin.datahub.graphql.generated;


/**
 * Generates an access token for DataHub APIs for a particular user & of a particular type
Deprecated, use createAccessToken instead
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface GetAccessTokenQueryResolver {

    /**
     * Generates an access token for DataHub APIs for a particular user & of a particular type
Deprecated, use createAccessToken instead
     */
    AccessToken getAccessToken(GetAccessTokenInput input) throws Exception;

}