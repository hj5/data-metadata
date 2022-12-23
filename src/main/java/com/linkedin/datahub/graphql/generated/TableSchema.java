package com.linkedin.datahub.graphql.generated;


/**
 * Information about a raw Table Schema
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class TableSchema implements java.io.Serializable, PlatformSchema {

    @javax.annotation.Nonnull
    private String schema;

    public TableSchema() {
    }

    public TableSchema(String schema) {
        this.schema = schema;
    }

    /**
     * Raw table schema
     */
    public String getSchema() {
        return schema;
    }
    /**
     * Raw table schema
     */
    public void setSchema(String schema) {
        this.schema = schema;
    }



    public static TableSchema.Builder builder() {
        return new TableSchema.Builder();
    }

    public static class Builder {

        private String schema;

        public Builder() {
        }

        /**
         * Raw table schema
         */
        public Builder setSchema(String schema) {
            this.schema = schema;
            return this;
        }


        public TableSchema build() {
            return new TableSchema(schema);
        }

    }
}
