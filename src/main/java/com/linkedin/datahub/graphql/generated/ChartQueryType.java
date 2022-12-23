package com.linkedin.datahub.graphql.generated;

/**
 * The type of the Chart Query
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum ChartQueryType {

    /**
     * Standard ANSI SQL
     */
    SQL("SQL"),
    /**
     * LookML
     */
    LOOKML("LOOKML");

    private final String graphqlName;

    private ChartQueryType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}