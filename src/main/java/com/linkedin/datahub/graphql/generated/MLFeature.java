package com.linkedin.datahub.graphql.generated;


/**
 * An ML Feature Metadata Entity Note that this entity is incubating
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class MLFeature implements java.io.Serializable, Entity, EntityWithRelationships {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String featureNamespace;
    private String description;
    private MLFeatureDataType dataType;
    private Ownership ownership;
    @Deprecated
    private MLFeatureProperties featureProperties;
    private MLFeatureProperties properties;
    private InstitutionalMemory institutionalMemory;
    private Status status;
    private Deprecation deprecation;
    private DataPlatformInstance dataPlatformInstance;
    private GlobalTags tags;
    private GlossaryTerms glossaryTerms;
    private Domain domain;
    private MLFeatureEditableProperties editableProperties;

    public MLFeature() {
    }

    public MLFeature(String urn, EntityType type, String name, String featureNamespace, String description, MLFeatureDataType dataType, Ownership ownership, MLFeatureProperties featureProperties, MLFeatureProperties properties, InstitutionalMemory institutionalMemory, Status status, Deprecation deprecation, DataPlatformInstance dataPlatformInstance, GlobalTags tags, GlossaryTerms glossaryTerms, Domain domain, MLFeatureEditableProperties editableProperties) {
        this.urn = urn;
        this.type = type;
        this.name = name;
        this.featureNamespace = featureNamespace;
        this.description = description;
        this.dataType = dataType;
        this.ownership = ownership;
        this.featureProperties = featureProperties;
        this.properties = properties;
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
     * The primary key of the ML Feature
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the ML Feature
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
     * The display name for the ML Feature
     */
    public String getName() {
        return name;
    }
    /**
     * The display name for the ML Feature
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * MLFeature featureNamespace
     */
    public String getFeatureNamespace() {
        return featureNamespace;
    }
    /**
     * MLFeature featureNamespace
     */
    public void setFeatureNamespace(String featureNamespace) {
        this.featureNamespace = featureNamespace;
    }

    /**
     * The description about the ML Feature
     */
    public String getDescription() {
        return description;
    }
    /**
     * The description about the ML Feature
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * MLFeature data type
     */
    public MLFeatureDataType getDataType() {
        return dataType;
    }
    /**
     * MLFeature data type
     */
    public void setDataType(MLFeatureDataType dataType) {
        this.dataType = dataType;
    }

    /**
     * Ownership metadata of the MLFeature
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the MLFeature
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * ModelProperties metadata of the MLFeature
     */
    @Deprecated
    public MLFeatureProperties getFeatureProperties() {
        return featureProperties;
    }
    /**
     * ModelProperties metadata of the MLFeature
     */
    @Deprecated
    public void setFeatureProperties(MLFeatureProperties featureProperties) {
        this.featureProperties = featureProperties;
    }

    /**
     * ModelProperties metadata of the MLFeature
     */
    public MLFeatureProperties getProperties() {
        return properties;
    }
    /**
     * ModelProperties metadata of the MLFeature
     */
    public void setProperties(MLFeatureProperties properties) {
        this.properties = properties;
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
     * Status metadata of the MLFeature
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the MLFeature
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
    public MLFeatureEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * An additional set of of read write properties
     */
    public void setEditableProperties(MLFeatureEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }



    public static MLFeature.Builder builder() {
        return new MLFeature.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String name;
        private String featureNamespace;
        private String description;
        private MLFeatureDataType dataType;
        private Ownership ownership;
        private MLFeatureProperties featureProperties;
        private MLFeatureProperties properties;
        private InstitutionalMemory institutionalMemory;
        private Status status;
        private Deprecation deprecation;
        private DataPlatformInstance dataPlatformInstance;
        private GlobalTags tags;
        private GlossaryTerms glossaryTerms;
        private Domain domain;
        private MLFeatureEditableProperties editableProperties;

        public Builder() {
        }

        /**
         * The primary key of the ML Feature
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
         * The display name for the ML Feature
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * MLFeature featureNamespace
         */
        public Builder setFeatureNamespace(String featureNamespace) {
            this.featureNamespace = featureNamespace;
            return this;
        }

        /**
         * The description about the ML Feature
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * MLFeature data type
         */
        public Builder setDataType(MLFeatureDataType dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * Ownership metadata of the MLFeature
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * ModelProperties metadata of the MLFeature
         */
        @Deprecated
        public Builder setFeatureProperties(MLFeatureProperties featureProperties) {
            this.featureProperties = featureProperties;
            return this;
        }

        /**
         * ModelProperties metadata of the MLFeature
         */
        public Builder setProperties(MLFeatureProperties properties) {
            this.properties = properties;
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
         * Status metadata of the MLFeature
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
        public Builder setEditableProperties(MLFeatureEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }


        public MLFeature build() {
            return new MLFeature(urn, type, name, featureNamespace, description, dataType, ownership, featureProperties, properties, institutionalMemory, status, deprecation, dataPlatformInstance, tags, glossaryTerms, domain, editableProperties);
        }

    }
}
