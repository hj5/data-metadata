package com.linkedin.datahub.graphql.generated;


/**
 * Input required when creating or updating an Access Policies Determines which resources the Policy applies to
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ResourceFilterInput implements java.io.Serializable {

    private String type;
    @javax.annotation.Nonnull
    private java.util.List<String> resources;
    private Boolean allResources;
    private PolicyMatchFilterInput filter;

    public ResourceFilterInput() {
    }

    public ResourceFilterInput(String type, java.util.List<String> resources, Boolean allResources, PolicyMatchFilterInput filter) {
        this.type = type;
        this.resources = resources;
        this.allResources = allResources;
        this.filter = filter;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public java.util.List<String> getResources() {
        return resources;
    }
    public void setResources(java.util.List<String> resources) {
        this.resources = resources;
    }

    public Boolean getAllResources() {
        return allResources;
    }
    public void setAllResources(Boolean allResources) {
        this.allResources = allResources;
    }

    public PolicyMatchFilterInput getFilter() {
        return filter;
    }
    public void setFilter(PolicyMatchFilterInput filter) {
        this.filter = filter;
    }



    public static ResourceFilterInput.Builder builder() {
        return new ResourceFilterInput.Builder();
    }

    public static class Builder {

        private String type;
        private java.util.List<String> resources;
        private Boolean allResources;
        private PolicyMatchFilterInput filter;

        public Builder() {
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setResources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setAllResources(Boolean allResources) {
            this.allResources = allResources;
            return this;
        }

        public Builder setFilter(PolicyMatchFilterInput filter) {
            this.filter = filter;
            return this;
        }


        public ResourceFilterInput build() {
            return new ResourceFilterInput(type, resources, allResources, filter);
        }

    }
}
