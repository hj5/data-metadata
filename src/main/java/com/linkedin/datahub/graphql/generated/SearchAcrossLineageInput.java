package com.linkedin.datahub.graphql.generated;


/**
 * Input arguments for a search query over the results of a multi-hop graph query
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class SearchAcrossLineageInput implements java.io.Serializable {

    private String urn;
    @javax.annotation.Nonnull
    private LineageDirection direction;
    @javax.annotation.Nonnull
    private java.util.List<EntityType> types;
    private String query;
    private Integer start;
    private Integer count;
    @javax.annotation.Nonnull
    private java.util.List<FacetFilterInput> filters;

    public SearchAcrossLineageInput() {
    }

    public SearchAcrossLineageInput(String urn, LineageDirection direction, java.util.List<EntityType> types, String query, Integer start, Integer count, java.util.List<FacetFilterInput> filters) {
        this.urn = urn;
        this.direction = direction;
        this.types = types;
        this.query = query;
        this.start = start;
        this.count = count;
        this.filters = filters;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public LineageDirection getDirection() {
        return direction;
    }
    public void setDirection(LineageDirection direction) {
        this.direction = direction;
    }

    public java.util.List<EntityType> getTypes() {
        return types;
    }
    public void setTypes(java.util.List<EntityType> types) {
        this.types = types;
    }

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }

    public Integer getStart() {
        return start;
    }
    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }

    public java.util.List<FacetFilterInput> getFilters() {
        return filters;
    }
    public void setFilters(java.util.List<FacetFilterInput> filters) {
        this.filters = filters;
    }



    public static SearchAcrossLineageInput.Builder builder() {
        return new SearchAcrossLineageInput.Builder();
    }

    public static class Builder {

        private String urn;
        private LineageDirection direction;
        private java.util.List<EntityType> types;
        private String query;
        private Integer start;
        private Integer count;
        private java.util.List<FacetFilterInput> filters;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        public Builder setDirection(LineageDirection direction) {
            this.direction = direction;
            return this;
        }

        public Builder setTypes(java.util.List<EntityType> types) {
            this.types = types;
            return this;
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder setStart(Integer start) {
            this.start = start;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }

        public Builder setFilters(java.util.List<FacetFilterInput> filters) {
            this.filters = filters;
            return this;
        }


        public SearchAcrossLineageInput build() {
            return new SearchAcrossLineageInput(urn, direction, types, query, start, count, filters);
        }

    }
}
