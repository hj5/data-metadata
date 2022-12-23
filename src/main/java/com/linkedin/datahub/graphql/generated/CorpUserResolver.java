package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for CorpUser
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface CorpUserResolver {

    /**
     * Granular API for querying edges extending from this entity
     */
    EntityRelationshipsResult relationships(CorpUser corpUser, RelationshipsInput input) throws Exception;

}