package com.linkedin.datahub.graphql.generated;


/**
 * Update an existing policy and returns the resulting urn
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface UpdatePolicyMutationResolver {

    /**
     * Update an existing policy and returns the resulting urn
     */
    String updatePolicy(String urn, PolicyUpdateInput input) throws Exception;

}