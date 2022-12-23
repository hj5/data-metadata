package com.linkedin.datahub.graphql.generated;


/**
 * Input arguments for listing Ingestion Sources
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ListIngestionSourcesInput implements java.io.Serializable {

    private Integer start;
    private Integer count;
    private String query;

    public ListIngestionSourcesInput() {
    }

    public ListIngestionSourcesInput(Integer start, Integer count, String query) {
        this.start = start;
        this.count = count;
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

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }



    public static ListIngestionSourcesInput.Builder builder() {
        return new ListIngestionSourcesInput.Builder();
    }

    public static class Builder {

        private Integer start;
        private Integer count;
        private String query;

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

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }


        public ListIngestionSourcesInput build() {
            return new ListIngestionSourcesInput(start, count, query);
        }

    }
}
