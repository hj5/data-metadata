package com.linkedin.datahub.graphql.generated;

/**
 * The status of the data process instance
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum DataProcessRunStatus {

    /**
     * The data process instance has started but not completed
     */
    STARTED("STARTED"),
    /**
     * The data process instance has completed
     */
    COMPLETE("COMPLETE");

    private final String graphqlName;

    private DataProcessRunStatus(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}