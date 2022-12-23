package com.linkedin.datahub.graphql.generated;

/**
 * Type of the scenario requesting recommendation
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum ScenarioType {

    /**
     * Recommendations to show on the users home page
     */
    HOME("HOME"),
    /**
     * Recommendations to show on the search results page
     */
    SEARCH_RESULTS("SEARCH_RESULTS"),
    /**
     * Recommendations to show on an Entity Profile page
     */
    ENTITY_PROFILE("ENTITY_PROFILE"),
    /**
     * Recommendations to show on the search bar when clicked
     */
    SEARCH_BAR("SEARCH_BAR");

    private final String graphqlName;

    private ScenarioType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}