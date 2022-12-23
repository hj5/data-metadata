package com.linkedin.datahub.graphql.generated;


/**
 * Spec to identify resource
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ResourceSpec implements java.io.Serializable {

    @javax.annotation.Nonnull
    private EntityType resourceType;
    @javax.annotation.Nonnull
    private String resourceUrn;

    public ResourceSpec() {
    }

    public ResourceSpec(EntityType resourceType, String resourceUrn) {
        this.resourceType = resourceType;
        this.resourceUrn = resourceUrn;
    }

    public EntityType getResourceType() {
        return resourceType;
    }
    public void setResourceType(EntityType resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }



    public static ResourceSpec.Builder builder() {
        return new ResourceSpec.Builder();
    }

    public static class Builder {

        private EntityType resourceType;
        private String resourceUrn;

        public Builder() {
        }

        public Builder setResourceType(EntityType resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }


        public ResourceSpec build() {
            return new ResourceSpec(resourceType, resourceUrn);
        }

    }
}
