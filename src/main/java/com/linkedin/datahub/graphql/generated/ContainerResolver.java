package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for Container
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface ContainerResolver {

    /**
     * Children entities inside of the Container
     */
    SearchResults entities(Container container, ContainerEntitiesInput input) throws Exception;

    /**
     * Edges extending from this entity
     */
    EntityRelationshipsResult relationships(Container container, RelationshipsInput input) throws Exception;

}