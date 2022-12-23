package com.linkedin.datahub.graphql.generated;


/**
 * Full text search against a specific DataHub Entity Type
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface SearchQueryResolver {

    /**
     * Full text search against a specific DataHub Entity Type
     */
    SearchResults search(SearchInput input) throws Exception;

}