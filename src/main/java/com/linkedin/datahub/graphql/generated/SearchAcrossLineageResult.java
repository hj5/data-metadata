package com.linkedin.datahub.graphql.generated;


/**
 * Individual search result from a search across relationships query (has added metadata about the path)
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class SearchAcrossLineageResult implements java.io.Serializable {

    @javax.annotation.Nonnull
    private Entity entity;
    @javax.annotation.Nonnull
    private java.util.List<SearchInsight> insights;
    @javax.annotation.Nonnull
    private java.util.List<MatchedField> matchedFields;
    @javax.annotation.Nonnull
    private java.util.List<Entity> path;
    private int degree;

    public SearchAcrossLineageResult() {
    }

    public SearchAcrossLineageResult(Entity entity, java.util.List<SearchInsight> insights, java.util.List<MatchedField> matchedFields, java.util.List<Entity> path, int degree) {
        this.entity = entity;
        this.insights = insights;
        this.matchedFields = matchedFields;
        this.path = path;
        this.degree = degree;
    }

    /**
     * The resolved DataHub Metadata Entity matching the search query
     */
    public Entity getEntity() {
        return entity;
    }
    /**
     * The resolved DataHub Metadata Entity matching the search query
     */
    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    /**
     * Insights about why the search result was matched
     */
    public java.util.List<SearchInsight> getInsights() {
        return insights;
    }
    /**
     * Insights about why the search result was matched
     */
    public void setInsights(java.util.List<SearchInsight> insights) {
        this.insights = insights;
    }

    /**
     * Matched field hint
     */
    public java.util.List<MatchedField> getMatchedFields() {
        return matchedFields;
    }
    /**
     * Matched field hint
     */
    public void setMatchedFields(java.util.List<MatchedField> matchedFields) {
        this.matchedFields = matchedFields;
    }

    /**
     * Optional list of entities between the source and destination node
     */
    public java.util.List<Entity> getPath() {
        return path;
    }
    /**
     * Optional list of entities between the source and destination node
     */
    public void setPath(java.util.List<Entity> path) {
        this.path = path;
    }

    /**
     * Degree of relationship (number of hops to get to entity)
     */
    public int getDegree() {
        return degree;
    }
    /**
     * Degree of relationship (number of hops to get to entity)
     */
    public void setDegree(int degree) {
        this.degree = degree;
    }



    public static SearchAcrossLineageResult.Builder builder() {
        return new SearchAcrossLineageResult.Builder();
    }

    public static class Builder {

        private Entity entity;
        private java.util.List<SearchInsight> insights;
        private java.util.List<MatchedField> matchedFields;
        private java.util.List<Entity> path;
        private int degree;

        public Builder() {
        }

        /**
         * The resolved DataHub Metadata Entity matching the search query
         */
        public Builder setEntity(Entity entity) {
            this.entity = entity;
            return this;
        }

        /**
         * Insights about why the search result was matched
         */
        public Builder setInsights(java.util.List<SearchInsight> insights) {
            this.insights = insights;
            return this;
        }

        /**
         * Matched field hint
         */
        public Builder setMatchedFields(java.util.List<MatchedField> matchedFields) {
            this.matchedFields = matchedFields;
            return this;
        }

        /**
         * Optional list of entities between the source and destination node
         */
        public Builder setPath(java.util.List<Entity> path) {
            this.path = path;
            return this;
        }

        /**
         * Degree of relationship (number of hops to get to entity)
         */
        public Builder setDegree(int degree) {
            this.degree = degree;
            return this;
        }


        public SearchAcrossLineageResult build() {
            return new SearchAcrossLineageResult(entity, insights, matchedFields, path, degree);
        }

    }
}
