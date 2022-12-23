package com.linkedin.datahub.graphql.generated;


/**
 * Retrieve the browse paths corresponding to an entity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface BrowsePathsQueryResolver {

    /**
     * Retrieve the browse paths corresponding to an entity
     */
    @javax.annotation.Nonnull
    java.util.List<BrowsePath> browsePaths(BrowsePathsInput input) throws Exception;

}