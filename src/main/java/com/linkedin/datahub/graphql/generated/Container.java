package com.linkedin.datahub.graphql.generated;


/**
 * A container of other Metadata Entities
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class Container implements java.io.Serializable, Entity {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private DataPlatform platform;
    private Container container;
    private ParentContainersResult parentContainers;
    private ContainerProperties properties;
    private ContainerEditableProperties editableProperties;
    private Ownership ownership;
    private InstitutionalMemory institutionalMemory;
    private GlobalTags tags;
    private GlossaryTerms glossaryTerms;
    private SubTypes subTypes;
    private Domain domain;
    private Deprecation deprecation;
    private DataPlatformInstance dataPlatformInstance;

    public Container() {
    }

    public Container(String urn, EntityType type, DataPlatform platform, Container container, ParentContainersResult parentContainers, ContainerProperties properties, ContainerEditableProperties editableProperties, Ownership ownership, InstitutionalMemory institutionalMemory, GlobalTags tags, GlossaryTerms glossaryTerms, SubTypes subTypes, Domain domain, Deprecation deprecation, DataPlatformInstance dataPlatformInstance) {
        this.urn = urn;
        this.type = type;
        this.platform = platform;
        this.container = container;
        this.parentContainers = parentContainers;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.ownership = ownership;
        this.institutionalMemory = institutionalMemory;
        this.tags = tags;
        this.glossaryTerms = glossaryTerms;
        this.subTypes = subTypes;
        this.domain = domain;
        this.deprecation = deprecation;
        this.dataPlatformInstance = dataPlatformInstance;
    }

    /**
     * The primary key of the container
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the container
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
     * Standardized platform.
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform.
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * Fetch an Entity Container by primary key (urn)
     */
    public Container getContainer() {
        return container;
    }
    /**
     * Fetch an Entity Container by primary key (urn)
     */
    public void setContainer(Container container) {
        this.container = container;
    }

    /**
     * Recursively get the lineage of containers for this entity
     */
    public ParentContainersResult getParentContainers() {
        return parentContainers;
    }
    /**
     * Recursively get the lineage of containers for this entity
     */
    public void setParentContainers(ParentContainersResult parentContainers) {
        this.parentContainers = parentContainers;
    }

    /**
     * Read-only properties that originate in the source data platform
     */
    public ContainerProperties getProperties() {
        return properties;
    }
    /**
     * Read-only properties that originate in the source data platform
     */
    public void setProperties(ContainerProperties properties) {
        this.properties = properties;
    }

    /**
     * Read-write properties that originate in DataHub
     */
    public ContainerEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Read-write properties that originate in DataHub
     */
    public void setEditableProperties(ContainerEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }

    /**
     * Ownership metadata of the dataset
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the dataset
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * References to internal resources related to the dataset
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the dataset
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * Tags used for searching dataset
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * Tags used for searching dataset
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * The structured glossary terms associated with the dataset
     */
    public GlossaryTerms getGlossaryTerms() {
        return glossaryTerms;
    }
    /**
     * The structured glossary terms associated with the dataset
     */
    public void setGlossaryTerms(GlossaryTerms glossaryTerms) {
        this.glossaryTerms = glossaryTerms;
    }

    /**
     * Sub types of the container, e.g. "Database" etc
     */
    public SubTypes getSubTypes() {
        return subTypes;
    }
    /**
     * Sub types of the container, e.g. "Database" etc
     */
    public void setSubTypes(SubTypes subTypes) {
        this.subTypes = subTypes;
    }

    /**
     * The Domain associated with the Dataset
     */
    public Domain getDomain() {
        return domain;
    }
    /**
     * The Domain associated with the Dataset
     */
    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    /**
     * The deprecation status of the container
     */
    public Deprecation getDeprecation() {
        return deprecation;
    }
    /**
     * The deprecation status of the container
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



    public static Container.Builder builder() {
        return new Container.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private DataPlatform platform;
        private Container container;
        private ParentContainersResult parentContainers;
        private ContainerProperties properties;
        private ContainerEditableProperties editableProperties;
        private Ownership ownership;
        private InstitutionalMemory institutionalMemory;
        private GlobalTags tags;
        private GlossaryTerms glossaryTerms;
        private SubTypes subTypes;
        private Domain domain;
        private Deprecation deprecation;
        private DataPlatformInstance dataPlatformInstance;

        public Builder() {
        }

        /**
         * The primary key of the container
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
         * Standardized platform.
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * Fetch an Entity Container by primary key (urn)
         */
        public Builder setContainer(Container container) {
            this.container = container;
            return this;
        }

        /**
         * Recursively get the lineage of containers for this entity
         */
        public Builder setParentContainers(ParentContainersResult parentContainers) {
            this.parentContainers = parentContainers;
            return this;
        }

        /**
         * Read-only properties that originate in the source data platform
         */
        public Builder setProperties(ContainerProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Read-write properties that originate in DataHub
         */
        public Builder setEditableProperties(ContainerEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }

        /**
         * Ownership metadata of the dataset
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * References to internal resources related to the dataset
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * Tags used for searching dataset
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The structured glossary terms associated with the dataset
         */
        public Builder setGlossaryTerms(GlossaryTerms glossaryTerms) {
            this.glossaryTerms = glossaryTerms;
            return this;
        }

        /**
         * Sub types of the container, e.g. "Database" etc
         */
        public Builder setSubTypes(SubTypes subTypes) {
            this.subTypes = subTypes;
            return this;
        }

        /**
         * The Domain associated with the Dataset
         */
        public Builder setDomain(Domain domain) {
            this.domain = domain;
            return this;
        }

        /**
         * The deprecation status of the container
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


        public Container build() {
            return new Container(urn, type, platform, container, parentContainers, properties, editableProperties, ownership, institutionalMemory, tags, glossaryTerms, subTypes, domain, deprecation, dataPlatformInstance);
        }

    }
}
