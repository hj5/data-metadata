package com.linkedin.datahub.graphql.generated;

/**
 * The top-level assertion type. Currently single Dataset assertions are the only type supported.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum AssertionType {

    DATASET("DATASET");

    private final String graphqlName;

    private AssertionType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}