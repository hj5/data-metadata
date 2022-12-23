package com.linkedin.datahub.graphql.generated;


/**
 * Input required when listing DataHub Domains
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ListDomainsInput implements java.io.Serializable {

    private Integer start;
    private Integer count;
    private String query;

    public ListDomainsInput() {
    }

    public ListDomainsInput(Integer start, Integer count, String query) {
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



    public static ListDomainsInput.Builder builder() {
        return new ListDomainsInput.Builder();
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


        public ListDomainsInput build() {
            return new ListDomainsInput(start, count, query);
        }

    }
}
