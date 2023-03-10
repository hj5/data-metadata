package com.linkedin.datahub.graphql.generated;


/**
 * Additional read only properties about a Dataset
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class DatasetProperties implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String name;
    private String qualifiedName;
    @javax.annotation.Nonnull
    private FabricType origin;
    private String description;
    @javax.annotation.Nonnull
    private java.util.List<StringMapEntry> customProperties;
    private String externalUrl;

    public DatasetProperties() {
    }

    public DatasetProperties(String name, String qualifiedName, FabricType origin, String description, java.util.List<StringMapEntry> customProperties, String externalUrl) {
        this.name = name;
        this.qualifiedName = qualifiedName;
        this.origin = origin;
        this.description = description;
        this.customProperties = customProperties;
        this.externalUrl = externalUrl;
    }

    /**
     * The name of the dataset used in display
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the dataset used in display
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Fully-qualified name of the Dataset
     */
    public String getQualifiedName() {
        return qualifiedName;
    }
    /**
     * Fully-qualified name of the Dataset
     */
    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    /**
     * Environment in which the dataset belongs to or where it was generated
Note that this field will soon be deprecated in favor of a more standardized concept of Environment
     */
    public FabricType getOrigin() {
        return origin;
    }
    /**
     * Environment in which the dataset belongs to or where it was generated
Note that this field will soon be deprecated in favor of a more standardized concept of Environment
     */
    public void setOrigin(FabricType origin) {
        this.origin = origin;
    }

    /**
     * Read only technical description for dataset
     */
    public String getDescription() {
        return description;
    }
    /**
     * Read only technical description for dataset
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Custom properties of the Dataset
     */
    public java.util.List<StringMapEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * Custom properties of the Dataset
     */
    public void setCustomProperties(java.util.List<StringMapEntry> customProperties) {
        this.customProperties = customProperties;
    }

    /**
     * External URL associated with the Dataset
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * External URL associated with the Dataset
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }



    public static DatasetProperties.Builder builder() {
        return new DatasetProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String qualifiedName;
        private FabricType origin;
        private String description;
        private java.util.List<StringMapEntry> customProperties;
        private String externalUrl;

        public Builder() {
        }

        /**
         * The name of the dataset used in display
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Fully-qualified name of the Dataset
         */
        public Builder setQualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }

        /**
         * Environment in which the dataset belongs to or where it was generated
Note that this field will soon be deprecated in favor of a more standardized concept of Environment
         */
        public Builder setOrigin(FabricType origin) {
            this.origin = origin;
            return this;
        }

        /**
         * Read only technical description for dataset
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Custom properties of the Dataset
         */
        public Builder setCustomProperties(java.util.List<StringMapEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }

        /**
         * External URL associated with the Dataset
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }


        public DatasetProperties build() {
            return new DatasetProperties(name, qualifiedName, origin, description, customProperties, externalUrl);
        }

    }
}
