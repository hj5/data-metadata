package com.linkedin.datahub.graphql.generated;


/**
 * Retrieves a set of charts regarding the ingested metadata
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface GetMetadataAnalyticsChartsQueryResolver {

    /**
     * Retrieves a set of charts regarding the ingested metadata
     */
    @javax.annotation.Nonnull
    java.util.List<AnalyticsChartGroup> getMetadataAnalyticsCharts(MetadataAnalyticsInput input) throws Exception;

}