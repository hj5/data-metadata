package com.linkedin.datahub.graphql.generated;

/**
 * Enum of types of changes
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum ChangeOperationType {

    /**
     * When an element is added
     */
    ADD("ADD"),
    /**
     * When an element is modified
     */
    MODIFY("MODIFY"),
    /**
     * When an element is removed
     */
    REMOVE("REMOVE");

    private final String graphqlName;

    private ChangeOperationType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}