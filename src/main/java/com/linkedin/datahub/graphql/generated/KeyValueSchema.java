package com.linkedin.datahub.graphql.generated;


/**
 * Information about a raw Key Value Schema
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class KeyValueSchema implements java.io.Serializable, PlatformSchema {

    @javax.annotation.Nonnull
    private String keySchema;
    @javax.annotation.Nonnull
    private String valueSchema;

    public KeyValueSchema() {
    }

    public KeyValueSchema(String keySchema, String valueSchema) {
        this.keySchema = keySchema;
        this.valueSchema = valueSchema;
    }

    /**
     * Raw key schema
     */
    public String getKeySchema() {
        return keySchema;
    }
    /**
     * Raw key schema
     */
    public void setKeySchema(String keySchema) {
        this.keySchema = keySchema;
    }

    /**
     * Raw value schema
     */
    public String getValueSchema() {
        return valueSchema;
    }
    /**
     * Raw value schema
     */
    public void setValueSchema(String valueSchema) {
        this.valueSchema = valueSchema;
    }



    public static KeyValueSchema.Builder builder() {
        return new KeyValueSchema.Builder();
    }

    public static class Builder {

        private String keySchema;
        private String valueSchema;

        public Builder() {
        }

        /**
         * Raw key schema
         */
        public Builder setKeySchema(String keySchema) {
            this.keySchema = keySchema;
            return this;
        }

        /**
         * Raw value schema
         */
        public Builder setValueSchema(String valueSchema) {
            this.valueSchema = valueSchema;
            return this;
        }


        public KeyValueSchema build() {
            return new KeyValueSchema(keySchema, valueSchema);
        }

    }
}
