package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for Dataset
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface DatasetResolver {

    /**
     * Schema metadata of the dataset, available by version number
     */
    SchemaMetadata schemaMetadata(Dataset dataset, Long version) throws Exception;

    /**
     * Statistics about how this Dataset is used
The first parameter, `resource`, is deprecated and no longer needs to be provided
     */
    UsageQueryResult usageStats(Dataset dataset, String resource, TimeRange range) throws Exception;

    /**
     * Profile Stats resource that retrieves the events in a previous unit of time in descending order
If no start or end time are provided, the most recent events will be returned
     */
    @javax.annotation.Nonnull
    java.util.List<DatasetProfile> datasetProfiles(Dataset dataset, Long startTimeMillis, Long endTimeMillis, FilterInput filter, Integer limit) throws Exception;

    /**
     * Operational events for an entity.
     */
    @javax.annotation.Nonnull
    java.util.List<Operation> operations(Dataset dataset, Long startTimeMillis, Long endTimeMillis, FilterInput filter, Integer limit) throws Exception;

    /**
     * Assertions associated with the Dataset
     */
    EntityAssertionsResult assertions(Dataset dataset, Integer start, Integer count) throws Exception;

    /**
     * Edges extending from this entity
     */
    EntityRelationshipsResult relationships(Dataset dataset, RelationshipsInput input) throws Exception;

    /**
     * Edges extending from this entity grouped by direction in the lineage graph
     */
    EntityLineageResult lineage(Dataset dataset, LineageInput input) throws Exception;

    /**
     * Experimental API.
For fetching extra entities that do not have custom UI code yet
     */
    @javax.annotation.Nonnull
    java.util.List<RawAspect> aspects(Dataset dataset, AspectParams input) throws Exception;

    /**
     * History of datajob runs that either produced or consumed this dataset
     */
    DataProcessInstanceResult runs(Dataset dataset, Integer start, Integer count, RelationshipDirection direction) throws Exception;

}