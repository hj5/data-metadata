package com.linkedin.datahub.graphql.generated;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class MLPrimaryKeyProperties implements java.io.Serializable {

    private String description;
    private MLFeatureDataType dataType;
    private VersionTag version;
    private java.util.List<Dataset> sources;

    public MLPrimaryKeyProperties() {
    }

    public MLPrimaryKeyProperties(String description, MLFeatureDataType dataType, VersionTag version, java.util.List<Dataset> sources) {
        this.description = description;
        this.dataType = dataType;
        this.version = version;
        this.sources = sources;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public MLFeatureDataType getDataType() {
        return dataType;
    }
    public void setDataType(MLFeatureDataType dataType) {
        this.dataType = dataType;
    }

    public VersionTag getVersion() {
        return version;
    }
    public void setVersion(VersionTag version) {
        this.version = version;
    }

    public java.util.List<Dataset> getSources() {
        return sources;
    }
    public void setSources(java.util.List<Dataset> sources) {
        this.sources = sources;
    }



    public static MLPrimaryKeyProperties.Builder builder() {
        return new MLPrimaryKeyProperties.Builder();
    }

    public static class Builder {

        private String description;
        private MLFeatureDataType dataType;
        private VersionTag version;
        private java.util.List<Dataset> sources;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDataType(MLFeatureDataType dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder setVersion(VersionTag version) {
            this.version = version;
            return this;
        }

        public Builder setSources(java.util.List<Dataset> sources) {
            this.sources = sources;
            return this;
        }


        public MLPrimaryKeyProperties build() {
            return new MLPrimaryKeyProperties(description, dataType, version, sources);
        }

    }
}
