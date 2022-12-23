package com.linkedin.datahub.graphql.generated;


/**
 * Create a new GlossaryNode. Returns the urn of the newly created GlossaryNode. If a node with the provided ID already exists, it will be overwritten.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface CreateGlossaryNodeMutationResolver {

    /**
     * Create a new GlossaryNode. Returns the urn of the newly created GlossaryNode. If a node with the provided ID already exists, it will be overwritten.
     */
    String createGlossaryNode(CreateGlossaryEntityInput input) throws Exception;

}