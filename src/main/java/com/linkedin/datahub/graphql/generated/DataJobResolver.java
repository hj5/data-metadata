package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for DataJob
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface DataJobResolver {

    /**
     * Granular API for querying edges extending from this entity
     */
    EntityRelationshipsResult relationships(DataJob dataJob, RelationshipsInput input) throws Exception;

    /**
     * Edges extending from this entity grouped by direction in the lineage graph
     */
    EntityLineageResult lineage(DataJob dataJob, LineageInput input) throws Exception;

    /**
     * History of runs of this task
     */
    DataProcessInstanceResult runs(DataJob dataJob, Integer start, Integer count) throws Exception;

}