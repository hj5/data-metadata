package com.linkedin.datahub.graphql.generated;


/**
 * Input for listing DataHub Secrets
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ListSecretsResult implements java.io.Serializable {

    private Integer start;
    private Integer count;
    private Integer total;
    @javax.annotation.Nonnull
    private java.util.List<Secret> secrets;

    public ListSecretsResult() {
    }

    public ListSecretsResult(Integer start, Integer count, Integer total, java.util.List<Secret> secrets) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.secrets = secrets;
    }

    /**
     * The starting offset of the result set
     */
    public Integer getStart() {
        return start;
    }
    /**
     * The starting offset of the result set
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * The number of results to be returned
     */
    public Integer getCount() {
        return count;
    }
    /**
     * The number of results to be returned
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * The total number of results in the result set
     */
    public Integer getTotal() {
        return total;
    }
    /**
     * The total number of results in the result set
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * The secrets themselves
     */
    public java.util.List<Secret> getSecrets() {
        return secrets;
    }
    /**
     * The secrets themselves
     */
    public void setSecrets(java.util.List<Secret> secrets) {
        this.secrets = secrets;
    }



    public static ListSecretsResult.Builder builder() {
        return new ListSecretsResult.Builder();
    }

    public static class Builder {

        private Integer start;
        private Integer count;
        private Integer total;
        private java.util.List<Secret> secrets;

        public Builder() {
        }

        /**
         * The starting offset of the result set
         */
        public Builder setStart(Integer start) {
            this.start = start;
            return this;
        }

        /**
         * The number of results to be returned
         */
        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of results in the result set
         */
        public Builder setTotal(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * The secrets themselves
         */
        public Builder setSecrets(java.util.List<Secret> secrets) {
            this.secrets = secrets;
            return this;
        }


        public ListSecretsResult build() {
            return new ListSecretsResult(start, count, total, secrets);
        }

    }
}
