package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for DataPlatform
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface DataPlatformResolver {

    /**
     * Edges extending from this entity
     */
    EntityRelationshipsResult relationships(DataPlatform dataPlatform, RelationshipsInput input) throws Exception;

}