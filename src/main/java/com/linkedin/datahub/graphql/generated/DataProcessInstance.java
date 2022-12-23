package com.linkedin.datahub.graphql.generated;


/**
 * A DataProcessInstance Metadata Entity, representing an individual run of
a task or datajob.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class DataProcessInstance implements java.io.Serializable, Entity, EntityWithRelationships {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private AuditStamp created;
    private String name;
    private String externalUrl;

    public DataProcessInstance() {
    }

    public DataProcessInstance(String urn, EntityType type, AuditStamp created, String name, String externalUrl) {
        this.urn = urn;
        this.type = type;
        this.created = created;
        this.name = name;
        this.externalUrl = externalUrl;
    }

    /**
     * The primary key of the DataProcessInstance
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the DataProcessInstance
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
     * When the run was kicked off
     */
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * When the run was kicked off
     */
    public void setCreated(AuditStamp created) {
        this.created = created;
    }

    /**
     * The name of the data process
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the data process
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The link to view the task run in the source system
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * The link to view the task run in the source system
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }



    public static DataProcessInstance.Builder builder() {
        return new DataProcessInstance.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private AuditStamp created;
        private String name;
        private String externalUrl;

        public Builder() {
        }

        /**
         * The primary key of the DataProcessInstance
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
         * When the run was kicked off
         */
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * The name of the data process
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The link to view the task run in the source system
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }


        public DataProcessInstance build() {
            return new DataProcessInstance(urn, type, created, name, externalUrl);
        }

    }
}
