package com.linkedin.datahub.graphql.generated;


/**
 * Autocomplete a search query against a specific set of DataHub Entity Types
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface AutoCompleteForMultipleQueryResolver {

    /**
     * Autocomplete a search query against a specific set of DataHub Entity Types
     */
    AutoCompleteMultipleResults autoCompleteForMultiple(AutoCompleteMultipleInput input) throws Exception;

}