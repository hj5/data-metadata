package com.linkedin.datahub.graphql.generated;

/**
 * The result of the data process run
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum DataProcessInstanceRunResultType {

    /**
     * The run finished successfully
     */
    SUCCESS("SUCCESS"),
    /**
     * The run finished in failure
     */
    FAILURE("FAILURE"),
    /**
     * The run was skipped
     */
    SKIPPED("SKIPPED");

    private final String graphqlName;

    private DataProcessInstanceRunResultType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}