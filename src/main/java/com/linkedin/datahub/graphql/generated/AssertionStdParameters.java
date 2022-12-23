package com.linkedin.datahub.graphql.generated;


/**
 * Parameters for AssertionStdOperators
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class AssertionStdParameters implements java.io.Serializable {

    private AssertionStdParameter value;
    private AssertionStdParameter maxValue;
    private AssertionStdParameter minValue;

    public AssertionStdParameters() {
    }

    public AssertionStdParameters(AssertionStdParameter value, AssertionStdParameter maxValue, AssertionStdParameter minValue) {
        this.value = value;
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    /**
     * The value parameter of an assertion
     */
    public AssertionStdParameter getValue() {
        return value;
    }
    /**
     * The value parameter of an assertion
     */
    public void setValue(AssertionStdParameter value) {
        this.value = value;
    }

    /**
     * The maxValue parameter of an assertion
     */
    public AssertionStdParameter getMaxValue() {
        return maxValue;
    }
    /**
     * The maxValue parameter of an assertion
     */
    public void setMaxValue(AssertionStdParameter maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * The minValue parameter of an assertion
     */
    public AssertionStdParameter getMinValue() {
        return minValue;
    }
    /**
     * The minValue parameter of an assertion
     */
    public void setMinValue(AssertionStdParameter minValue) {
        this.minValue = minValue;
    }



    public static AssertionStdParameters.Builder builder() {
        return new AssertionStdParameters.Builder();
    }

    public static class Builder {

        private AssertionStdParameter value;
        private AssertionStdParameter maxValue;
        private AssertionStdParameter minValue;

        public Builder() {
        }

        /**
         * The value parameter of an assertion
         */
        public Builder setValue(AssertionStdParameter value) {
            this.value = value;
            return this;
        }

        /**
         * The maxValue parameter of an assertion
         */
        public Builder setMaxValue(AssertionStdParameter maxValue) {
            this.maxValue = maxValue;
            return this;
        }

        /**
         * The minValue parameter of an assertion
         */
        public Builder setMinValue(AssertionStdParameter minValue) {
            this.minValue = minValue;
            return this;
        }


        public AssertionStdParameters build() {
            return new AssertionStdParameters(value, maxValue, minValue);
        }

    }
}
