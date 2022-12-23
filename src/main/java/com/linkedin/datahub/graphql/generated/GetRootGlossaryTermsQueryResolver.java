package com.linkedin.datahub.graphql.generated;


/**
 * Get all GlossaryTerms without a parentNode
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface GetRootGlossaryTermsQueryResolver {

    /**
     * Get all GlossaryTerms without a parentNode
     */
    GetRootGlossaryTermsResult getRootGlossaryTerms(GetRootGlossaryEntitiesInput input) throws Exception;

}