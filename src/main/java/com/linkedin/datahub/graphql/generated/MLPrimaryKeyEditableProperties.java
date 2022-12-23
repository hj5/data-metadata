package com.linkedin.datahub.graphql.generated;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class MLPrimaryKeyEditableProperties implements java.io.Serializable {

    private String description;

    public MLPrimaryKeyEditableProperties() {
    }

    public MLPrimaryKeyEditableProperties(String description) {
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



    public static MLPrimaryKeyEditableProperties.Builder builder() {
        return new MLPrimaryKeyEditableProperties.Builder();
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


        public MLPrimaryKeyEditableProperties build() {
            return new MLPrimaryKeyEditableProperties(description);
        }

    }
}
