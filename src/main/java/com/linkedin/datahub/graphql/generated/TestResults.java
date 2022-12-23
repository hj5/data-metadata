package com.linkedin.datahub.graphql.generated;


/**
 * A set of test results
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class TestResults implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<TestResult> passing;
    @javax.annotation.Nonnull
    private java.util.List<TestResult> failing;

    public TestResults() {
    }

    public TestResults(java.util.List<TestResult> passing, java.util.List<TestResult> failing) {
        this.passing = passing;
        this.failing = failing;
    }

    /**
     * The tests passing
     */
    public java.util.List<TestResult> getPassing() {
        return passing;
    }
    /**
     * The tests passing
     */
    public void setPassing(java.util.List<TestResult> passing) {
        this.passing = passing;
    }

    /**
     * The tests failing
     */
    public java.util.List<TestResult> getFailing() {
        return failing;
    }
    /**
     * The tests failing
     */
    public void setFailing(java.util.List<TestResult> failing) {
        this.failing = failing;
    }



    public static TestResults.Builder builder() {
        return new TestResults.Builder();
    }

    public static class Builder {

        private java.util.List<TestResult> passing;
        private java.util.List<TestResult> failing;

        public Builder() {
        }

        /**
         * The tests passing
         */
        public Builder setPassing(java.util.List<TestResult> passing) {
            this.passing = passing;
            return this;
        }

        /**
         * The tests failing
         */
        public Builder setFailing(java.util.List<TestResult> failing) {
            this.failing = failing;
            return this;
        }


        public TestResults build() {
            return new TestResults(passing, failing);
        }

    }
}
