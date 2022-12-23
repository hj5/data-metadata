package com.linkedin.datahub.graphql.generated;

/**
 * Match condition
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum PolicyMatchCondition {

    /**
     * Whether the field matches the value
     */
    EQUALS("EQUALS");

    private final String graphqlName;

    private PolicyMatchCondition(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}