package com.linkedin.datahub.graphql.generated;


/**
 * An ML Primary Key Entity Note that this entity is incubating
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class MLPrimaryKey implements java.io.Serializable, Entity, EntityWithRelationships {

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
    private MLPrimaryKeyProperties properties;
    @Deprecated
    private MLPrimaryKeyProperties primaryKeyProperties;
    private Ownership ownership;
    private InstitutionalMemory institutionalMemory;
    private Status status;
    private Deprecation deprecation;
    private DataPlatformInstance dataPlatformInstance;
    private GlobalTags tags;
    private GlossaryTerms glossaryTerms;
    private Domain domain;
    private MLPrimaryKeyEditableProperties editableProperties;

    public MLPrimaryKey() {
    }

    public MLPrimaryKey(String urn, EntityType type, String name, String featureNamespace, String description, MLFeatureDataType dataType, MLPrimaryKeyProperties properties, MLPrimaryKeyProperties primaryKeyProperties, Ownership ownership, InstitutionalMemory institutionalMemory, Status status, Deprecation deprecation, DataPlatformInstance dataPlatformInstance, GlobalTags tags, GlossaryTerms glossaryTerms, Domain domain, MLPrimaryKeyEditableProperties editableProperties) {
        this.urn = urn;
        this.type = type;
        this.name = name;
        this.featureNamespace = featureNamespace;
        this.description = description;
        this.dataType = dataType;
        this.properties = properties;
        this.primaryKeyProperties = primaryKeyProperties;
        this.ownership = ownership;
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
     * The primary key of the ML Primary Key
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the ML Primary Key
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
     * MLPrimaryKey featureNamespace
     */
    public String getFeatureNamespace() {
        return featureNamespace;
    }
    /**
     * MLPrimaryKey featureNamespace
     */
    public void setFeatureNamespace(String featureNamespace) {
        this.featureNamespace = featureNamespace;
    }

    /**
     * MLPrimaryKey description
     */
    public String getDescription() {
        return description;
    }
    /**
     * MLPrimaryKey description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * MLPrimaryKey data type
     */
    public MLFeatureDataType getDataType() {
        return dataType;
    }
    /**
     * MLPrimaryKey data type
     */
    public void setDataType(MLFeatureDataType dataType) {
        this.dataType = dataType;
    }

    /**
     * Additional read only properties of the ML Primary Key
     */
    public MLPrimaryKeyProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties of the ML Primary Key
     */
    public void setProperties(MLPrimaryKeyProperties properties) {
        this.properties = properties;
    }

    /**
     * Deprecated, use properties field instead
MLPrimaryKeyProperties
     */
    @Deprecated
    public MLPrimaryKeyProperties getPrimaryKeyProperties() {
        return primaryKeyProperties;
    }
    /**
     * Deprecated, use properties field instead
MLPrimaryKeyProperties
     */
    @Deprecated
    public void setPrimaryKeyProperties(MLPrimaryKeyProperties primaryKeyProperties) {
        this.primaryKeyProperties = primaryKeyProperties;
    }

    /**
     * Ownership metadata of the MLPrimaryKey
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the MLPrimaryKey
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * References to internal resources related to the MLPrimaryKey
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the MLPrimaryKey
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * Status metadata of the MLPrimaryKey
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the MLPrimaryKey
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
    public MLPrimaryKeyEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * An additional set of of read write properties
     */
    public void setEditableProperties(MLPrimaryKeyEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }



    public static MLPrimaryKey.Builder builder() {
        return new MLPrimaryKey.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String name;
        private String featureNamespace;
        private String description;
        private MLFeatureDataType dataType;
        private MLPrimaryKeyProperties properties;
        private MLPrimaryKeyProperties primaryKeyProperties;
        private Ownership ownership;
        private InstitutionalMemory institutionalMemory;
        private Status status;
        private Deprecation deprecation;
        private DataPlatformInstance dataPlatformInstance;
        private GlobalTags tags;
        private GlossaryTerms glossaryTerms;
        private Domain domain;
        private MLPrimaryKeyEditableProperties editableProperties;

        public Builder() {
        }

        /**
         * The primary key of the ML Primary Key
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
         * MLPrimaryKey featureNamespace
         */
        public Builder setFeatureNamespace(String featureNamespace) {
            this.featureNamespace = featureNamespace;
            return this;
        }

        /**
         * MLPrimaryKey description
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * MLPrimaryKey data type
         */
        public Builder setDataType(MLFeatureDataType dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * Additional read only properties of the ML Primary Key
         */
        public Builder setProperties(MLPrimaryKeyProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Deprecated, use properties field instead
MLPrimaryKeyProperties
         */
        @Deprecated
        public Builder setPrimaryKeyProperties(MLPrimaryKeyProperties primaryKeyProperties) {
            this.primaryKeyProperties = primaryKeyProperties;
            return this;
        }

        /**
         * Ownership metadata of the MLPrimaryKey
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * References to internal resources related to the MLPrimaryKey
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * Status metadata of the MLPrimaryKey
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
        public Builder setEditableProperties(MLPrimaryKeyEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }


        public MLPrimaryKey build() {
            return new MLPrimaryKey(urn, type, name, featureNamespace, description, dataType, properties, primaryKeyProperties, ownership, institutionalMemory, status, deprecation, dataPlatformInstance, tags, glossaryTerms, domain, editableProperties);
        }

    }
}
