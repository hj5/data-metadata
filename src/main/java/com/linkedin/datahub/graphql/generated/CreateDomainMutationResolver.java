package com.linkedin.datahub.graphql.generated;


/**
 * Create a new Domain. Returns the urn of the newly created Domain. Requires the 'Create Domains' or 'Manage Domains' Platform Privilege. If a Domain with the provided ID already exists,
it will be overwritten.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface CreateDomainMutationResolver {

    /**
     * Create a new Domain. Returns the urn of the newly created Domain. Requires the 'Create Domains' or 'Manage Domains' Platform Privilege. If a Domain with the provided ID already exists,
it will be overwritten.
     */
    String createDomain(CreateDomainInput input) throws Exception;

}