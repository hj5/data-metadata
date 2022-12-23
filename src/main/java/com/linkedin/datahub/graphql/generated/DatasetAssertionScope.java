package com.linkedin.datahub.graphql.generated;

/**
 * The scope that a Dataset-level assertion applies to.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum DatasetAssertionScope {

    /**
     * Assertion applies to columns of a dataset.
     */
    DATASET_COLUMN("DATASET_COLUMN"),
    /**
     * Assertion applies to rows of a dataset.
     */
    DATASET_ROWS("DATASET_ROWS"),
    /**
     * Assertion applies to schema of a dataset.
     */
    DATASET_SCHEMA("DATASET_SCHEMA"),
    /**
     * The scope of an assertion is unknown.
     */
    UNKNOWN("UNKNOWN");

    private final String graphqlName;

    private DatasetAssertionScope(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}