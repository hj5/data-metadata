package com.linkedin.datahub.graphql.generated;


/**
 * Properties for a DataHub Tag
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class TagProperties implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String name;
    private String description;
    private String colorHex;

    public TagProperties() {
    }

    public TagProperties(String name, String description, String colorHex) {
        this.name = name;
        this.description = description;
        this.colorHex = colorHex;
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

    /**
     * An optional RGB hex code for a Tag color, e.g. #FFFFFF
     */
    public String getColorHex() {
        return colorHex;
    }
    /**
     * An optional RGB hex code for a Tag color, e.g. #FFFFFF
     */
    public void setColorHex(String colorHex) {
        this.colorHex = colorHex;
    }



    public static TagProperties.Builder builder() {
        return new TagProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private String colorHex;

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

        /**
         * An optional RGB hex code for a Tag color, e.g. #FFFFFF
         */
        public Builder setColorHex(String colorHex) {
            this.colorHex = colorHex;
            return this;
        }


        public TagProperties build() {
            return new TagProperties(name, description, colorHex);
        }

    }
}
