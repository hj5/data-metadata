package com.linkedin.datahub.graphql.generated;


/**
 * Remove a glossary entity (GlossaryTerm or GlossaryNode). Return boolean whether it was successful or not.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface DeleteGlossaryEntityMutationResolver {

    /**
     * Remove a glossary entity (GlossaryTerm or GlossaryNode). Return boolean whether it was successful or not.
     */
    Boolean deleteGlossaryEntity(String urn) throws Exception;

}