package com.linkedin.datahub.graphql.generated;

/**
 * The access level for a Metadata Entity, either public or private
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum AccessLevel {

    /**
     * Publicly available
     */
    PUBLIC("PUBLIC"),
    /**
     * Restricted to a subset of viewers
     */
    PRIVATE("PRIVATE");

    private final String graphqlName;

    private AccessLevel(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}