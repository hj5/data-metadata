package com.linkedin.datahub.graphql.generated;


/**
 * Input required to fetch the entities inside of a container.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ContainerEntitiesInput implements java.io.Serializable {

    private String query;
    private Integer start;
    private Integer count;
    @javax.annotation.Nonnull
    private java.util.List<FacetFilterInput> filters;

    public ContainerEntitiesInput() {
    }

    public ContainerEntitiesInput(String query, Integer start, Integer count, java.util.List<FacetFilterInput> filters) {
        this.query = query;
        this.start = start;
        this.count = count;
        this.filters = filters;
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



    public static ContainerEntitiesInput.Builder builder() {
        return new ContainerEntitiesInput.Builder();
    }

    public static class Builder {

        private String query;
        private Integer start;
        private Integer count;
        private java.util.List<FacetFilterInput> filters;

        public Builder() {
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


        public ContainerEntitiesInput build() {
            return new ContainerEntitiesInput(query, start, count, filters);
        }

    }
}
