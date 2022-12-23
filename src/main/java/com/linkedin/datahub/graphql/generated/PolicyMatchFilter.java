package com.linkedin.datahub.graphql.generated;


/**
 * Filter object that encodes a complex filter logic with OR + AND
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class PolicyMatchFilter implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<PolicyMatchCriterion> criteria;

    public PolicyMatchFilter() {
    }

    public PolicyMatchFilter(java.util.List<PolicyMatchCriterion> criteria) {
        this.criteria = criteria;
    }

    /**
     * List of criteria to apply
     */
    public java.util.List<PolicyMatchCriterion> getCriteria() {
        return criteria;
    }
    /**
     * List of criteria to apply
     */
    public void setCriteria(java.util.List<PolicyMatchCriterion> criteria) {
        this.criteria = criteria;
    }



    public static PolicyMatchFilter.Builder builder() {
        return new PolicyMatchFilter.Builder();
    }

    public static class Builder {

        private java.util.List<PolicyMatchCriterion> criteria;

        public Builder() {
        }

        /**
         * List of criteria to apply
         */
        public Builder setCriteria(java.util.List<PolicyMatchCriterion> criteria) {
            this.criteria = criteria;
            return this;
        }


        public PolicyMatchFilter build() {
            return new PolicyMatchFilter(criteria);
        }

    }
}
