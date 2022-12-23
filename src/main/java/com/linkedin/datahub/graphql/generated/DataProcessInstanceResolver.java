package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for DataProcessInstance
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface DataProcessInstanceResolver {

    /**
     * The history of state changes for the run
     */
    java.util.List<DataProcessRunEvent> state(DataProcessInstance dataProcessInstance, Long startTimeMillis, Long endTimeMillis, Integer limit) throws Exception;

    /**
     * Edges extending from this entity.
In the UI, used for inputs, outputs and parentTemplate
     */
    EntityRelationshipsResult relationships(DataProcessInstance dataProcessInstance, RelationshipsInput input) throws Exception;

    /**
     * Edges extending from this entity grouped by direction in the lineage graph
     */
    EntityLineageResult lineage(DataProcessInstance dataProcessInstance, LineageInput input) throws Exception;

}