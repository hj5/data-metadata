package com.linkedin.datahub.graphql.generated;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class MLFeatureTableEditableProperties implements java.io.Serializable {

    private String description;

    public MLFeatureTableEditableProperties() {
    }

    public MLFeatureTableEditableProperties(String description) {
        this.description = description;
    }

    /**
     * The edited description
     */
    public String getDescription() {
        return description;
    }
    /**
     * The edited description
     */
    public void setDescription(String description) {
        this.description = description;
    }



    public static MLFeatureTableEditableProperties.Builder builder() {
        return new MLFeatureTableEditableProperties.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        /**
         * The edited description
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public MLFeatureTableEditableProperties build() {
            return new MLFeatureTableEditableProperties(description);
        }

    }
}
