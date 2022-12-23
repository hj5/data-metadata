package com.linkedin.datahub.graphql.generated;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class MLModelGroupEditableProperties implements java.io.Serializable {

    private String description;

    public MLModelGroupEditableProperties() {
    }

    public MLModelGroupEditableProperties(String description) {
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



    public static MLModelGroupEditableProperties.Builder builder() {
        return new MLModelGroupEditableProperties.Builder();
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


        public MLModelGroupEditableProperties build() {
            return new MLModelGroupEditableProperties(description);
        }

    }
}
