package com.linkedin.datahub.graphql.generated;

/**
 * A top level Metadata Entity Type
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum EntityType {

    /**
     * A Domain containing Metadata Entities
     */
    DOMAIN("DOMAIN"),
    /**
     * The Dataset Entity
     */
    DATASET("DATASET"),
    /**
     * The CorpUser Entity
     */
    CORP_USER("CORP_USER"),
    /**
     * The CorpGroup Entity
     */
    CORP_GROUP("CORP_GROUP"),
    /**
     * The DataPlatform Entity
     */
    DATA_PLATFORM("DATA_PLATFORM"),
    /**
     * The Dashboard Entity
     */
    DASHBOARD("DASHBOARD"),
    /**
     * The Notebook Entity
     */
    NOTEBOOK("NOTEBOOK"),
    /**
     * The Chart Entity
     */
    CHART("CHART"),
    /**
     * The Data Flow (or Data Pipeline) Entity,
     */
    DATA_FLOW("DATA_FLOW"),
    /**
     * The Data Job (or Data Task) Entity
     */
    DATA_JOB("DATA_JOB"),
    /**
     * The Tag Entity
     */
    TAG("TAG"),
    /**
     * The Glossary Term Entity
     */
    GLOSSARY_TERM("GLOSSARY_TERM"),
    /**
     * The Glossary Node Entity
     */
    GLOSSARY_NODE("GLOSSARY_NODE"),
    /**
     * A container of Metadata Entities
     */
    CONTAINER("CONTAINER"),
    /**
     * The ML Model Entity
     */
    MLMODEL("MLMODEL"),
    /**
     * The MLModelGroup Entity
     */
    MLMODEL_GROUP("MLMODEL_GROUP"),
    /**
     * ML Feature Table Entity
     */
    MLFEATURE_TABLE("MLFEATURE_TABLE"),
    /**
     * The ML Feature Entity
     */
    MLFEATURE("MLFEATURE"),
    /**
     * The ML Primary Key Entity
     */
    MLPRIMARY_KEY("MLPRIMARY_KEY"),
    /**
     * A DataHub Managed Ingestion Source
     */
    INGESTION_SOURCE("INGESTION_SOURCE"),
    /**
     * A DataHub ExecutionRequest
     */
    EXECUTION_REQUEST("EXECUTION_REQUEST"),
    /**
     * A DataHub Assertion
     */
    ASSERTION("ASSERTION"),
    /**
     * An instance of an individual run of a data job or data flow
     */
    DATA_PROCESS_INSTANCE("DATA_PROCESS_INSTANCE"),
    /**
     * Data Platform Instance Entity
     */
    DATA_PLATFORM_INSTANCE("DATA_PLATFORM_INSTANCE"),
    /**
     * A DataHub Access Token
     */
    ACCESS_TOKEN("ACCESS_TOKEN"),
    /**
     * A DataHub Test
     */
    TEST("TEST");

    private final String graphqlName;

    private EntityType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}