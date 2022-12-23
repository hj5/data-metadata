package com.linkedin.datahub.graphql.generated;


/**
 * An assertion represents a programmatic validation, check, or test performed periodically against another Entity.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class Assertion implements java.io.Serializable, Entity, EntityWithRelationships {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private DataPlatform platform;
    private AssertionInfo info;
    private DataPlatformInstance dataPlatformInstance;

    public Assertion() {
    }

    public Assertion(String urn, EntityType type, DataPlatform platform, AssertionInfo info, DataPlatformInstance dataPlatformInstance) {
        this.urn = urn;
        this.type = type;
        this.platform = platform;
        this.info = info;
        this.dataPlatformInstance = dataPlatformInstance;
    }

    /**
     * The primary key of the Assertion
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Assertion
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
     * Standardized platform urn where the assertion is evaluated
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform urn where the assertion is evaluated
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * Details about assertion
     */
    public AssertionInfo getInfo() {
        return info;
    }
    /**
     * Details about assertion
     */
    public void setInfo(AssertionInfo info) {
        this.info = info;
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



    public static Assertion.Builder builder() {
        return new Assertion.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private DataPlatform platform;
        private AssertionInfo info;
        private DataPlatformInstance dataPlatformInstance;

        public Builder() {
        }

        /**
         * The primary key of the Assertion
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
         * Standardized platform urn where the assertion is evaluated
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * Details about assertion
         */
        public Builder setInfo(AssertionInfo info) {
            this.info = info;
            return this;
        }

        /**
         * The specific instance of the data platform that this entity belongs to
         */
        public Builder setDataPlatformInstance(DataPlatformInstance dataPlatformInstance) {
            this.dataPlatformInstance = dataPlatformInstance;
            return this;
        }


        public Assertion build() {
            return new Assertion(urn, type, platform, info, dataPlatformInstance);
        }

    }
}
