package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for MLPrimaryKey
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface MLPrimaryKeyResolver {

    /**
     * Granular API for querying edges extending from this entity
     */
    EntityRelationshipsResult relationships(MLPrimaryKey mLPrimaryKey, RelationshipsInput input) throws Exception;

    /**
     * Edges extending from this entity grouped by direction in the lineage graph
     */
    EntityLineageResult lineage(MLPrimaryKey mLPrimaryKey, LineageInput input) throws Exception;

}