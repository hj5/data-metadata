package com.linkedin.datahub.graphql.generated;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class MLFeatureEditableProperties implements java.io.Serializable {

    private String description;

    public MLFeatureEditableProperties() {
    }

    public MLFeatureEditableProperties(String description) {
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



    public static MLFeatureEditableProperties.Builder builder() {
        return new MLFeatureEditableProperties.Builder();
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


        public MLFeatureEditableProperties build() {
            return new MLFeatureEditableProperties(description);
        }

    }
}
