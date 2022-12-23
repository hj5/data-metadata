package com.linkedin.datahub.graphql.generated;


/**
 * Resolver for Assertion
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface AssertionResolver {

    /**
     * Lifecycle events detailing individual runs of this assertion. If startTimeMillis & endTimeMillis are not provided, the most
recent events will be returned.
     */
    AssertionRunEventsResult runEvents(Assertion assertion, AssertionRunStatus status, Long startTimeMillis, Long endTimeMillis, FilterInput filter, Integer limit) throws Exception;

    /**
     * Edges extending from this entity
     */
    EntityRelationshipsResult relationships(Assertion assertion, RelationshipsInput input) throws Exception;

    /**
     * Edges extending from this entity grouped by direction in the lineage graph
     */
    EntityLineageResult lineage(Assertion assertion, LineageInput input) throws Exception;

}