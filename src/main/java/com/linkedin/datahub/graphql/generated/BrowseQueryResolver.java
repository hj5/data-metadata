package com.linkedin.datahub.graphql.generated;


/**
 * Hierarchically browse a specific type of DataHub Entity by path
Used by explore in the UI
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface BrowseQueryResolver {

    /**
     * Hierarchically browse a specific type of DataHub Entity by path
Used by explore in the UI
     */
    BrowseResults browse(BrowseInput input) throws Exception;

}