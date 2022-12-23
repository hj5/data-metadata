package com.linkedin.datahub.graphql.generated;

/**
 * A type of Metadata Entity sub resource
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum SubResourceType {

    /**
     * A Dataset field or column
     */
    DATASET_FIELD("DATASET_FIELD");

    private final String graphqlName;

    private SubResourceType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}