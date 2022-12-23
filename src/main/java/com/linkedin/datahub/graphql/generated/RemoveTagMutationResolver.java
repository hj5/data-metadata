package com.linkedin.datahub.graphql.generated;


/**
 * Remove a tag from a particular Entity or subresource
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface RemoveTagMutationResolver {

    /**
     * Remove a tag from a particular Entity or subresource
     */
    Boolean removeTag(TagAssociationInput input) throws Exception;

}