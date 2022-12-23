package com.linkedin.datahub.graphql.generated;


/**
 * A Glossary Term, or a node in a Business Glossary representing a standardized domain
data type
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class GlossaryTerm implements java.io.Serializable, Entity {

    @javax.annotation.Nonnull
    private String urn;
    private Ownership ownership;
    private InstitutionalMemory institutionalMemory;
    @javax.annotation.Nonnull
    private EntityType type;
    @Deprecated
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String hierarchicalName;
    private GlossaryTermProperties properties;
    private GlossaryTermInfo glossaryTermInfo;
    private Deprecation deprecation;
    private ParentNodesResult parentNodes;

    public GlossaryTerm() {
    }

    public GlossaryTerm(String urn, Ownership ownership, InstitutionalMemory institutionalMemory, EntityType type, String name, String hierarchicalName, GlossaryTermProperties properties, GlossaryTermInfo glossaryTermInfo, Deprecation deprecation, ParentNodesResult parentNodes) {
        this.urn = urn;
        this.ownership = ownership;
        this.institutionalMemory = institutionalMemory;
        this.type = type;
        this.name = name;
        this.hierarchicalName = hierarchicalName;
        this.properties = properties;
        this.glossaryTermInfo = glossaryTermInfo;
        this.deprecation = deprecation;
        this.parentNodes = parentNodes;
    }

    /**
     * The primary key of the glossary term
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the glossary term
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * Ownership metadata of the glossary term
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the glossary term
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * References to internal resources related to the Glossary Term
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the Glossary Term
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
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
     * Name / id of the glossary term
     */
    @Deprecated
    public String getName() {
        return name;
    }
    /**
     * Name / id of the glossary term
     */
    @Deprecated
    public void setName(String name) {
        this.name = name;
    }

    /**
     * hierarchicalName of glossary term
     */
    public String getHierarchicalName() {
        return hierarchicalName;
    }
    /**
     * hierarchicalName of glossary term
     */
    public void setHierarchicalName(String hierarchicalName) {
        this.hierarchicalName = hierarchicalName;
    }

    /**
     * Additional properties associated with the Glossary Term
     */
    public GlossaryTermProperties getProperties() {
        return properties;
    }
    /**
     * Additional properties associated with the Glossary Term
     */
    public void setProperties(GlossaryTermProperties properties) {
        this.properties = properties;
    }

    /**
     * Deprecated, use properties field instead
Details of the Glossary Term
     */
    public GlossaryTermInfo getGlossaryTermInfo() {
        return glossaryTermInfo;
    }
    /**
     * Deprecated, use properties field instead
Details of the Glossary Term
     */
    public void setGlossaryTermInfo(GlossaryTermInfo glossaryTermInfo) {
        this.glossaryTermInfo = glossaryTermInfo;
    }

    /**
     * The deprecation status of the Glossary Term
     */
    public Deprecation getDeprecation() {
        return deprecation;
    }
    /**
     * The deprecation status of the Glossary Term
     */
    public void setDeprecation(Deprecation deprecation) {
        this.deprecation = deprecation;
    }

    /**
     * Recursively get the lineage of glossary nodes for this entity
     */
    public ParentNodesResult getParentNodes() {
        return parentNodes;
    }
    /**
     * Recursively get the lineage of glossary nodes for this entity
     */
    public void setParentNodes(ParentNodesResult parentNodes) {
        this.parentNodes = parentNodes;
    }



    public static GlossaryTerm.Builder builder() {
        return new GlossaryTerm.Builder();
    }

    public static class Builder {

        private String urn;
        private Ownership ownership;
        private InstitutionalMemory institutionalMemory;
        private EntityType type;
        private String name;
        private String hierarchicalName;
        private GlossaryTermProperties properties;
        private GlossaryTermInfo glossaryTermInfo;
        private Deprecation deprecation;
        private ParentNodesResult parentNodes;

        public Builder() {
        }

        /**
         * The primary key of the glossary term
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * Ownership metadata of the glossary term
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * References to internal resources related to the Glossary Term
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
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
         * Name / id of the glossary term
         */
        @Deprecated
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * hierarchicalName of glossary term
         */
        public Builder setHierarchicalName(String hierarchicalName) {
            this.hierarchicalName = hierarchicalName;
            return this;
        }

        /**
         * Additional properties associated with the Glossary Term
         */
        public Builder setProperties(GlossaryTermProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Deprecated, use properties field instead
Details of the Glossary Term
         */
        public Builder setGlossaryTermInfo(GlossaryTermInfo glossaryTermInfo) {
            this.glossaryTermInfo = glossaryTermInfo;
            return this;
        }

        /**
         * The deprecation status of the Glossary Term
         */
        public Builder setDeprecation(Deprecation deprecation) {
            this.deprecation = deprecation;
            return this;
        }

        /**
         * Recursively get the lineage of glossary nodes for this entity
         */
        public Builder setParentNodes(ParentNodesResult parentNodes) {
            this.parentNodes = parentNodes;
            return this;
        }


        public GlossaryTerm build() {
            return new GlossaryTerm(urn, ownership, institutionalMemory, type, name, hierarchicalName, properties, glossaryTermInfo, deprecation, parentNodes);
        }

    }
}
