package com.linkedin.datahub.graphql.generated;


/**
 * Context to define the entity profile page
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class EntityProfileParams implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;

    public EntityProfileParams() {
    }

    public EntityProfileParams(String urn, EntityType type) {
        this.urn = urn;
        this.type = type;
    }

    /**
     * Urn of the entity being shown
     */
    public String getUrn() {
        return urn;
    }
    /**
     * Urn of the entity being shown
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * Type of the enity being displayed
     */
    public EntityType getType() {
        return type;
    }
    /**
     * Type of the enity being displayed
     */
    public void setType(EntityType type) {
        this.type = type;
    }



    public static EntityProfileParams.Builder builder() {
        return new EntityProfileParams.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;

        public Builder() {
        }

        /**
         * Urn of the entity being shown
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * Type of the enity being displayed
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }


        public EntityProfileParams build() {
            return new EntityProfileParams(urn, type);
        }

    }
}
