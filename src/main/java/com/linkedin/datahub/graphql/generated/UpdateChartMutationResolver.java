package com.linkedin.datahub.graphql.generated;


/**
 * Update the metadata about a particular Chart
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface UpdateChartMutationResolver {

    /**
     * Update the metadata about a particular Chart
     */
    Chart updateChart(String urn, ChartUpdateInput input) throws Exception;

}