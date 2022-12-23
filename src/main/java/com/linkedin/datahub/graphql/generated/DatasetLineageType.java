package com.linkedin.datahub.graphql.generated;

/**
 * Deprecated
The type of an edge between two Datasets
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum DatasetLineageType {

    /**
     * Direct copy without modification
     */
    COPY("COPY"),
    /**
     * Transformed dataset
     */
    TRANSFORMED("TRANSFORMED"),
    /**
     * Represents a view defined on the sources
     */
    VIEW("VIEW");

    private final String graphqlName;

    private DatasetLineageType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}