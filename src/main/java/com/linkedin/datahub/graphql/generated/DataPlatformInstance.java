package com.linkedin.datahub.graphql.generated;


/**
 * A Data Platform instance represents an instance of a 3rd party platform like Looker, Snowflake, etc.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class DataPlatformInstance implements java.io.Serializable, Entity {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private DataPlatform platform;
    @javax.annotation.Nonnull
    private String instanceId;

    public DataPlatformInstance() {
    }

    public DataPlatformInstance(String urn, EntityType type, DataPlatform platform, String instanceId) {
        this.urn = urn;
        this.type = type;
        this.platform = platform;
        this.instanceId = instanceId;
    }

    /**
     * Urn of the data platform
     */
    public String getUrn() {
        return urn;
    }
    /**
     * Urn of the data platform
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
     * Name of the data platform
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Name of the data platform
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * The platform instance id
     */
    public String getInstanceId() {
        return instanceId;
    }
    /**
     * The platform instance id
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }



    public static DataPlatformInstance.Builder builder() {
        return new DataPlatformInstance.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private DataPlatform platform;
        private String instanceId;

        public Builder() {
        }

        /**
         * Urn of the data platform
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
         * Name of the data platform
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * The platform instance id
         */
        public Builder setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }


        public DataPlatformInstance build() {
            return new DataPlatformInstance(urn, type, platform, instanceId);
        }

    }
}
