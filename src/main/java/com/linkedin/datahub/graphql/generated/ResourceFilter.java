package com.linkedin.datahub.graphql.generated;


/**
 * The resources that a DataHub Access Policy applies to
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ResourceFilter implements java.io.Serializable {

    private String type;
    @javax.annotation.Nonnull
    private java.util.List<String> resources;
    private Boolean allResources;
    private PolicyMatchFilter filter;

    public ResourceFilter() {
    }

    public ResourceFilter(String type, java.util.List<String> resources, Boolean allResources, PolicyMatchFilter filter) {
        this.type = type;
        this.resources = resources;
        this.allResources = allResources;
        this.filter = filter;
    }

    /**
     * The type of the resource the policy should apply to Not required because in the future we want to support filtering by type OR by domain
     */
    public String getType() {
        return type;
    }
    /**
     * The type of the resource the policy should apply to Not required because in the future we want to support filtering by type OR by domain
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * A list of specific resource urns to apply the filter to
     */
    public java.util.List<String> getResources() {
        return resources;
    }
    /**
     * A list of specific resource urns to apply the filter to
     */
    public void setResources(java.util.List<String> resources) {
        this.resources = resources;
    }

    /**
     * Whether of not to apply the filter to all resources of the type
     */
    public Boolean getAllResources() {
        return allResources;
    }
    /**
     * Whether of not to apply the filter to all resources of the type
     */
    public void setAllResources(Boolean allResources) {
        this.allResources = allResources;
    }

    /**
     * Whether of not to apply the filter to all resources of the type
     */
    public PolicyMatchFilter getFilter() {
        return filter;
    }
    /**
     * Whether of not to apply the filter to all resources of the type
     */
    public void setFilter(PolicyMatchFilter filter) {
        this.filter = filter;
    }



    public static ResourceFilter.Builder builder() {
        return new ResourceFilter.Builder();
    }

    public static class Builder {

        private String type;
        private java.util.List<String> resources;
        private Boolean allResources;
        private PolicyMatchFilter filter;

        public Builder() {
        }

        /**
         * The type of the resource the policy should apply to Not required because in the future we want to support filtering by type OR by domain
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * A list of specific resource urns to apply the filter to
         */
        public Builder setResources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Whether of not to apply the filter to all resources of the type
         */
        public Builder setAllResources(Boolean allResources) {
            this.allResources = allResources;
            return this;
        }

        /**
         * Whether of not to apply the filter to all resources of the type
         */
        public Builder setFilter(PolicyMatchFilter filter) {
            this.filter = filter;
            return this;
        }


        public ResourceFilter build() {
            return new ResourceFilter(type, resources, allResources, filter);
        }

    }
}
