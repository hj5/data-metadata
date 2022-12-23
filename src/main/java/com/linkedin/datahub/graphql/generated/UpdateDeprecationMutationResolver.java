package com.linkedin.datahub.graphql.generated;


/**
 * Sets the Deprecation status for a Metadata Entity. Requires the Edit Deprecation status privilege for an entity.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface UpdateDeprecationMutationResolver {

    /**
     * Sets the Deprecation status for a Metadata Entity. Requires the Edit Deprecation status privilege for an entity.
     */
    Boolean updateDeprecation(UpdateDeprecationInput input) throws Exception;

}