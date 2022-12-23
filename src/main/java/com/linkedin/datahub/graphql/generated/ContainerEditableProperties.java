package com.linkedin.datahub.graphql.generated;


/**
 * Read-write properties that originate in DataHub
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ContainerEditableProperties implements java.io.Serializable {

    private String description;

    public ContainerEditableProperties() {
    }

    public ContainerEditableProperties(String description) {
        this.description = description;
    }

    /**
     * DataHub description of the Container
     */
    public String getDescription() {
        return description;
    }
    /**
     * DataHub description of the Container
     */
    public void setDescription(String description) {
        this.description = description;
    }



    public static ContainerEditableProperties.Builder builder() {
        return new ContainerEditableProperties.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        /**
         * DataHub description of the Container
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public ContainerEditableProperties build() {
            return new ContainerEditableProperties(description);
        }

    }
}
