package com.linkedin.datahub.graphql.generated;


/**
 * A list of lineage information associated with a source Entity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class EntityLineageResult implements java.io.Serializable {

    private Integer start;
    private Integer count;
    private Integer total;
    @javax.annotation.Nonnull
    private java.util.List<LineageRelationship> relationships;

    public EntityLineageResult() {
    }

    public EntityLineageResult(Integer start, Integer count, Integer total, java.util.List<LineageRelationship> relationships) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.relationships = relationships;
    }

    /**
     * Start offset of the result set
     */
    public Integer getStart() {
        return start;
    }
    /**
     * Start offset of the result set
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * Number of results in the returned result set
     */
    public Integer getCount() {
        return count;
    }
    /**
     * Number of results in the returned result set
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Total number of results in the result set
     */
    public Integer getTotal() {
        return total;
    }
    /**
     * Total number of results in the result set
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * Relationships in the result set
     */
    public java.util.List<LineageRelationship> getRelationships() {
        return relationships;
    }
    /**
     * Relationships in the result set
     */
    public void setRelationships(java.util.List<LineageRelationship> relationships) {
        this.relationships = relationships;
    }



    public static EntityLineageResult.Builder builder() {
        return new EntityLineageResult.Builder();
    }

    public static class Builder {

        private Integer start;
        private Integer count;
        private Integer total;
        private java.util.List<LineageRelationship> relationships;

        public Builder() {
        }

        /**
         * Start offset of the result set
         */
        public Builder setStart(Integer start) {
            this.start = start;
            return this;
        }

        /**
         * Number of results in the returned result set
         */
        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Total number of results in the result set
         */
        public Builder setTotal(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * Relationships in the result set
         */
        public Builder setRelationships(java.util.List<LineageRelationship> relationships) {
            this.relationships = relationships;
            return this;
        }


        public EntityLineageResult build() {
            return new EntityLineageResult(start, count, total, relationships);
        }

    }
}
