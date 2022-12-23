package com.linkedin.datahub.graphql.generated;


/**
 * Add multiple related Terms to a Glossary Term to establish relationships
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface AddRelatedTermsMutationResolver {

    /**
     * Add multiple related Terms to a Glossary Term to establish relationships
     */
    Boolean addRelatedTerms(RelatedTermsInput input) throws Exception;

}