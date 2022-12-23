package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for Entity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface EntityResolver {

    /**
     * List of relationships between the source Entity and some destination entities with a given types
     */
    EntityRelationshipsResult relationships(Entity entity, RelationshipsInput input) throws Exception;

}