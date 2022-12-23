package com.linkedin.datahub.graphql.generated;


/**
 * Criterion to define relationship between field and values
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class PolicyMatchCriterion implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String field;
    @javax.annotation.Nonnull
    private java.util.List<PolicyMatchCriterionValue> values;
    @javax.annotation.Nonnull
    private PolicyMatchCondition condition;

    public PolicyMatchCriterion() {
    }

    public PolicyMatchCriterion(String field, java.util.List<PolicyMatchCriterionValue> values, PolicyMatchCondition condition) {
        this.field = field;
        this.values = values;
        this.condition = condition;
    }

    /**
     * The name of the field that the criterion refers to
e.g. entity_type, entity_urn, domain
     */
    public String getField() {
        return field;
    }
    /**
     * The name of the field that the criterion refers to
e.g. entity_type, entity_urn, domain
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * Values. Matches criterion if any one of the values matches condition (OR-relationship)
     */
    public java.util.List<PolicyMatchCriterionValue> getValues() {
        return values;
    }
    /**
     * Values. Matches criterion if any one of the values matches condition (OR-relationship)
     */
    public void setValues(java.util.List<PolicyMatchCriterionValue> values) {
        this.values = values;
    }

    /**
     * The name of the field that the criterion refers to
     */
    public PolicyMatchCondition getCondition() {
        return condition;
    }
    /**
     * The name of the field that the criterion refers to
     */
    public void setCondition(PolicyMatchCondition condition) {
        this.condition = condition;
    }



    public static PolicyMatchCriterion.Builder builder() {
        return new PolicyMatchCriterion.Builder();
    }

    public static class Builder {

        private String field;
        private java.util.List<PolicyMatchCriterionValue> values;
        private PolicyMatchCondition condition;

        public Builder() {
        }

        /**
         * The name of the field that the criterion refers to
e.g. entity_type, entity_urn, domain
         */
        public Builder setField(String field) {
            this.field = field;
            return this;
        }

        /**
         * Values. Matches criterion if any one of the values matches condition (OR-relationship)
         */
        public Builder setValues(java.util.List<PolicyMatchCriterionValue> values) {
            this.values = values;
            return this;
        }

        /**
         * The name of the field that the criterion refers to
         */
        public Builder setCondition(PolicyMatchCondition condition) {
            this.condition = condition;
            return this;
        }


        public PolicyMatchCriterion build() {
            return new PolicyMatchCriterion(field, values, condition);
        }

    }
}
