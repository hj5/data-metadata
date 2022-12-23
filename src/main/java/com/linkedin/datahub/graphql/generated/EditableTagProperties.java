package com.linkedin.datahub.graphql.generated;


/**
 * Additional read write Tag properties
Deprecated! Replaced by TagProperties.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class EditableTagProperties implements java.io.Serializable {

    private String name;
    private String description;

    public EditableTagProperties() {
    }

    public EditableTagProperties(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * A display name for the Tag
     */
    public String getName() {
        return name;
    }
    /**
     * A display name for the Tag
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A description of the Tag
     */
    public String getDescription() {
        return description;
    }
    /**
     * A description of the Tag
     */
    public void setDescription(String description) {
        this.description = description;
    }



    public static EditableTagProperties.Builder builder() {
        return new EditableTagProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;

        public Builder() {
        }

        /**
         * A display name for the Tag
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * A description of the Tag
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public EditableTagProperties build() {
            return new EditableTagProperties(name, description);
        }

    }
}
