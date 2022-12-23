package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for GlossaryNode
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface GlossaryNodeResolver {

    /**
     * Edges extending from this entity
     */
    EntityRelationshipsResult relationships(GlossaryNode glossaryNode, RelationshipsInput input) throws Exception;

}