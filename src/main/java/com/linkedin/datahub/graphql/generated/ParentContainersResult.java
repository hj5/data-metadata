package com.linkedin.datahub.graphql.generated;


/**
 * All of the parent containers for a given entity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ParentContainersResult implements java.io.Serializable {

    private int count;
    @javax.annotation.Nonnull
    private java.util.List<Container> containers;

    public ParentContainersResult() {
    }

    public ParentContainersResult(int count, java.util.List<Container> containers) {
        this.count = count;
        this.containers = containers;
    }

    /**
     * The number of containers bubbling up for this entity
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of containers bubbling up for this entity
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * A list of parent containers in order from direct parent, to parent's parent etc. If there are no containers, return an emty list
     */
    public java.util.List<Container> getContainers() {
        return containers;
    }
    /**
     * A list of parent containers in order from direct parent, to parent's parent etc. If there are no containers, return an emty list
     */
    public void setContainers(java.util.List<Container> containers) {
        this.containers = containers;
    }



    public static ParentContainersResult.Builder builder() {
        return new ParentContainersResult.Builder();
    }

    public static class Builder {

        private int count;
        private java.util.List<Container> containers;

        public Builder() {
        }

        /**
         * The number of containers bubbling up for this entity
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * A list of parent containers in order from direct parent, to parent's parent etc. If there are no containers, return an emty list
         */
        public Builder setContainers(java.util.List<Container> containers) {
            this.containers = containers;
            return this;
        }


        public ParentContainersResult build() {
            return new ParentContainersResult(count, containers);
        }

    }
}
