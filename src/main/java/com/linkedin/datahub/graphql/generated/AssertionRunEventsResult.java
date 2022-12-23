package com.linkedin.datahub.graphql.generated;


/**
 * Result returned when fetching run events for an assertion.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class AssertionRunEventsResult implements java.io.Serializable {

    private int total;
    private int failed;
    private int succeeded;
    @javax.annotation.Nonnull
    private java.util.List<AssertionRunEvent> runEvents;

    public AssertionRunEventsResult() {
    }

    public AssertionRunEventsResult(int total, int failed, int succeeded, java.util.List<AssertionRunEvent> runEvents) {
        this.total = total;
        this.failed = failed;
        this.succeeded = succeeded;
        this.runEvents = runEvents;
    }

    /**
     * The total number of run events returned
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of run events returned
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The number of failed run events
     */
    public int getFailed() {
        return failed;
    }
    /**
     * The number of failed run events
     */
    public void setFailed(int failed) {
        this.failed = failed;
    }

    /**
     * The number of succeeded run events
     */
    public int getSucceeded() {
        return succeeded;
    }
    /**
     * The number of succeeded run events
     */
    public void setSucceeded(int succeeded) {
        this.succeeded = succeeded;
    }

    /**
     * The run events themselves
     */
    public java.util.List<AssertionRunEvent> getRunEvents() {
        return runEvents;
    }
    /**
     * The run events themselves
     */
    public void setRunEvents(java.util.List<AssertionRunEvent> runEvents) {
        this.runEvents = runEvents;
    }



    public static AssertionRunEventsResult.Builder builder() {
        return new AssertionRunEventsResult.Builder();
    }

    public static class Builder {

        private int total;
        private int failed;
        private int succeeded;
        private java.util.List<AssertionRunEvent> runEvents;

        public Builder() {
        }

        /**
         * The total number of run events returned
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The number of failed run events
         */
        public Builder setFailed(int failed) {
            this.failed = failed;
            return this;
        }

        /**
         * The number of succeeded run events
         */
        public Builder setSucceeded(int succeeded) {
            this.succeeded = succeeded;
            return this;
        }

        /**
         * The run events themselves
         */
        public Builder setRunEvents(java.util.List<AssertionRunEvent> runEvents) {
            this.runEvents = runEvents;
            return this;
        }


        public AssertionRunEventsResult build() {
            return new AssertionRunEventsResult(total, failed, succeeded, runEvents);
        }

    }
}
