package com.linkedin.datahub.graphql.generated;


/**
 * A Glossary Node, or a directory in a Business Glossary represents a container of
Glossary Terms or other Glossary Nodes
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class GlossaryNode implements java.io.Serializable, Entity {

    @javax.annotation.Nonnull
    private String urn;
    private Ownership ownership;
    @javax.annotation.Nonnull
    private EntityType type;
    private GlossaryNodeProperties properties;
    private ParentNodesResult parentNodes;

    public GlossaryNode() {
    }

    public GlossaryNode(String urn, Ownership ownership, EntityType type, GlossaryNodeProperties properties, ParentNodesResult parentNodes) {
        this.urn = urn;
        this.ownership = ownership;
        this.type = type;
        this.properties = properties;
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
     * Additional properties associated with the Glossary Term
     */
    public GlossaryNodeProperties getProperties() {
        return properties;
    }
    /**
     * Additional properties associated with the Glossary Term
     */
    public void setProperties(GlossaryNodeProperties properties) {
        this.properties = properties;
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



    public static GlossaryNode.Builder builder() {
        return new GlossaryNode.Builder();
    }

    public static class Builder {

        private String urn;
        private Ownership ownership;
        private EntityType type;
        private GlossaryNodeProperties properties;
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
         * A standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * Additional properties associated with the Glossary Term
         */
        public Builder setProperties(GlossaryNodeProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Recursively get the lineage of glossary nodes for this entity
         */
        public Builder setParentNodes(ParentNodesResult parentNodes) {
            this.parentNodes = parentNodes;
            return this;
        }


        public GlossaryNode build() {
            return new GlossaryNode(urn, ownership, type, properties, parentNodes);
        }

    }
}
