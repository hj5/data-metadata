package com.linkedin.datahub.graphql.generated;


/**
 * All of the parent nodes for GlossaryTerms and GlossaryNodes
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ParentNodesResult implements java.io.Serializable {

    private int count;
    @javax.annotation.Nonnull
    private java.util.List<GlossaryNode> nodes;

    public ParentNodesResult() {
    }

    public ParentNodesResult(int count, java.util.List<GlossaryNode> nodes) {
        this.count = count;
        this.nodes = nodes;
    }

    /**
     * The number of parent nodes bubbling up for this entity
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of parent nodes bubbling up for this entity
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * A list of parent nodes in order from direct parent, to parent's parent etc. If there are no nodes, return an empty list
     */
    public java.util.List<GlossaryNode> getNodes() {
        return nodes;
    }
    /**
     * A list of parent nodes in order from direct parent, to parent's parent etc. If there are no nodes, return an empty list
     */
    public void setNodes(java.util.List<GlossaryNode> nodes) {
        this.nodes = nodes;
    }



    public static ParentNodesResult.Builder builder() {
        return new ParentNodesResult.Builder();
    }

    public static class Builder {

        private int count;
        private java.util.List<GlossaryNode> nodes;

        public Builder() {
        }

        /**
         * The number of parent nodes bubbling up for this entity
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * A list of parent nodes in order from direct parent, to parent's parent etc. If there are no nodes, return an empty list
         */
        public Builder setNodes(java.util.List<GlossaryNode> nodes) {
            this.nodes = nodes;
            return this;
        }


        public ParentNodesResult build() {
            return new ParentNodesResult(count, nodes);
        }

    }
}
