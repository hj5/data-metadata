package com.linkedin.datahub.graphql.generated;


/**
 * Autocomplete a search query against a specific DataHub Entity Type
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface AutoCompleteQueryResolver {

    /**
     * Autocomplete a search query against a specific DataHub Entity Type
     */
    AutoCompleteResults autoComplete(AutoCompleteInput input) throws Exception;

}