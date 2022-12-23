package com.linkedin.datahub.graphql.generated;

/**
 * Direction between two nodes in the lineage graph
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum LineageDirection {

    /**
     * Upstream, or left-to-right in the lineage visualization
     */
    UPSTREAM("UPSTREAM"),
    /**
     * Downstream, or right-to-left in the lineage visualization
     */
    DOWNSTREAM("DOWNSTREAM");

    private final String graphqlName;

    private LineageDirection(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}