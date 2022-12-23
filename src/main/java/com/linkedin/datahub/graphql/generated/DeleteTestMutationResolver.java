package com.linkedin.datahub.graphql.generated;


/**
 * Create an existing test - note that this will NOT delete dangling pointers until the next execution of the test.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface DeleteTestMutationResolver {

    /**
     * Create an existing test - note that this will NOT delete dangling pointers until the next execution of the test.
     */
    Boolean deleteTest(String urn) throws Exception;

}