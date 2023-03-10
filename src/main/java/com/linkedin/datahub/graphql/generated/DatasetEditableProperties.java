package com.linkedin.datahub.graphql.generated;


/**
 * Dataset properties that are editable via the UI This represents logical metadata,
as opposed to technical metadata
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class DatasetEditableProperties implements java.io.Serializable {

    private String description;

    public DatasetEditableProperties() {
    }

    public DatasetEditableProperties(String description) {
        this.description = description;
    }

    /**
     * Description of the Dataset
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the Dataset
     */
    public void setDescription(String description) {
        this.description = description;
    }



    public static DatasetEditableProperties.Builder builder() {
        return new DatasetEditableProperties.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        /**
         * Description of the Dataset
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public DatasetEditableProperties build() {
            return new DatasetEditableProperties(description);
        }

    }
}
