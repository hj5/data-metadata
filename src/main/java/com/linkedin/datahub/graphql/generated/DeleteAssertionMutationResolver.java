package com.linkedin.datahub.graphql.generated;


/**
 * Remove an assertion associated with an entity. Requires the 'Edit Assertions' privilege on the entity.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface DeleteAssertionMutationResolver {

    /**
     * Remove an assertion associated with an entity. Requires the 'Edit Assertions' privilege on the entity.
     */
    Boolean deleteAssertion(String urn) throws Exception;

}