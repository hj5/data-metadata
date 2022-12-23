package com.linkedin.datahub.graphql.generated;


/**
 * A Dataset entity, which encompasses Relational Tables, Document store collections, streaming topics, and other sets of data having an independent lifecycle
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class Dataset implements java.io.Serializable, Entity, EntityWithRelationships {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private DataPlatform platform;
    private Container container;
    private ParentContainersResult parentContainers;
    @javax.annotation.Nonnull
    private String name;
    private DatasetProperties properties;
    private DatasetEditableProperties editableProperties;
    private Ownership ownership;
    private Deprecation deprecation;
    private InstitutionalMemory institutionalMemory;
    private EditableSchemaMetadata editableSchemaMetadata;
    private Status status;
    private GlobalTags tags;
    private GlossaryTerms glossaryTerms;
    private DataPlatformInstance dataPlatformInstance;
    private Domain domain;
    @javax.annotation.Nonnull
    private java.util.List<Health> health;
    @Deprecated
    private Schema schema;
    @Deprecated
    private String externalUrl;
    @Deprecated
    @javax.annotation.Nonnull
    private FabricType origin;
    @Deprecated
    private String description;
    @Deprecated
    private PlatformNativeType platformNativeType;
    @Deprecated
    private String uri;
    @Deprecated
    private GlobalTags globalTags;
    private SubTypes subTypes;
    private ViewProperties viewProperties;
    private SiblingProperties siblings;
    private TestResults testResults;

    public Dataset() {
    }

    public Dataset(String urn, EntityType type, DataPlatform platform, Container container, ParentContainersResult parentContainers, String name, DatasetProperties properties, DatasetEditableProperties editableProperties, Ownership ownership, Deprecation deprecation, InstitutionalMemory institutionalMemory, EditableSchemaMetadata editableSchemaMetadata, Status status, GlobalTags tags, GlossaryTerms glossaryTerms, DataPlatformInstance dataPlatformInstance, Domain domain, java.util.List<Health> health, Schema schema, String externalUrl, FabricType origin, String description, PlatformNativeType platformNativeType, String uri, GlobalTags globalTags, SubTypes subTypes, ViewProperties viewProperties, SiblingProperties siblings, TestResults testResults) {
        this.urn = urn;
        this.type = type;
        this.platform = platform;
        this.container = container;
        this.parentContainers = parentContainers;
        this.name = name;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.ownership = ownership;
        this.deprecation = deprecation;
        this.institutionalMemory = institutionalMemory;
        this.editableSchemaMetadata = editableSchemaMetadata;
        this.status = status;
        this.tags = tags;
        this.glossaryTerms = glossaryTerms;
        this.dataPlatformInstance = dataPlatformInstance;
        this.domain = domain;
        this.health = health;
        this.schema = schema;
        this.externalUrl = externalUrl;
        this.origin = origin;
        this.description = description;
        this.platformNativeType = platformNativeType;
        this.uri = uri;
        this.globalTags = globalTags;
        this.subTypes = subTypes;
        this.viewProperties = viewProperties;
        this.siblings = siblings;
        this.testResults = testResults;
    }

    /**
     * The primary key of the Dataset
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Dataset
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * The standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * The standard Entity Type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * Standardized platform urn where the dataset is defined
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform urn where the dataset is defined
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * The parent container in which the entity resides
     */
    public Container getContainer() {
        return container;
    }
    /**
     * The parent container in which the entity resides
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
     * Unique guid for dataset
No longer to be used as the Dataset display name. Use properties.name instead
     */
    public String getName() {
        return name;
    }
    /**
     * Unique guid for dataset
No longer to be used as the Dataset display name. Use properties.name instead
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * An additional set of read only properties
     */
    public DatasetProperties getProperties() {
        return properties;
    }
    /**
     * An additional set of read only properties
     */
    public void setProperties(DatasetProperties properties) {
        this.properties = properties;
    }

    /**
     * An additional set of of read write properties
     */
    public DatasetEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * An additional set of of read write properties
     */
    public void setEditableProperties(DatasetEditableProperties editableProperties) {
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
     * The deprecation status of the dataset
     */
    public Deprecation getDeprecation() {
        return deprecation;
    }
    /**
     * The deprecation status of the dataset
     */
    public void setDeprecation(Deprecation deprecation) {
        this.deprecation = deprecation;
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
     * Editable schema metadata of the dataset
     */
    public EditableSchemaMetadata getEditableSchemaMetadata() {
        return editableSchemaMetadata;
    }
    /**
     * Editable schema metadata of the dataset
     */
    public void setEditableSchemaMetadata(EditableSchemaMetadata editableSchemaMetadata) {
        this.editableSchemaMetadata = editableSchemaMetadata;
    }

    /**
     * Status of the Dataset
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status of the Dataset
     */
    public void setStatus(Status status) {
        this.status = status;
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
     * Experimental! The resolved health statuses of the Dataset
     */
    public java.util.List<Health> getHealth() {
        return health;
    }
    /**
     * Experimental! The resolved health statuses of the Dataset
     */
    public void setHealth(java.util.List<Health> health) {
        this.health = health;
    }

    /**
     * Schema metadata of the dataset
     */
    @Deprecated
    public Schema getSchema() {
        return schema;
    }
    /**
     * Schema metadata of the dataset
     */
    @Deprecated
    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    /**
     * Deprecated, use properties field instead
External URL associated with the Dataset
     */
    @Deprecated
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * Deprecated, use properties field instead
External URL associated with the Dataset
     */
    @Deprecated
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * Deprecated, see the properties field instead
Environment in which the dataset belongs to or where it was generated
Note that this field will soon be deprecated in favor of a more standardized concept of Environment
     */
    @Deprecated
    public FabricType getOrigin() {
        return origin;
    }
    /**
     * Deprecated, see the properties field instead
Environment in which the dataset belongs to or where it was generated
Note that this field will soon be deprecated in favor of a more standardized concept of Environment
     */
    @Deprecated
    public void setOrigin(FabricType origin) {
        this.origin = origin;
    }

    /**
     * Deprecated, use the properties field instead
Read only technical description for dataset
     */
    @Deprecated
    public String getDescription() {
        return description;
    }
    /**
     * Deprecated, use the properties field instead
Read only technical description for dataset
     */
    @Deprecated
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Deprecated, do not use this field
The logical type of the dataset ie table, stream, etc
     */
    @Deprecated
    public PlatformNativeType getPlatformNativeType() {
        return platformNativeType;
    }
    /**
     * Deprecated, do not use this field
The logical type of the dataset ie table, stream, etc
     */
    @Deprecated
    public void setPlatformNativeType(PlatformNativeType platformNativeType) {
        this.platformNativeType = platformNativeType;
    }

    /**
     * Deprecated, use properties instead
Native Dataset Uri
Uri should not include any environment specific properties
     */
    @Deprecated
    public String getUri() {
        return uri;
    }
    /**
     * Deprecated, use properties instead
Native Dataset Uri
Uri should not include any environment specific properties
     */
    @Deprecated
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Deprecated, use tags field instead
The structured tags associated with the dataset
     */
    @Deprecated
    public GlobalTags getGlobalTags() {
        return globalTags;
    }
    /**
     * Deprecated, use tags field instead
The structured tags associated with the dataset
     */
    @Deprecated
    public void setGlobalTags(GlobalTags globalTags) {
        this.globalTags = globalTags;
    }

    /**
     * Sub Types that this entity implements
     */
    public SubTypes getSubTypes() {
        return subTypes;
    }
    /**
     * Sub Types that this entity implements
     */
    public void setSubTypes(SubTypes subTypes) {
        this.subTypes = subTypes;
    }

    /**
     * View related properties. Only relevant if subtypes field contains view.
     */
    public ViewProperties getViewProperties() {
        return viewProperties;
    }
    /**
     * View related properties. Only relevant if subtypes field contains view.
     */
    public void setViewProperties(ViewProperties viewProperties) {
        this.viewProperties = viewProperties;
    }

    /**
     * Metadata about the datasets siblings
     */
    public SiblingProperties getSiblings() {
        return siblings;
    }
    /**
     * Metadata about the datasets siblings
     */
    public void setSiblings(SiblingProperties siblings) {
        this.siblings = siblings;
    }

    /**
     * The results of evaluating tests
     */
    public TestResults getTestResults() {
        return testResults;
    }
    /**
     * The results of evaluating tests
     */
    public void setTestResults(TestResults testResults) {
        this.testResults = testResults;
    }



    public static Dataset.Builder builder() {
        return new Dataset.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private DataPlatform platform;
        private Container container;
        private ParentContainersResult parentContainers;
        private String name;
        private DatasetProperties properties;
        private DatasetEditableProperties editableProperties;
        private Ownership ownership;
        private Deprecation deprecation;
        private InstitutionalMemory institutionalMemory;
        private EditableSchemaMetadata editableSchemaMetadata;
        private Status status;
        private GlobalTags tags;
        private GlossaryTerms glossaryTerms;
        private DataPlatformInstance dataPlatformInstance;
        private Domain domain;
        private java.util.List<Health> health;
        private Schema schema;
        private String externalUrl;
        private FabricType origin;
        private String description;
        private PlatformNativeType platformNativeType;
        private String uri;
        private GlobalTags globalTags;
        private SubTypes subTypes;
        private ViewProperties viewProperties;
        private SiblingProperties siblings;
        private TestResults testResults;

        public Builder() {
        }

        /**
         * The primary key of the Dataset
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * The standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * Standardized platform urn where the dataset is defined
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * The parent container in which the entity resides
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
         * Unique guid for dataset
No longer to be used as the Dataset display name. Use properties.name instead
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * An additional set of read only properties
         */
        public Builder setProperties(DatasetProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * An additional set of of read write properties
         */
        public Builder setEditableProperties(DatasetEditableProperties editableProperties) {
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
         * The deprecation status of the dataset
         */
        public Builder setDeprecation(Deprecation deprecation) {
            this.deprecation = deprecation;
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
         * Editable schema metadata of the dataset
         */
        public Builder setEditableSchemaMetadata(EditableSchemaMetadata editableSchemaMetadata) {
            this.editableSchemaMetadata = editableSchemaMetadata;
            return this;
        }

        /**
         * Status of the Dataset
         */
        public Builder setStatus(Status status) {
            this.status = status;
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
         * The specific instance of the data platform that this entity belongs to
         */
        public Builder setDataPlatformInstance(DataPlatformInstance dataPlatformInstance) {
            this.dataPlatformInstance = dataPlatformInstance;
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
         * Experimental! The resolved health statuses of the Dataset
         */
        public Builder setHealth(java.util.List<Health> health) {
            this.health = health;
            return this;
        }

        /**
         * Schema metadata of the dataset
         */
        @Deprecated
        public Builder setSchema(Schema schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Deprecated, use properties field instead
External URL associated with the Dataset
         */
        @Deprecated
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * Deprecated, see the properties field instead
Environment in which the dataset belongs to or where it was generated
Note that this field will soon be deprecated in favor of a more standardized concept of Environment
         */
        @Deprecated
        public Builder setOrigin(FabricType origin) {
            this.origin = origin;
            return this;
        }

        /**
         * Deprecated, use the properties field instead
Read only technical description for dataset
         */
        @Deprecated
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Deprecated, do not use this field
The logical type of the dataset ie table, stream, etc
         */
        @Deprecated
        public Builder setPlatformNativeType(PlatformNativeType platformNativeType) {
            this.platformNativeType = platformNativeType;
            return this;
        }

        /**
         * Deprecated, use properties instead
Native Dataset Uri
Uri should not include any environment specific properties
         */
        @Deprecated
        public Builder setUri(String uri) {
            this.uri = uri;
            return this;
        }

        /**
         * Deprecated, use tags field instead
The structured tags associated with the dataset
         */
        @Deprecated
        public Builder setGlobalTags(GlobalTags globalTags) {
            this.globalTags = globalTags;
            return this;
        }

        /**
         * Sub Types that this entity implements
         */
        public Builder setSubTypes(SubTypes subTypes) {
            this.subTypes = subTypes;
            return this;
        }

        /**
         * View related properties. Only relevant if subtypes field contains view.
         */
        public Builder setViewProperties(ViewProperties viewProperties) {
            this.viewProperties = viewProperties;
            return this;
        }

        /**
         * Metadata about the datasets siblings
         */
        public Builder setSiblings(SiblingProperties siblings) {
            this.siblings = siblings;
            return this;
        }

        /**
         * The results of evaluating tests
         */
        public Builder setTestResults(TestResults testResults) {
            this.testResults = testResults;
            return this;
        }


        public Dataset build() {
            return new Dataset(urn, type, platform, container, parentContainers, name, properties, editableProperties, ownership, deprecation, institutionalMemory, editableSchemaMetadata, status, tags, glossaryTerms, dataPlatformInstance, domain, health, schema, externalUrl, origin, description, platformNativeType, uri, globalTags, subTypes, viewProperties, siblings, testResults);
        }

    }
}
