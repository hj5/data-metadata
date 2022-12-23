package com.linkedin.datahub.graphql.generated;


/**
 * Create a new tag. Requires the 'Manage Tags' or 'Create Tags' Platform Privilege. If a Tag with the provided ID already exists,
it will be overwritten.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface CreateTagMutationResolver {

    /**
     * Create a new tag. Requires the 'Manage Tags' or 'Create Tags' Platform Privilege. If a Tag with the provided ID already exists,
it will be overwritten.
     */
    String createTag(CreateTagInput input) throws Exception;

}