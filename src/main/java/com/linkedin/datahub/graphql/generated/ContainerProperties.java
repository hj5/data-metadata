package com.linkedin.datahub.graphql.generated;


/**
 * Read-only properties that originate in the source data platform
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ContainerProperties implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String name;
    private String description;
    @javax.annotation.Nonnull
    private java.util.List<StringMapEntry> customProperties;
    private String externalUrl;

    public ContainerProperties() {
    }

    public ContainerProperties(String name, String description, java.util.List<StringMapEntry> customProperties, String externalUrl) {
        this.name = name;
        this.description = description;
        this.customProperties = customProperties;
        this.externalUrl = externalUrl;
    }

    /**
     * Display name of the Container
     */
    public String getName() {
        return name;
    }
    /**
     * Display name of the Container
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * System description of the Container
     */
    public String getDescription() {
        return description;
    }
    /**
     * System description of the Container
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Custom properties of the Container
     */
    public java.util.List<StringMapEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * Custom properties of the Container
     */
    public void setCustomProperties(java.util.List<StringMapEntry> customProperties) {
        this.customProperties = customProperties;
    }

    /**
     * Native platform URL of the Container
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * Native platform URL of the Container
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }



    public static ContainerProperties.Builder builder() {
        return new ContainerProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private java.util.List<StringMapEntry> customProperties;
        private String externalUrl;

        public Builder() {
        }

        /**
         * Display name of the Container
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * System description of the Container
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Custom properties of the Container
         */
        public Builder setCustomProperties(java.util.List<StringMapEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }

        /**
         * Native platform URL of the Container
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }


        public ContainerProperties build() {
            return new ContainerProperties(name, description, customProperties, externalUrl);
        }

    }
}
