package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for Tag
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface TagResolver {

    /**
     * Granular API for querying edges extending from this entity
     */
    EntityRelationshipsResult relationships(Tag tag, RelationshipsInput input) throws Exception;

}