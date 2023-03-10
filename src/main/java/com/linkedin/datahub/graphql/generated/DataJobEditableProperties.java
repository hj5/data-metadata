package com.linkedin.datahub.graphql.generated;


/**
 * Data Job properties that are editable via the UI This represents logical metadata,
as opposed to technical metadata
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class DataJobEditableProperties implements java.io.Serializable {

    private String description;

    public DataJobEditableProperties() {
    }

    public DataJobEditableProperties(String description) {
        this.description = description;
    }

    /**
     * Description of the Data Job
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the Data Job
     */
    public void setDescription(String description) {
        this.description = description;
    }



    public static DataJobEditableProperties.Builder builder() {
        return new DataJobEditableProperties.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        /**
         * Description of the Data Job
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public DataJobEditableProperties build() {
            return new DataJobEditableProperties(description);
        }

    }
}
