package com.linkedin.datahub.graphql.generated;


/**
 * A Dataset schema field (i.e. column)
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class SchemaFieldRef implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private String path;

    public SchemaFieldRef() {
    }

    public SchemaFieldRef(String urn, String path) {
        this.urn = urn;
        this.path = path;
    }

    /**
     * A schema field urn
     */
    public String getUrn() {
        return urn;
    }
    /**
     * A schema field urn
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * A schema field path
     */
    public String getPath() {
        return path;
    }
    /**
     * A schema field path
     */
    public void setPath(String path) {
        this.path = path;
    }



    public static SchemaFieldRef.Builder builder() {
        return new SchemaFieldRef.Builder();
    }

    public static class Builder {

        private String urn;
        private String path;

        public Builder() {
        }

        /**
         * A schema field urn
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * A schema field path
         */
        public Builder setPath(String path) {
            this.path = path;
            return this;
        }


        public SchemaFieldRef build() {
            return new SchemaFieldRef(urn, path);
        }

    }
}
