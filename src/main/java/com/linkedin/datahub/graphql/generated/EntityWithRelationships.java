package com.linkedin.datahub.graphql.generated;


/**
 * Deprecated, use relationships field instead
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface EntityWithRelationships extends Entity{

    /**
     * A primary key associated with the Metadata Entity
     */
    @javax.annotation.Nonnull
    String getUrn();

    /**
     * A standard Entity Type
     */
    @javax.annotation.Nonnull
    EntityType getType();

}