package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for GlossaryTerm
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface GlossaryTermResolver {

    /**
     * Edges extending from this entity
     */
    EntityRelationshipsResult relationships(GlossaryTerm glossaryTerm, RelationshipsInput input) throws Exception;

    /**
     * Schema metadata of the dataset
     */
    SchemaMetadata schemaMetadata(GlossaryTerm glossaryTerm, Long version) throws Exception;

}