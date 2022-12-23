package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for Domain
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface DomainResolver {

    /**
     * Children entities inside of the Domain
     */
    SearchResults entities(Domain domain, DomainEntitiesInput input) throws Exception;

    /**
     * Edges extending from this entity
     */
    EntityRelationshipsResult relationships(Domain domain, RelationshipsInput input) throws Exception;

}