package com.linkedin.datahub.graphql.generated;


/**
 * Create a new GlossaryTerm. Returns the urn of the newly created GlossaryTerm. If a term with the provided ID already exists, it will be overwritten.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface CreateGlossaryTermMutationResolver {

    /**
     * Create a new GlossaryTerm. Returns the urn of the newly created GlossaryTerm. If a term with the provided ID already exists, it will be overwritten.
     */
    String createGlossaryTerm(CreateGlossaryEntityInput input) throws Exception;

}