package com.linkedin.datahub.graphql.generated;


/**
 * Additional read only properties about a Glossary Term
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class GlossaryTermProperties implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String name;
    private String description;
    @Deprecated
    @javax.annotation.Nonnull
    private String definition;
    @javax.annotation.Nonnull
    private String termSource;
    private String sourceRef;
    private String sourceUrl;
    @javax.annotation.Nonnull
    private java.util.List<StringMapEntry> customProperties;
    private String rawSchema;

    public GlossaryTermProperties() {
    }

    public GlossaryTermProperties(String name, String description, String definition, String termSource, String sourceRef, String sourceUrl, java.util.List<StringMapEntry> customProperties, String rawSchema) {
        this.name = name;
        this.description = description;
        this.definition = definition;
        this.termSource = termSource;
        this.sourceRef = sourceRef;
        this.sourceUrl = sourceUrl;
        this.customProperties = customProperties;
        this.rawSchema = rawSchema;
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

    /**
     * Definition of the glossary term. Deprecated - Use 'description' instead.
     */
    @Deprecated
    public String getDefinition() {
        return definition;
    }
    /**
     * Definition of the glossary term. Deprecated - Use 'description' instead.
     */
    @Deprecated
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * Term Source of the glossary term
     */
    public String getTermSource() {
        return termSource;
    }
    /**
     * Term Source of the glossary term
     */
    public void setTermSource(String termSource) {
        this.termSource = termSource;
    }

    /**
     * Source Ref of the glossary term
     */
    public String getSourceRef() {
        return sourceRef;
    }
    /**
     * Source Ref of the glossary term
     */
    public void setSourceRef(String sourceRef) {
        this.sourceRef = sourceRef;
    }

    /**
     * Source Url of the glossary term
     */
    public String getSourceUrl() {
        return sourceUrl;
    }
    /**
     * Source Url of the glossary term
     */
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    /**
     * Properties of the glossary term
     */
    public java.util.List<StringMapEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * Properties of the glossary term
     */
    public void setCustomProperties(java.util.List<StringMapEntry> customProperties) {
        this.customProperties = customProperties;
    }

    /**
     * Schema definition of glossary term
     */
    public String getRawSchema() {
        return rawSchema;
    }
    /**
     * Schema definition of glossary term
     */
    public void setRawSchema(String rawSchema) {
        this.rawSchema = rawSchema;
    }



    public static GlossaryTermProperties.Builder builder() {
        return new GlossaryTermProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private String definition;
        private String termSource;
        private String sourceRef;
        private String sourceUrl;
        private java.util.List<StringMapEntry> customProperties;
        private String rawSchema;

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

        /**
         * Definition of the glossary term. Deprecated - Use 'description' instead.
         */
        @Deprecated
        public Builder setDefinition(String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * Term Source of the glossary term
         */
        public Builder setTermSource(String termSource) {
            this.termSource = termSource;
            return this;
        }

        /**
         * Source Ref of the glossary term
         */
        public Builder setSourceRef(String sourceRef) {
            this.sourceRef = sourceRef;
            return this;
        }

        /**
         * Source Url of the glossary term
         */
        public Builder setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }

        /**
         * Properties of the glossary term
         */
        public Builder setCustomProperties(java.util.List<StringMapEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }

        /**
         * Schema definition of glossary term
         */
        public Builder setRawSchema(String rawSchema) {
            this.rawSchema = rawSchema;
            return this;
        }


        public GlossaryTermProperties build() {
            return new GlossaryTermProperties(name, description, definition, termSource, sourceRef, sourceUrl, customProperties, rawSchema);
        }

    }
}
