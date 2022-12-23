package com.linkedin.datahub.graphql.generated;

/**
 * The state of an assertion run, as defined within an Assertion Run Event.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum AssertionRunStatus {

    /**
     * An assertion run has completed.
     */
    COMPLETE("COMPLETE");

    private final String graphqlName;

    private AssertionRunStatus(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}