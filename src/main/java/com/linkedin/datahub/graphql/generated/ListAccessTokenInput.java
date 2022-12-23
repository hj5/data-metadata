package com.linkedin.datahub.graphql.generated;


/**
 * Input arguments for listing access tokens
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ListAccessTokenInput implements java.io.Serializable {

    private Integer start;
    private Integer count;
    @javax.annotation.Nonnull
    private java.util.List<FacetFilterInput> filters;

    public ListAccessTokenInput() {
    }

    public ListAccessTokenInput(Integer start, Integer count, java.util.List<FacetFilterInput> filters) {
        this.start = start;
        this.count = count;
        this.filters = filters;
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



    public static ListAccessTokenInput.Builder builder() {
        return new ListAccessTokenInput.Builder();
    }

    public static class Builder {

        private Integer start;
        private Integer count;
        private java.util.List<FacetFilterInput> filters;

        public Builder() {
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


        public ListAccessTokenInput build() {
            return new ListAccessTokenInput(start, count, filters);
        }

    }
}
