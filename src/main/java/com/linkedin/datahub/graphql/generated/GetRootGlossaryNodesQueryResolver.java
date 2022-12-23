package com.linkedin.datahub.graphql.generated;


/**
 * Get all GlossaryNodes without a parentNode
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface GetRootGlossaryNodesQueryResolver {

    /**
     * Get all GlossaryNodes without a parentNode
     */
    GetRootGlossaryNodesResult getRootGlossaryNodes(GetRootGlossaryEntitiesInput input) throws Exception;

}