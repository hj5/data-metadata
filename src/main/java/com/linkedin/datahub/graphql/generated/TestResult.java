package com.linkedin.datahub.graphql.generated;


/**
 * The result of running a test
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class TestResult implements java.io.Serializable {

    private Test test;
    @javax.annotation.Nonnull
    private TestResultType type;

    public TestResult() {
    }

    public TestResult(Test test, TestResultType type) {
        this.test = test;
        this.type = type;
    }

    /**
     * The test itself, or null if the test has been deleted
     */
    public Test getTest() {
        return test;
    }
    /**
     * The test itself, or null if the test has been deleted
     */
    public void setTest(Test test) {
        this.test = test;
    }

    /**
     * The final result, e.g. either SUCCESS or FAILURE.
     */
    public TestResultType getType() {
        return type;
    }
    /**
     * The final result, e.g. either SUCCESS or FAILURE.
     */
    public void setType(TestResultType type) {
        this.type = type;
    }



    public static TestResult.Builder builder() {
        return new TestResult.Builder();
    }

    public static class Builder {

        private Test test;
        private TestResultType type;

        public Builder() {
        }

        /**
         * The test itself, or null if the test has been deleted
         */
        public Builder setTest(Test test) {
            this.test = test;
            return this;
        }

        /**
         * The final result, e.g. either SUCCESS or FAILURE.
         */
        public Builder setType(TestResultType type) {
            this.type = type;
            return this;
        }


        public TestResult build() {
            return new TestResult(test, type);
        }

    }
}
