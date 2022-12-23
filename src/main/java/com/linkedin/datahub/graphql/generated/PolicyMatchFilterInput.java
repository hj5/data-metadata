package com.linkedin.datahub.graphql.generated;


/**
 * Filter object that encodes a complex filter logic with OR + AND
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class PolicyMatchFilterInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<PolicyMatchCriterionInput> criteria;

    public PolicyMatchFilterInput() {
    }

    public PolicyMatchFilterInput(java.util.List<PolicyMatchCriterionInput> criteria) {
        this.criteria = criteria;
    }

    public java.util.List<PolicyMatchCriterionInput> getCriteria() {
        return criteria;
    }
    public void setCriteria(java.util.List<PolicyMatchCriterionInput> criteria) {
        this.criteria = criteria;
    }



    public static PolicyMatchFilterInput.Builder builder() {
        return new PolicyMatchFilterInput.Builder();
    }

    public static class Builder {

        private java.util.List<PolicyMatchCriterionInput> criteria;

        public Builder() {
        }

        public Builder setCriteria(java.util.List<PolicyMatchCriterionInput> criteria) {
            this.criteria = criteria;
            return this;
        }


        public PolicyMatchFilterInput build() {
            return new PolicyMatchFilterInput(criteria);
        }

    }
}
