package com.linkedin.datahub.graphql.generated;


/**
 * An ML Feature Table Entity Note that this entity is incubating
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class MLFeatureTable implements java.io.Serializable, Entity, EntityWithRelationships {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private DataPlatform platform;
    private String description;
    private Ownership ownership;
    private MLFeatureTableProperties properties;
    @Deprecated
    private MLFeatureTableProperties featureTableProperties;
    private InstitutionalMemory institutionalMemory;
    private Status status;
    private Deprecation deprecation;
    private DataPlatformInstance dataPlatformInstance;
    private GlobalTags tags;
    private GlossaryTerms glossaryTerms;
    private Domain domain;
    private MLFeatureTableEditableProperties editableProperties;

    public MLFeatureTable() {
    }

    public MLFeatureTable(String urn, EntityType type, String name, DataPlatform platform, String description, Ownership ownership, MLFeatureTableProperties properties, MLFeatureTableProperties featureTableProperties, InstitutionalMemory institutionalMemory, Status status, Deprecation deprecation, DataPlatformInstance dataPlatformInstance, GlobalTags tags, GlossaryTerms glossaryTerms, Domain domain, MLFeatureTableEditableProperties editableProperties) {
        this.urn = urn;
        this.type = type;
        this.name = name;
        this.platform = platform;
        this.description = description;
        this.ownership = ownership;
        this.properties = properties;
        this.featureTableProperties = featureTableProperties;
        this.institutionalMemory = institutionalMemory;
        this.status = status;
        this.deprecation = deprecation;
        this.dataPlatformInstance = dataPlatformInstance;
        this.tags = tags;
        this.glossaryTerms = glossaryTerms;
        this.domain = domain;
        this.editableProperties = editableProperties;
    }

    /**
     * The primary key of the ML Feature Table
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the ML Feature Table
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
     * The display name
     */
    public String getName() {
        return name;
    }
    /**
     * The display name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Standardized platform urn where the MLFeatureTable is defined
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform urn where the MLFeatureTable is defined
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * MLFeatureTable description
     */
    public String getDescription() {
        return description;
    }
    /**
     * MLFeatureTable description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Ownership metadata of the MLFeatureTable
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the MLFeatureTable
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * Additional read only properties associated the the ML Feature Table
     */
    public MLFeatureTableProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties associated the the ML Feature Table
     */
    public void setProperties(MLFeatureTableProperties properties) {
        this.properties = properties;
    }

    /**
     * Deprecated, use properties field instead
ModelProperties metadata of the MLFeature
     */
    @Deprecated
    public MLFeatureTableProperties getFeatureTableProperties() {
        return featureTableProperties;
    }
    /**
     * Deprecated, use properties field instead
ModelProperties metadata of the MLFeature
     */
    @Deprecated
    public void setFeatureTableProperties(MLFeatureTableProperties featureTableProperties) {
        this.featureTableProperties = featureTableProperties;
    }

    /**
     * References to internal resources related to the MLFeature
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the MLFeature
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * Status metadata of the MLFeatureTable
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the MLFeatureTable
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Deprecation
     */
    public Deprecation getDeprecation() {
        return deprecation;
    }
    /**
     * Deprecation
     */
    public void setDeprecation(Deprecation deprecation) {
        this.deprecation = deprecation;
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
     * Tags applied to entity
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * Tags applied to entity
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * The structured glossary terms associated with the entity
     */
    public GlossaryTerms getGlossaryTerms() {
        return glossaryTerms;
    }
    /**
     * The structured glossary terms associated with the entity
     */
    public void setGlossaryTerms(GlossaryTerms glossaryTerms) {
        this.glossaryTerms = glossaryTerms;
    }

    /**
     * The Domain associated with the entity
     */
    public Domain getDomain() {
        return domain;
    }
    /**
     * The Domain associated with the entity
     */
    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    /**
     * An additional set of of read write properties
     */
    public MLFeatureTableEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * An additional set of of read write properties
     */
    public void setEditableProperties(MLFeatureTableEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }



    public static MLFeatureTable.Builder builder() {
        return new MLFeatureTable.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String name;
        private DataPlatform platform;
        private String description;
        private Ownership ownership;
        private MLFeatureTableProperties properties;
        private MLFeatureTableProperties featureTableProperties;
        private InstitutionalMemory institutionalMemory;
        private Status status;
        private Deprecation deprecation;
        private DataPlatformInstance dataPlatformInstance;
        private GlobalTags tags;
        private GlossaryTerms glossaryTerms;
        private Domain domain;
        private MLFeatureTableEditableProperties editableProperties;

        public Builder() {
        }

        /**
         * The primary key of the ML Feature Table
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
         * The display name
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Standardized platform urn where the MLFeatureTable is defined
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * MLFeatureTable description
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Ownership metadata of the MLFeatureTable
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * Additional read only properties associated the the ML Feature Table
         */
        public Builder setProperties(MLFeatureTableProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Deprecated, use properties field instead
ModelProperties metadata of the MLFeature
         */
        @Deprecated
        public Builder setFeatureTableProperties(MLFeatureTableProperties featureTableProperties) {
            this.featureTableProperties = featureTableProperties;
            return this;
        }

        /**
         * References to internal resources related to the MLFeature
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * Status metadata of the MLFeatureTable
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * Deprecation
         */
        public Builder setDeprecation(Deprecation deprecation) {
            this.deprecation = deprecation;
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
         * Tags applied to entity
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The structured glossary terms associated with the entity
         */
        public Builder setGlossaryTerms(GlossaryTerms glossaryTerms) {
            this.glossaryTerms = glossaryTerms;
            return this;
        }

        /**
         * The Domain associated with the entity
         */
        public Builder setDomain(Domain domain) {
            this.domain = domain;
            return this;
        }

        /**
         * An additional set of of read write properties
         */
        public Builder setEditableProperties(MLFeatureTableEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }


        public MLFeatureTable build() {
            return new MLFeatureTable(urn, type, name, platform, description, ownership, properties, featureTableProperties, institutionalMemory, status, deprecation, dataPlatformInstance, tags, glossaryTerms, domain, editableProperties);
        }

    }
}
