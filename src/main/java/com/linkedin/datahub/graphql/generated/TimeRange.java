package com.linkedin.datahub.graphql.generated;

/**
 * A time range used in fetching Dataset Usage statistics
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum TimeRange {

    /**
     * Last day
     */
    DAY("DAY"),
    /**
     * Last week
     */
    WEEK("WEEK"),
    /**
     * Last month
     */
    MONTH("MONTH"),
    /**
     * Last quarter
     */
    QUARTER("QUARTER"),
    /**
     * Last year
     */
    YEAR("YEAR"),
    /**
     * All time
     */
    ALL("ALL");

    private final String graphqlName;

    private TimeRange(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}