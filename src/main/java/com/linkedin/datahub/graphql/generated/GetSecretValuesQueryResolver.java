package com.linkedin.datahub.graphql.generated;


/**
 * Fetch the values of a set of secrets. The caller must have the MANAGE_SECRETS
privilege to use.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface GetSecretValuesQueryResolver {

    /**
     * Fetch the values of a set of secrets. The caller must have the MANAGE_SECRETS
privilege to use.
     */
    @javax.annotation.Nonnull
    java.util.List<SecretValue> getSecretValues(GetSecretValuesInput input) throws Exception;

}