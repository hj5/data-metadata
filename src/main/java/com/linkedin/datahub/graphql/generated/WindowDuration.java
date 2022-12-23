package com.linkedin.datahub.graphql.generated;

/**
 * The duration of a fixed window of time
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum WindowDuration {

    /**
     * A one day window
     */
    DAY("DAY"),
    /**
     * A one week window
     */
    WEEK("WEEK"),
    /**
     * A one month window
     */
    MONTH("MONTH"),
    /**
     * A one year window
     */
    YEAR("YEAR");

    private final String graphqlName;

    private WindowDuration(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}