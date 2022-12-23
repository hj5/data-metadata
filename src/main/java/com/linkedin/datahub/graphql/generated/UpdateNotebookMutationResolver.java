package com.linkedin.datahub.graphql.generated;


/**
 * Update the metadata about a particular Notebook
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface UpdateNotebookMutationResolver {

    /**
     * Update the metadata about a particular Notebook
     */
    Notebook updateNotebook(String urn, NotebookUpdateInput input) throws Exception;

}