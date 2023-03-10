package com.linkedin.datahub.graphql.generated;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class MLFeatureTableProperties implements java.io.Serializable {

    private String description;
    private java.util.List<MLFeature> mlFeatures;
    private java.util.List<MLPrimaryKey> mlPrimaryKeys;
    @javax.annotation.Nonnull
    private java.util.List<StringMapEntry> customProperties;

    public MLFeatureTableProperties() {
    }

    public MLFeatureTableProperties(String description, java.util.List<MLFeature> mlFeatures, java.util.List<MLPrimaryKey> mlPrimaryKeys, java.util.List<StringMapEntry> customProperties) {
        this.description = description;
        this.mlFeatures = mlFeatures;
        this.mlPrimaryKeys = mlPrimaryKeys;
        this.customProperties = customProperties;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.List<MLFeature> getMlFeatures() {
        return mlFeatures;
    }
    public void setMlFeatures(java.util.List<MLFeature> mlFeatures) {
        this.mlFeatures = mlFeatures;
    }

    public java.util.List<MLPrimaryKey> getMlPrimaryKeys() {
        return mlPrimaryKeys;
    }
    public void setMlPrimaryKeys(java.util.List<MLPrimaryKey> mlPrimaryKeys) {
        this.mlPrimaryKeys = mlPrimaryKeys;
    }

    public java.util.List<StringMapEntry> getCustomProperties() {
        return customProperties;
    }
    public void setCustomProperties(java.util.List<StringMapEntry> customProperties) {
        this.customProperties = customProperties;
    }



    public static MLFeatureTableProperties.Builder builder() {
        return new MLFeatureTableProperties.Builder();
    }

    public static class Builder {

        private String description;
        private java.util.List<MLFeature> mlFeatures;
        private java.util.List<MLPrimaryKey> mlPrimaryKeys;
        private java.util.List<StringMapEntry> customProperties;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setMlFeatures(java.util.List<MLFeature> mlFeatures) {
            this.mlFeatures = mlFeatures;
            return this;
        }

        public Builder setMlPrimaryKeys(java.util.List<MLPrimaryKey> mlPrimaryKeys) {
            this.mlPrimaryKeys = mlPrimaryKeys;
            return this;
        }

        public Builder setCustomProperties(java.util.List<StringMapEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }


        public MLFeatureTableProperties build() {
            return new MLFeatureTableProperties(description, mlFeatures, mlPrimaryKeys, customProperties);
        }

    }
}
