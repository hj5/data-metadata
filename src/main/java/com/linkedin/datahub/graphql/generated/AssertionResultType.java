package com.linkedin.datahub.graphql.generated;

/**
 * The result type of an assertion, success or failure.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum AssertionResultType {

    /**
     * The assertion succeeded.
     */
    SUCCESS("SUCCESS"),
    /**
     * The assertion failed.
     */
    FAILURE("FAILURE");

    private final String graphqlName;

    private AssertionResultType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}