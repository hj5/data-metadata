package com.linkedin.datahub.graphql.generated;


/**
 * The result obtained when listing DataHub Domains
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ListDomainsResult implements java.io.Serializable {

    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<Domain> domains;

    public ListDomainsResult() {
    }

    public ListDomainsResult(int start, int count, int total, java.util.List<Domain> domains) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.domains = domains;
    }

    /**
     * The starting offset of the result set returned
     */
    public int getStart() {
        return start;
    }
    /**
     * The starting offset of the result set returned
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * The number of Domains in the returned result set
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of Domains in the returned result set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * The total number of Domains in the result set
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of Domains in the result set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The Domains themselves
     */
    public java.util.List<Domain> getDomains() {
        return domains;
    }
    /**
     * The Domains themselves
     */
    public void setDomains(java.util.List<Domain> domains) {
        this.domains = domains;
    }



    public static ListDomainsResult.Builder builder() {
        return new ListDomainsResult.Builder();
    }

    public static class Builder {

        private int start;
        private int count;
        private int total;
        private java.util.List<Domain> domains;

        public Builder() {
        }

        /**
         * The starting offset of the result set returned
         */
        public Builder setStart(int start) {
            this.start = start;
            return this;
        }

        /**
         * The number of Domains in the returned result set
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of Domains in the result set
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The Domains themselves
         */
        public Builder setDomains(java.util.List<Domain> domains) {
            this.domains = domains;
            return this;
        }


        public ListDomainsResult build() {
            return new ListDomainsResult(start, count, total, domains);
        }

    }
}
