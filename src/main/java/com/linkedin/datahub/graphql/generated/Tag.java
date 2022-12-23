package com.linkedin.datahub.graphql.generated;


/**
 * A Tag Entity, which can be associated with other Metadata Entities and subresources
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class Tag implements java.io.Serializable, Entity {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @Deprecated
    @javax.annotation.Nonnull
    private String name;
    private TagProperties properties;
    @Deprecated
    private EditableTagProperties editableProperties;
    private Ownership ownership;
    @Deprecated
    private String description;

    public Tag() {
    }

    public Tag(String urn, EntityType type, String name, TagProperties properties, EditableTagProperties editableProperties, Ownership ownership, String description) {
        this.urn = urn;
        this.type = type;
        this.name = name;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.ownership = ownership;
        this.description = description;
    }

    /**
     * The primary key of the TAG
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the TAG
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * A standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * A standard Entity Type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * The name / id of the tag. Use properties.name instead.
     */
    @Deprecated
    public String getName() {
        return name;
    }
    /**
     * The name / id of the tag. Use properties.name instead.
     */
    @Deprecated
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Additional properties about the Tag
     */
    public TagProperties getProperties() {
        return properties;
    }
    /**
     * Additional properties about the Tag
     */
    public void setProperties(TagProperties properties) {
        this.properties = properties;
    }

    /**
     * Additional read write properties about the Tag
Deprecated! Use 'properties' field instead.
     */
    @Deprecated
    public EditableTagProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Additional read write properties about the Tag
Deprecated! Use 'properties' field instead.
     */
    @Deprecated
    public void setEditableProperties(EditableTagProperties editableProperties) {
        this.editableProperties = editableProperties;
    }

    /**
     * Ownership metadata of the dataset
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the dataset
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * Deprecated, use properties.description field instead
     */
    @Deprecated
    public String getDescription() {
        return description;
    }
    /**
     * Deprecated, use properties.description field instead
     */
    @Deprecated
    public void setDescription(String description) {
        this.description = description;
    }



    public static Tag.Builder builder() {
        return new Tag.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String name;
        private TagProperties properties;
        private EditableTagProperties editableProperties;
        private Ownership ownership;
        private String description;

        public Builder() {
        }

        /**
         * The primary key of the TAG
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * A standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * The name / id of the tag. Use properties.name instead.
         */
        @Deprecated
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Additional properties about the Tag
         */
        public Builder setProperties(TagProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Additional read write properties about the Tag
Deprecated! Use 'properties' field instead.
         */
        @Deprecated
        public Builder setEditableProperties(EditableTagProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }

        /**
         * Ownership metadata of the dataset
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * Deprecated, use properties.description field instead
         */
        @Deprecated
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public Tag build() {
            return new Tag(urn, type, name, properties, editableProperties, ownership, description);
        }

    }
}
