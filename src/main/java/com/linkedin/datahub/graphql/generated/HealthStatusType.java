package com.linkedin.datahub.graphql.generated;

/**
 * The type of the health status
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum HealthStatusType {

    /**
     * Assertions status
     */
    ASSERTIONS("ASSERTIONS");

    private final String graphqlName;

    private HealthStatusType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}