package com.linkedin.datahub.graphql.generated;


/**
 * Input for getting granted privileges
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class GetGrantedPrivilegesInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String actorUrn;
    private ResourceSpec resourceSpec;

    public GetGrantedPrivilegesInput() {
    }

    public GetGrantedPrivilegesInput(String actorUrn, ResourceSpec resourceSpec) {
        this.actorUrn = actorUrn;
        this.resourceSpec = resourceSpec;
    }

    public String getActorUrn() {
        return actorUrn;
    }
    public void setActorUrn(String actorUrn) {
        this.actorUrn = actorUrn;
    }

    public ResourceSpec getResourceSpec() {
        return resourceSpec;
    }
    public void setResourceSpec(ResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
    }



    public static GetGrantedPrivilegesInput.Builder builder() {
        return new GetGrantedPrivilegesInput.Builder();
    }

    public static class Builder {

        private String actorUrn;
        private ResourceSpec resourceSpec;

        public Builder() {
        }

        public Builder setActorUrn(String actorUrn) {
            this.actorUrn = actorUrn;
            return this;
        }

        public Builder setResourceSpec(ResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }


        public GetGrantedPrivilegesInput build() {
            return new GetGrantedPrivilegesInput(actorUrn, resourceSpec);
        }

    }
}
