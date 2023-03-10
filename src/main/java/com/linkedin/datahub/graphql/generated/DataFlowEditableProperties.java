package com.linkedin.datahub.graphql.generated;


/**
 * Data Flow properties that are editable via the UI This represents logical metadata,
as opposed to technical metadata
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class DataFlowEditableProperties implements java.io.Serializable {

    private String description;

    public DataFlowEditableProperties() {
    }

    public DataFlowEditableProperties(String description) {
        this.description = description;
    }

    /**
     * Description of the Data Flow
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the Data Flow
     */
    public void setDescription(String description) {
        this.description = description;
    }



    public static DataFlowEditableProperties.Builder builder() {
        return new DataFlowEditableProperties.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        /**
         * Description of the Data Flow
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public DataFlowEditableProperties build() {
            return new DataFlowEditableProperties(description);
        }

    }
}
