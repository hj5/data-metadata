package com.linkedin.datahub.graphql.generated;


/**
 * A Data Flow Metadata Entity, representing an set of pipelined Data Job or Tasks required
to produce an output Dataset Also known as a Data Pipeline
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class DataFlow implements java.io.Serializable, Entity, EntityWithRelationships {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String orchestrator;
    @javax.annotation.Nonnull
    private String flowId;
    @javax.annotation.Nonnull
    private String cluster;
    private DataFlowProperties properties;
    private DataFlowEditableProperties editableProperties;
    private Ownership ownership;
    private GlobalTags tags;
    private Status status;
    private Deprecation deprecation;
    private InstitutionalMemory institutionalMemory;
    private GlossaryTerms glossaryTerms;
    private Domain domain;
    private DataPlatformInstance dataPlatformInstance;
    @Deprecated
    private DataFlowInfo info;
    @Deprecated
    private GlobalTags globalTags;
    @Deprecated
    private DataFlowDataJobsRelationships dataJobs;
    @javax.annotation.Nonnull
    private DataPlatform platform;

    public DataFlow() {
    }

    public DataFlow(String urn, EntityType type, String orchestrator, String flowId, String cluster, DataFlowProperties properties, DataFlowEditableProperties editableProperties, Ownership ownership, GlobalTags tags, Status status, Deprecation deprecation, InstitutionalMemory institutionalMemory, GlossaryTerms glossaryTerms, Domain domain, DataPlatformInstance dataPlatformInstance, DataFlowInfo info, GlobalTags globalTags, DataFlowDataJobsRelationships dataJobs, DataPlatform platform) {
        this.urn = urn;
        this.type = type;
        this.orchestrator = orchestrator;
        this.flowId = flowId;
        this.cluster = cluster;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.ownership = ownership;
        this.tags = tags;
        this.status = status;
        this.deprecation = deprecation;
        this.institutionalMemory = institutionalMemory;
        this.glossaryTerms = glossaryTerms;
        this.domain = domain;
        this.dataPlatformInstance = dataPlatformInstance;
        this.info = info;
        this.globalTags = globalTags;
        this.dataJobs = dataJobs;
        this.platform = platform;
    }

    /**
     * The primary key of a Data Flow
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of a Data Flow
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * A standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * A standard Entity Type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * Workflow orchestrator ei Azkaban, Airflow
     */
    public String getOrchestrator() {
        return orchestrator;
    }
    /**
     * Workflow orchestrator ei Azkaban, Airflow
     */
    public void setOrchestrator(String orchestrator) {
        this.orchestrator = orchestrator;
    }

    /**
     * Id of the flow
     */
    public String getFlowId() {
        return flowId;
    }
    /**
     * Id of the flow
     */
    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    /**
     * Cluster of the flow
     */
    public String getCluster() {
        return cluster;
    }
    /**
     * Cluster of the flow
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * Additional read only properties about a Data flow
     */
    public DataFlowProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties about a Data flow
     */
    public void setProperties(DataFlowProperties properties) {
        this.properties = properties;
    }

    /**
     * Additional read write properties about a Data Flow
     */
    public DataFlowEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Additional read write properties about a Data Flow
     */
    public void setEditableProperties(DataFlowEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }

    /**
     * Ownership metadata of the flow
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the flow
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * The tags associated with the dataflow
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * The tags associated with the dataflow
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * Status metadata of the dataflow
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the dataflow
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * The deprecation status of the Data Flow
     */
    public Deprecation getDeprecation() {
        return deprecation;
    }
    /**
     * The deprecation status of the Data Flow
     */
    public void setDeprecation(Deprecation deprecation) {
        this.deprecation = deprecation;
    }

    /**
     * References to internal resources related to the dashboard
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the dashboard
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * The structured glossary terms associated with the dashboard
     */
    public GlossaryTerms getGlossaryTerms() {
        return glossaryTerms;
    }
    /**
     * The structured glossary terms associated with the dashboard
     */
    public void setGlossaryTerms(GlossaryTerms glossaryTerms) {
        this.glossaryTerms = glossaryTerms;
    }

    /**
     * The Domain associated with the DataFlow
     */
    public Domain getDomain() {
        return domain;
    }
    /**
     * The Domain associated with the DataFlow
     */
    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    /**
     * The specific instance of the data platform that this entity belongs to
     */
    public DataPlatformInstance getDataPlatformInstance() {
        return dataPlatformInstance;
    }
    /**
     * The specific instance of the data platform that this entity belongs to
     */
    public void setDataPlatformInstance(DataPlatformInstance dataPlatformInstance) {
        this.dataPlatformInstance = dataPlatformInstance;
    }

    /**
     * Deprecated, use properties field instead
Additional read only information about a Data flow
     */
    @Deprecated
    public DataFlowInfo getInfo() {
        return info;
    }
    /**
     * Deprecated, use properties field instead
Additional read only information about a Data flow
     */
    @Deprecated
    public void setInfo(DataFlowInfo info) {
        this.info = info;
    }

    /**
     * Deprecated, use tags field instead
The structured tags associated with the dataflow
     */
    @Deprecated
    public GlobalTags getGlobalTags() {
        return globalTags;
    }
    /**
     * Deprecated, use tags field instead
The structured tags associated with the dataflow
     */
    @Deprecated
    public void setGlobalTags(GlobalTags globalTags) {
        this.globalTags = globalTags;
    }

    /**
     * Deprecated, use relationship IsPartOf instead
Data Jobs
     */
    @Deprecated
    public DataFlowDataJobsRelationships getDataJobs() {
        return dataJobs;
    }
    /**
     * Deprecated, use relationship IsPartOf instead
Data Jobs
     */
    @Deprecated
    public void setDataJobs(DataFlowDataJobsRelationships dataJobs) {
        this.dataJobs = dataJobs;
    }

    /**
     * Standardized platform urn where the datflow is defined
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform urn where the datflow is defined
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }



    public static DataFlow.Builder builder() {
        return new DataFlow.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String orchestrator;
        private String flowId;
        private String cluster;
        private DataFlowProperties properties;
        private DataFlowEditableProperties editableProperties;
        private Ownership ownership;
        private GlobalTags tags;
        private Status status;
        private Deprecation deprecation;
        private InstitutionalMemory institutionalMemory;
        private GlossaryTerms glossaryTerms;
        private Domain domain;
        private DataPlatformInstance dataPlatformInstance;
        private DataFlowInfo info;
        private GlobalTags globalTags;
        private DataFlowDataJobsRelationships dataJobs;
        private DataPlatform platform;

        public Builder() {
        }

        /**
         * The primary key of a Data Flow
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * A standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * Workflow orchestrator ei Azkaban, Airflow
         */
        public Builder setOrchestrator(String orchestrator) {
            this.orchestrator = orchestrator;
            return this;
        }

        /**
         * Id of the flow
         */
        public Builder setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }

        /**
         * Cluster of the flow
         */
        public Builder setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }

        /**
         * Additional read only properties about a Data flow
         */
        public Builder setProperties(DataFlowProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Additional read write properties about a Data Flow
         */
        public Builder setEditableProperties(DataFlowEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }

        /**
         * Ownership metadata of the flow
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * The tags associated with the dataflow
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Status metadata of the dataflow
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * The deprecation status of the Data Flow
         */
        public Builder setDeprecation(Deprecation deprecation) {
            this.deprecation = deprecation;
            return this;
        }

        /**
         * References to internal resources related to the dashboard
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * The structured glossary terms associated with the dashboard
         */
        public Builder setGlossaryTerms(GlossaryTerms glossaryTerms) {
            this.glossaryTerms = glossaryTerms;
            return this;
        }

        /**
         * The Domain associated with the DataFlow
         */
        public Builder setDomain(Domain domain) {
            this.domain = domain;
            return this;
        }

        /**
         * The specific instance of the data platform that this entity belongs to
         */
        public Builder setDataPlatformInstance(DataPlatformInstance dataPlatformInstance) {
            this.dataPlatformInstance = dataPlatformInstance;
            return this;
        }

        /**
         * Deprecated, use properties field instead
Additional read only information about a Data flow
         */
        @Deprecated
        public Builder setInfo(DataFlowInfo info) {
            this.info = info;
            return this;
        }

        /**
         * Deprecated, use tags field instead
The structured tags associated with the dataflow
         */
        @Deprecated
        public Builder setGlobalTags(GlobalTags globalTags) {
            this.globalTags = globalTags;
            return this;
        }

        /**
         * Deprecated, use relationship IsPartOf instead
Data Jobs
         */
        @Deprecated
        public Builder setDataJobs(DataFlowDataJobsRelationships dataJobs) {
            this.dataJobs = dataJobs;
            return this;
        }

        /**
         * Standardized platform urn where the datflow is defined
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }


        public DataFlow build() {
            return new DataFlow(urn, type, orchestrator, flowId, cluster, properties, editableProperties, ownership, tags, status, deprecation, institutionalMemory, glossaryTerms, domain, dataPlatformInstance, info, globalTags, dataJobs, platform);
        }

    }
}
