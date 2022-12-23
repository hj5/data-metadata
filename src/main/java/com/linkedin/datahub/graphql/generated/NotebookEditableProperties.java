package com.linkedin.datahub.graphql.generated;


/**
 * Notebook properties that are editable via the UI This represents logical metadata,
as opposed to technical metadata
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class NotebookEditableProperties implements java.io.Serializable {

    private String description;

    public NotebookEditableProperties() {
    }

    public NotebookEditableProperties(String description) {
        this.description = description;
    }

    /**
     * Description of the Notebook
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the Notebook
     */
    public void setDescription(String description) {
        this.description = description;
    }



    public static NotebookEditableProperties.Builder builder() {
        return new NotebookEditableProperties.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        /**
         * Description of the Notebook
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public NotebookEditableProperties build() {
            return new NotebookEditableProperties(description);
        }

    }
}
