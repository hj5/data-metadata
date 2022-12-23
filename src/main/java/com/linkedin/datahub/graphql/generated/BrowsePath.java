package com.linkedin.datahub.graphql.generated;


/**
 * A hierarchical entity path
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class BrowsePath implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<String> path;

    public BrowsePath() {
    }

    public BrowsePath(java.util.List<String> path) {
        this.path = path;
    }

    /**
     * The components of the browse path
     */
    public java.util.List<String> getPath() {
        return path;
    }
    /**
     * The components of the browse path
     */
    public void setPath(java.util.List<String> path) {
        this.path = path;
    }



    public static BrowsePath.Builder builder() {
        return new BrowsePath.Builder();
    }

    public static class Builder {

        private java.util.List<String> path;

        public Builder() {
        }

        /**
         * The components of the browse path
         */
        public Builder setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }


        public BrowsePath build() {
            return new BrowsePath(path);
        }

    }
}
