package com.linkedin.datahub.graphql.generated;


/**
 * An event representing an event in the assertion evaluation lifecycle.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class AssertionRunEvent implements java.io.Serializable, TimeSeriesAspect {

    @javax.annotation.Nonnull
    private Long timestampMillis;
    @javax.annotation.Nonnull
    private String assertionUrn;
    @javax.annotation.Nonnull
    private String asserteeUrn;
    @javax.annotation.Nonnull
    private String runId;
    @javax.annotation.Nonnull
    private AssertionRunStatus status;
    private BatchSpec batchSpec;
    private PartitionSpec partitionSpec;
    @javax.annotation.Nonnull
    private java.util.List<StringMapEntry> runtimeContext;
    private AssertionResult result;

    public AssertionRunEvent() {
    }

    public AssertionRunEvent(Long timestampMillis, String assertionUrn, String asserteeUrn, String runId, AssertionRunStatus status, BatchSpec batchSpec, PartitionSpec partitionSpec, java.util.List<StringMapEntry> runtimeContext, AssertionResult result) {
        this.timestampMillis = timestampMillis;
        this.assertionUrn = assertionUrn;
        this.asserteeUrn = asserteeUrn;
        this.runId = runId;
        this.status = status;
        this.batchSpec = batchSpec;
        this.partitionSpec = partitionSpec;
        this.runtimeContext = runtimeContext;
        this.result = result;
    }

    /**
     * The time at which the assertion was evaluated
     */
    public Long getTimestampMillis() {
        return timestampMillis;
    }
    /**
     * The time at which the assertion was evaluated
     */
    public void setTimestampMillis(Long timestampMillis) {
        this.timestampMillis = timestampMillis;
    }

    /**
     * Urn of assertion which is evaluated
     */
    public String getAssertionUrn() {
        return assertionUrn;
    }
    /**
     * Urn of assertion which is evaluated
     */
    public void setAssertionUrn(String assertionUrn) {
        this.assertionUrn = assertionUrn;
    }

    /**
     * Urn of entity on which the assertion is applicable
     */
    public String getAsserteeUrn() {
        return asserteeUrn;
    }
    /**
     * Urn of entity on which the assertion is applicable
     */
    public void setAsserteeUrn(String asserteeUrn) {
        this.asserteeUrn = asserteeUrn;
    }

    /**
     * Native (platform-specific) identifier for this run
     */
    public String getRunId() {
        return runId;
    }
    /**
     * Native (platform-specific) identifier for this run
     */
    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * The status of the assertion run as per this timeseries event.
     */
    public AssertionRunStatus getStatus() {
        return status;
    }
    /**
     * The status of the assertion run as per this timeseries event.
     */
    public void setStatus(AssertionRunStatus status) {
        this.status = status;
    }

    /**
     * Specification of the batch which this run is evaluating
     */
    public BatchSpec getBatchSpec() {
        return batchSpec;
    }
    /**
     * Specification of the batch which this run is evaluating
     */
    public void setBatchSpec(BatchSpec batchSpec) {
        this.batchSpec = batchSpec;
    }

    /**
     * Information about the partition that was evaluated
     */
    public PartitionSpec getPartitionSpec() {
        return partitionSpec;
    }
    /**
     * Information about the partition that was evaluated
     */
    public void setPartitionSpec(PartitionSpec partitionSpec) {
        this.partitionSpec = partitionSpec;
    }

    /**
     * Runtime parameters of evaluation
     */
    public java.util.List<StringMapEntry> getRuntimeContext() {
        return runtimeContext;
    }
    /**
     * Runtime parameters of evaluation
     */
    public void setRuntimeContext(java.util.List<StringMapEntry> runtimeContext) {
        this.runtimeContext = runtimeContext;
    }

    /**
     * Results of assertion, present if the status is COMPLETE
     */
    public AssertionResult getResult() {
        return result;
    }
    /**
     * Results of assertion, present if the status is COMPLETE
     */
    public void setResult(AssertionResult result) {
        this.result = result;
    }



    public static AssertionRunEvent.Builder builder() {
        return new AssertionRunEvent.Builder();
    }

    public static class Builder {

        private Long timestampMillis;
        private String assertionUrn;
        private String asserteeUrn;
        private String runId;
        private AssertionRunStatus status;
        private BatchSpec batchSpec;
        private PartitionSpec partitionSpec;
        private java.util.List<StringMapEntry> runtimeContext;
        private AssertionResult result;

        public Builder() {
        }

        /**
         * The time at which the assertion was evaluated
         */
        public Builder setTimestampMillis(Long timestampMillis) {
            this.timestampMillis = timestampMillis;
            return this;
        }

        /**
         * Urn of assertion which is evaluated
         */
        public Builder setAssertionUrn(String assertionUrn) {
            this.assertionUrn = assertionUrn;
            return this;
        }

        /**
         * Urn of entity on which the assertion is applicable
         */
        public Builder setAsserteeUrn(String asserteeUrn) {
            this.asserteeUrn = asserteeUrn;
            return this;
        }

        /**
         * Native (platform-specific) identifier for this run
         */
        public Builder setRunId(String runId) {
            this.runId = runId;
            return this;
        }

        /**
         * The status of the assertion run as per this timeseries event.
         */
        public Builder setStatus(AssertionRunStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Specification of the batch which this run is evaluating
         */
        public Builder setBatchSpec(BatchSpec batchSpec) {
            this.batchSpec = batchSpec;
            return this;
        }

        /**
         * Information about the partition that was evaluated
         */
        public Builder setPartitionSpec(PartitionSpec partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }

        /**
         * Runtime parameters of evaluation
         */
        public Builder setRuntimeContext(java.util.List<StringMapEntry> runtimeContext) {
            this.runtimeContext = runtimeContext;
            return this;
        }

        /**
         * Results of assertion, present if the status is COMPLETE
         */
        public Builder setResult(AssertionResult result) {
            this.result = result;
            return this;
        }


        public AssertionRunEvent build() {
            return new AssertionRunEvent(timestampMillis, assertionUrn, asserteeUrn, runId, status, batchSpec, partitionSpec, runtimeContext, result);
        }

    }
}
