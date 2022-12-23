package com.linkedin.datahub.graphql.generated;


/**
 * A Notebook Metadata Entity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class Notebook implements java.io.Serializable, Entity {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String tool;
    @javax.annotation.Nonnull
    private String notebookId;
    private NotebookInfo info;
    private NotebookEditableProperties editableProperties;
    private Ownership ownership;
    private Status status;
    @javax.annotation.Nonnull
    private NotebookContent content;
    private GlobalTags tags;
    private InstitutionalMemory institutionalMemory;
    private Domain domain;
    private DataPlatformInstance dataPlatformInstance;
    private SubTypes subTypes;
    private GlossaryTerms glossaryTerms;
    @javax.annotation.Nonnull
    private DataPlatform platform;

    public Notebook() {
    }

    public Notebook(String urn, EntityType type, String tool, String notebookId, NotebookInfo info, NotebookEditableProperties editableProperties, Ownership ownership, Status status, NotebookContent content, GlobalTags tags, InstitutionalMemory institutionalMemory, Domain domain, DataPlatformInstance dataPlatformInstance, SubTypes subTypes, GlossaryTerms glossaryTerms, DataPlatform platform) {
        this.urn = urn;
        this.type = type;
        this.tool = tool;
        this.notebookId = notebookId;
        this.info = info;
        this.editableProperties = editableProperties;
        this.ownership = ownership;
        this.status = status;
        this.content = content;
        this.tags = tags;
        this.institutionalMemory = institutionalMemory;
        this.domain = domain;
        this.dataPlatformInstance = dataPlatformInstance;
        this.subTypes = subTypes;
        this.glossaryTerms = glossaryTerms;
        this.platform = platform;
    }

    /**
     * The primary key of the Notebook
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Notebook
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
     * The Notebook tool name
     */
    public String getTool() {
        return tool;
    }
    /**
     * The Notebook tool name
     */
    public void setTool(String tool) {
        this.tool = tool;
    }

    /**
     * An id unique within the Notebook tool
     */
    public String getNotebookId() {
        return notebookId;
    }
    /**
     * An id unique within the Notebook tool
     */
    public void setNotebookId(String notebookId) {
        this.notebookId = notebookId;
    }

    /**
     * Additional read only information about the Notebook
     */
    public NotebookInfo getInfo() {
        return info;
    }
    /**
     * Additional read only information about the Notebook
     */
    public void setInfo(NotebookInfo info) {
        this.info = info;
    }

    /**
     * Additional read write properties about the Notebook
     */
    public NotebookEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Additional read write properties about the Notebook
     */
    public void setEditableProperties(NotebookEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }

    /**
     * Ownership metadata of the Notebook
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the Notebook
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * Status metadata of the Notebook
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the Notebook
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * The content of this Notebook
     */
    public NotebookContent getContent() {
        return content;
    }
    /**
     * The content of this Notebook
     */
    public void setContent(NotebookContent content) {
        this.content = content;
    }

    /**
     * The tags associated with the Notebook
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * The tags associated with the Notebook
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * References to internal resources related to the Notebook
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the Notebook
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * The Domain associated with the Notebook
     */
    public Domain getDomain() {
        return domain;
    }
    /**
     * The Domain associated with the Notebook
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
     * The structured glossary terms associated with the notebook
     */
    public GlossaryTerms getGlossaryTerms() {
        return glossaryTerms;
    }
    /**
     * The structured glossary terms associated with the notebook
     */
    public void setGlossaryTerms(GlossaryTerms glossaryTerms) {
        this.glossaryTerms = glossaryTerms;
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



    public static Notebook.Builder builder() {
        return new Notebook.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String tool;
        private String notebookId;
        private NotebookInfo info;
        private NotebookEditableProperties editableProperties;
        private Ownership ownership;
        private Status status;
        private NotebookContent content;
        private GlobalTags tags;
        private InstitutionalMemory institutionalMemory;
        private Domain domain;
        private DataPlatformInstance dataPlatformInstance;
        private SubTypes subTypes;
        private GlossaryTerms glossaryTerms;
        private DataPlatform platform;

        public Builder() {
        }

        /**
         * The primary key of the Notebook
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
         * The Notebook tool name
         */
        public Builder setTool(String tool) {
            this.tool = tool;
            return this;
        }

        /**
         * An id unique within the Notebook tool
         */
        public Builder setNotebookId(String notebookId) {
            this.notebookId = notebookId;
            return this;
        }

        /**
         * Additional read only information about the Notebook
         */
        public Builder setInfo(NotebookInfo info) {
            this.info = info;
            return this;
        }

        /**
         * Additional read write properties about the Notebook
         */
        public Builder setEditableProperties(NotebookEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }

        /**
         * Ownership metadata of the Notebook
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * Status metadata of the Notebook
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * The content of this Notebook
         */
        public Builder setContent(NotebookContent content) {
            this.content = content;
            return this;
        }

        /**
         * The tags associated with the Notebook
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * References to internal resources related to the Notebook
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * The Domain associated with the Notebook
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
         * Sub Types that this entity implements
         */
        public Builder setSubTypes(SubTypes subTypes) {
            this.subTypes = subTypes;
            return this;
        }

        /**
         * The structured glossary terms associated with the notebook
         */
        public Builder setGlossaryTerms(GlossaryTerms glossaryTerms) {
            this.glossaryTerms = glossaryTerms;
            return this;
        }

        /**
         * Standardized platform.
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }


        public Notebook build() {
            return new Notebook(urn, type, tool, notebookId, info, editableProperties, ownership, status, content, tags, institutionalMemory, domain, dataPlatformInstance, subTypes, glossaryTerms, platform);
        }

    }
}
