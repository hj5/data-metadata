package com.linkedin.datahub.graphql.generated;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class BatchSpec implements java.io.Serializable {

    private String nativeBatchId;
    private String query;
    private Integer limit;
    @javax.annotation.Nonnull
    private java.util.List<StringMapEntry> customProperties;

    public BatchSpec() {
    }

    public BatchSpec(String nativeBatchId, String query, Integer limit, java.util.List<StringMapEntry> customProperties) {
        this.nativeBatchId = nativeBatchId;
        this.query = query;
        this.limit = limit;
        this.customProperties = customProperties;
    }

    /**
     * The native identifier as specified by the system operating on the batch.
     */
    public String getNativeBatchId() {
        return nativeBatchId;
    }
    /**
     * The native identifier as specified by the system operating on the batch.
     */
    public void setNativeBatchId(String nativeBatchId) {
        this.nativeBatchId = nativeBatchId;
    }

    /**
     * A query that identifies a batch of data
     */
    public String getQuery() {
        return query;
    }
    /**
     * A query that identifies a batch of data
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * Any limit to the number of rows in the batch, if applied
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * Any limit to the number of rows in the batch, if applied
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * Custom properties of the Batch
     */
    public java.util.List<StringMapEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * Custom properties of the Batch
     */
    public void setCustomProperties(java.util.List<StringMapEntry> customProperties) {
        this.customProperties = customProperties;
    }



    public static BatchSpec.Builder builder() {
        return new BatchSpec.Builder();
    }

    public static class Builder {

        private String nativeBatchId;
        private String query;
        private Integer limit;
        private java.util.List<StringMapEntry> customProperties;

        public Builder() {
        }

        /**
         * The native identifier as specified by the system operating on the batch.
         */
        public Builder setNativeBatchId(String nativeBatchId) {
            this.nativeBatchId = nativeBatchId;
            return this;
        }

        /**
         * A query that identifies a batch of data
         */
        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        /**
         * Any limit to the number of rows in the batch, if applied
         */
        public Builder setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Custom properties of the Batch
         */
        public Builder setCustomProperties(java.util.List<StringMapEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }


        public BatchSpec build() {
            return new BatchSpec(nativeBatchId, query, limit, customProperties);
        }

    }
}
