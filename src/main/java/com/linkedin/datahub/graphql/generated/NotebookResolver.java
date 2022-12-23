package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for Notebook
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface NotebookResolver {

    /**
     * Edges extending from this entity
     */
    EntityRelationshipsResult relationships(Notebook notebook, RelationshipsInput input) throws Exception;

}