package com.linkedin.datahub.graphql.generated;


/**
 * Updates the parent node of a resource. Currently only GlossaryNodes and GlossaryTerms have parentNodes.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface UpdateParentNodeMutationResolver {

    /**
     * Updates the parent node of a resource. Currently only GlossaryNodes and GlossaryTerms have parentNodes.
     */
    Boolean updateParentNode(UpdateParentNodeInput input) throws Exception;

}