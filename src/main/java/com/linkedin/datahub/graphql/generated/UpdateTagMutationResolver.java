package com.linkedin.datahub.graphql.generated;


/**
 * Update the information about a particular Entity Tag
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface UpdateTagMutationResolver {

    /**
     * Update the information about a particular Entity Tag
     */
    Tag updateTag(String urn, TagUpdateInput input) throws Exception;

}