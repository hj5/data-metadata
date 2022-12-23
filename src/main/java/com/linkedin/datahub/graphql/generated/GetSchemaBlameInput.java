package com.linkedin.datahub.graphql.generated;


/**
 * Input for getting schema changes computed at a specific version.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class GetSchemaBlameInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String datasetUrn;
    @javax.annotation.Nonnull
    private java.util.List<ChangeCategoryType> categories;
    private String version;

    public GetSchemaBlameInput() {
    }

    public GetSchemaBlameInput(String datasetUrn, java.util.List<ChangeCategoryType> categories, String version) {
        this.datasetUrn = datasetUrn;
        this.categories = categories;
        this.version = version;
    }

    public String getDatasetUrn() {
        return datasetUrn;
    }
    public void setDatasetUrn(String datasetUrn) {
        this.datasetUrn = datasetUrn;
    }

    public java.util.List<ChangeCategoryType> getCategories() {
        return categories;
    }
    public void setCategories(java.util.List<ChangeCategoryType> categories) {
        this.categories = categories;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }



    public static GetSchemaBlameInput.Builder builder() {
        return new GetSchemaBlameInput.Builder();
    }

    public static class Builder {

        private String datasetUrn;
        private java.util.List<ChangeCategoryType> categories;
        private String version;

        public Builder() {
        }

        public Builder setDatasetUrn(String datasetUrn) {
            this.datasetUrn = datasetUrn;
            return this;
        }

        public Builder setCategories(java.util.List<ChangeCategoryType> categories) {
            this.categories = categories;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }


        public GetSchemaBlameInput build() {
            return new GetSchemaBlameInput(datasetUrn, categories, version);
        }

    }
}
