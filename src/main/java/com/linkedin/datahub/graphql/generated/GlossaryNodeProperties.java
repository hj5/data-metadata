package com.linkedin.datahub.graphql.generated;


/**
 * Additional read only properties about a Glossary Node
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class GlossaryNodeProperties implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String name;
    private String description;

    public GlossaryNodeProperties() {
    }

    public GlossaryNodeProperties(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * The name of the Glossary Term
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the Glossary Term
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description of the glossary term
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the glossary term
     */
    public void setDescription(String description) {
        this.description = description;
    }



    public static GlossaryNodeProperties.Builder builder() {
        return new GlossaryNodeProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;

        public Builder() {
        }

        /**
         * The name of the Glossary Term
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Description of the glossary term
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public GlossaryNodeProperties build() {
            return new GlossaryNodeProperties(name, description);
        }

    }
}
