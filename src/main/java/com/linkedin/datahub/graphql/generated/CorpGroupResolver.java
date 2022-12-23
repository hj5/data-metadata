package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for CorpGroup
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface CorpGroupResolver {

    /**
     * Granular API for querying edges extending from this entity
     */
    EntityRelationshipsResult relationships(CorpGroup corpGroup, RelationshipsInput input) throws Exception;

}