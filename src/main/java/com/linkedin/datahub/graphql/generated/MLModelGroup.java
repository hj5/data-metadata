package com.linkedin.datahub.graphql.generated;


/**
 * An ML Model Group Metadata Entity
Note that this entity is incubating
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class MLModelGroup implements java.io.Serializable, Entity, EntityWithRelationships {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private DataPlatform platform;
    @javax.annotation.Nonnull
    private FabricType origin;
    private String description;
    private MLModelGroupProperties properties;
    private Ownership ownership;
    private Status status;
    private Deprecation deprecation;
    private DataPlatformInstance dataPlatformInstance;
    private GlobalTags tags;
    private GlossaryTerms glossaryTerms;
    private Domain domain;
    private MLModelGroupEditableProperties editableProperties;

    public MLModelGroup() {
    }

    public MLModelGroup(String urn, EntityType type, String name, DataPlatform platform, FabricType origin, String description, MLModelGroupProperties properties, Ownership ownership, Status status, Deprecation deprecation, DataPlatformInstance dataPlatformInstance, GlobalTags tags, GlossaryTerms glossaryTerms, Domain domain, MLModelGroupEditableProperties editableProperties) {
        this.urn = urn;
        this.type = type;
        this.name = name;
        this.platform = platform;
        this.origin = origin;
        this.description = description;
        this.properties = properties;
        this.ownership = ownership;
        this.status = status;
        this.deprecation = deprecation;
        this.dataPlatformInstance = dataPlatformInstance;
        this.tags = tags;
        this.glossaryTerms = glossaryTerms;
        this.domain = domain;
        this.editableProperties = editableProperties;
    }

    /**
     * The primary key of the ML Model Group
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the ML Model Group
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
     * The display name for the Entity
     */
    public String getName() {
        return name;
    }
    /**
     * The display name for the Entity
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Standardized platform urn where the MLModelGroup is defined
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform urn where the MLModelGroup is defined
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * Fabric type where MLModelGroup belongs to or where it was generated
     */
    public FabricType getOrigin() {
        return origin;
    }
    /**
     * Fabric type where MLModelGroup belongs to or where it was generated
     */
    public void setOrigin(FabricType origin) {
        this.origin = origin;
    }

    /**
     * Human readable description for MLModelGroup
     */
    public String getDescription() {
        return description;
    }
    /**
     * Human readable description for MLModelGroup
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Additional read only properties about the ML Model Group
     */
    public MLModelGroupProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties about the ML Model Group
     */
    public void setProperties(MLModelGroupProperties properties) {
        this.properties = properties;
    }

    /**
     * Ownership metadata of the MLModelGroup
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the MLModelGroup
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
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
    public MLModelGroupEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * An additional set of of read write properties
     */
    public void setEditableProperties(MLModelGroupEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }



    public static MLModelGroup.Builder builder() {
        return new MLModelGroup.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String name;
        private DataPlatform platform;
        private FabricType origin;
        private String description;
        private MLModelGroupProperties properties;
        private Ownership ownership;
        private Status status;
        private Deprecation deprecation;
        private DataPlatformInstance dataPlatformInstance;
        private GlobalTags tags;
        private GlossaryTerms glossaryTerms;
        private Domain domain;
        private MLModelGroupEditableProperties editableProperties;

        public Builder() {
        }

        /**
         * The primary key of the ML Model Group
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
         * The display name for the Entity
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Standardized platform urn where the MLModelGroup is defined
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * Fabric type where MLModelGroup belongs to or where it was generated
         */
        public Builder setOrigin(FabricType origin) {
            this.origin = origin;
            return this;
        }

        /**
         * Human readable description for MLModelGroup
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Additional read only properties about the ML Model Group
         */
        public Builder setProperties(MLModelGroupProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Ownership metadata of the MLModelGroup
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
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
        public Builder setEditableProperties(MLModelGroupEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }


        public MLModelGroup build() {
            return new MLModelGroup(urn, type, name, platform, origin, description, properties, ownership, status, deprecation, dataPlatformInstance, tags, glossaryTerms, domain, editableProperties);
        }

    }
}
