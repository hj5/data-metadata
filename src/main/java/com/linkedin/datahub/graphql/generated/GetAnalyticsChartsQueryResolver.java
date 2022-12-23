package com.linkedin.datahub.graphql.generated;


/**
 * Retrieves a set of server driven Analytics Charts to render in the UI
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface GetAnalyticsChartsQueryResolver {

    /**
     * Retrieves a set of server driven Analytics Charts to render in the UI
     */
    @javax.annotation.Nonnull
    java.util.List<AnalyticsChartGroup> getAnalyticsCharts() throws Exception;

}