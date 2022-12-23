package com.linkedin.datahub.graphql.generated;


/**
 * A state change event in the data process instance lifecycle
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class DataProcessRunEvent implements java.io.Serializable, TimeSeriesAspect {

    private DataProcessRunStatus status;
    private Integer attempt;
    private DataProcessInstanceRunResult result;
    @javax.annotation.Nonnull
    private Long timestampMillis;

    public DataProcessRunEvent() {
    }

    public DataProcessRunEvent(DataProcessRunStatus status, Integer attempt, DataProcessInstanceRunResult result, Long timestampMillis) {
        this.status = status;
        this.attempt = attempt;
        this.result = result;
        this.timestampMillis = timestampMillis;
    }

    /**
     * The status of the data process instance
     */
    public DataProcessRunStatus getStatus() {
        return status;
    }
    /**
     * The status of the data process instance
     */
    public void setStatus(DataProcessRunStatus status) {
        this.status = status;
    }

    /**
     * The try number that this instance run is in
     */
    public Integer getAttempt() {
        return attempt;
    }
    /**
     * The try number that this instance run is in
     */
    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    /**
     * The result of a run
     */
    public DataProcessInstanceRunResult getResult() {
        return result;
    }
    /**
     * The result of a run
     */
    public void setResult(DataProcessInstanceRunResult result) {
        this.result = result;
    }

    /**
     * The timestamp associated with the run event in milliseconds
     */
    public Long getTimestampMillis() {
        return timestampMillis;
    }
    /**
     * The timestamp associated with the run event in milliseconds
     */
    public void setTimestampMillis(Long timestampMillis) {
        this.timestampMillis = timestampMillis;
    }



    public static DataProcessRunEvent.Builder builder() {
        return new DataProcessRunEvent.Builder();
    }

    public static class Builder {

        private DataProcessRunStatus status;
        private Integer attempt;
        private DataProcessInstanceRunResult result;
        private Long timestampMillis;

        public Builder() {
        }

        /**
         * The status of the data process instance
         */
        public Builder setStatus(DataProcessRunStatus status) {
            this.status = status;
            return this;
        }

        /**
         * The try number that this instance run is in
         */
        public Builder setAttempt(Integer attempt) {
            this.attempt = attempt;
            return this;
        }

        /**
         * The result of a run
         */
        public Builder setResult(DataProcessInstanceRunResult result) {
            this.result = result;
            return this;
        }

        /**
         * The timestamp associated with the run event in milliseconds
         */
        public Builder setTimestampMillis(Long timestampMillis) {
            this.timestampMillis = timestampMillis;
            return this;
        }


        public DataProcessRunEvent build() {
            return new DataProcessRunEvent(status, attempt, result, timestampMillis);
        }

    }
}
