package com.linkedin.datahub.graphql.generated;

/**
 * A type of DataHub Access Token.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum AccessTokenType {

    /**
     * Generates a personal access token
     */
    PERSONAL("PERSONAL");

    private final String graphqlName;

    private AccessTokenType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}