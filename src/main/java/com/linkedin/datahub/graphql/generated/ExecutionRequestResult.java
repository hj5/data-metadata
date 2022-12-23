package com.linkedin.datahub.graphql.generated;


/**
 * The result of an ExecutionRequest
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ExecutionRequestResult implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String status;
    private Long startTimeMs;
    private Long durationMs;
    private String report;

    public ExecutionRequestResult() {
    }

    public ExecutionRequestResult(String status, Long startTimeMs, Long durationMs, String report) {
        this.status = status;
        this.startTimeMs = startTimeMs;
        this.durationMs = durationMs;
        this.report = report;
    }

    /**
     * The result of the request, e.g. either SUCCEEDED or FAILED
     */
    public String getStatus() {
        return status;
    }
    /**
     * The result of the request, e.g. either SUCCEEDED or FAILED
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Time at which the task began
     */
    public Long getStartTimeMs() {
        return startTimeMs;
    }
    /**
     * Time at which the task began
     */
    public void setStartTimeMs(Long startTimeMs) {
        this.startTimeMs = startTimeMs;
    }

    /**
     * Duration of the task
     */
    public Long getDurationMs() {
        return durationMs;
    }
    /**
     * Duration of the task
     */
    public void setDurationMs(Long durationMs) {
        this.durationMs = durationMs;
    }

    /**
     * A report about the ingestion run
     */
    public String getReport() {
        return report;
    }
    /**
     * A report about the ingestion run
     */
    public void setReport(String report) {
        this.report = report;
    }



    public static ExecutionRequestResult.Builder builder() {
        return new ExecutionRequestResult.Builder();
    }

    public static class Builder {

        private String status;
        private Long startTimeMs;
        private Long durationMs;
        private String report;

        public Builder() {
        }

        /**
         * The result of the request, e.g. either SUCCEEDED or FAILED
         */
        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        /**
         * Time at which the task began
         */
        public Builder setStartTimeMs(Long startTimeMs) {
            this.startTimeMs = startTimeMs;
            return this;
        }

        /**
         * Duration of the task
         */
        public Builder setDurationMs(Long durationMs) {
            this.durationMs = durationMs;
            return this;
        }

        /**
         * A report about the ingestion run
         */
        public Builder setReport(String report) {
            this.report = report;
            return this;
        }


        public ExecutionRequestResult build() {
            return new ExecutionRequestResult(status, startTimeMs, durationMs, report);
        }

    }
}
