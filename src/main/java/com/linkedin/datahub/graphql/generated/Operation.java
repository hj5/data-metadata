package com.linkedin.datahub.graphql.generated;


/**
 * Operational info for an entity.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class Operation implements java.io.Serializable, TimeSeriesAspect {

    @javax.annotation.Nonnull
    private Long timestampMillis;
    private String actor;
    @javax.annotation.Nonnull
    private OperationType operationType;
    private String customOperationType;
    private OperationSourceType sourceType;
    private Long numAffectedRows;
    @javax.annotation.Nonnull
    private java.util.List<String> affectedDatasets;
    @javax.annotation.Nonnull
    private Long lastUpdatedTimestamp;
    private String partition;
    @javax.annotation.Nonnull
    private java.util.List<StringMapEntry> customProperties;

    public Operation() {
    }

    public Operation(Long timestampMillis, String actor, OperationType operationType, String customOperationType, OperationSourceType sourceType, Long numAffectedRows, java.util.List<String> affectedDatasets, Long lastUpdatedTimestamp, String partition, java.util.List<StringMapEntry> customProperties) {
        this.timestampMillis = timestampMillis;
        this.actor = actor;
        this.operationType = operationType;
        this.customOperationType = customOperationType;
        this.sourceType = sourceType;
        this.numAffectedRows = numAffectedRows;
        this.affectedDatasets = affectedDatasets;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.partition = partition;
        this.customProperties = customProperties;
    }

    /**
     * The time at which the operation was reported
     */
    public Long getTimestampMillis() {
        return timestampMillis;
    }
    /**
     * The time at which the operation was reported
     */
    public void setTimestampMillis(Long timestampMillis) {
        this.timestampMillis = timestampMillis;
    }

    /**
     * Actor who issued this operation.
     */
    public String getActor() {
        return actor;
    }
    /**
     * Actor who issued this operation.
     */
    public void setActor(String actor) {
        this.actor = actor;
    }

    /**
     * Operation type of change.
     */
    public OperationType getOperationType() {
        return operationType;
    }
    /**
     * Operation type of change.
     */
    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    /**
     * A custom operation type
     */
    public String getCustomOperationType() {
        return customOperationType;
    }
    /**
     * A custom operation type
     */
    public void setCustomOperationType(String customOperationType) {
        this.customOperationType = customOperationType;
    }

    /**
     * Source of the operation
     */
    public OperationSourceType getSourceType() {
        return sourceType;
    }
    /**
     * Source of the operation
     */
    public void setSourceType(OperationSourceType sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * How many rows were affected by this operation.
     */
    public Long getNumAffectedRows() {
        return numAffectedRows;
    }
    /**
     * How many rows were affected by this operation.
     */
    public void setNumAffectedRows(Long numAffectedRows) {
        this.numAffectedRows = numAffectedRows;
    }

    /**
     * Which other datasets were affected by this operation.
     */
    public java.util.List<String> getAffectedDatasets() {
        return affectedDatasets;
    }
    /**
     * Which other datasets were affected by this operation.
     */
    public void setAffectedDatasets(java.util.List<String> affectedDatasets) {
        this.affectedDatasets = affectedDatasets;
    }

    /**
     * When time at which the asset was actually updated
     */
    public Long getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }
    /**
     * When time at which the asset was actually updated
     */
    public void setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * Optional partition identifier
     */
    public String getPartition() {
        return partition;
    }
    /**
     * Optional partition identifier
     */
    public void setPartition(String partition) {
        this.partition = partition;
    }

    /**
     * Custom operation properties
     */
    public java.util.List<StringMapEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * Custom operation properties
     */
    public void setCustomProperties(java.util.List<StringMapEntry> customProperties) {
        this.customProperties = customProperties;
    }



    public static Operation.Builder builder() {
        return new Operation.Builder();
    }

    public static class Builder {

        private Long timestampMillis;
        private String actor;
        private OperationType operationType;
        private String customOperationType;
        private OperationSourceType sourceType;
        private Long numAffectedRows;
        private java.util.List<String> affectedDatasets;
        private Long lastUpdatedTimestamp;
        private String partition;
        private java.util.List<StringMapEntry> customProperties;

        public Builder() {
        }

        /**
         * The time at which the operation was reported
         */
        public Builder setTimestampMillis(Long timestampMillis) {
            this.timestampMillis = timestampMillis;
            return this;
        }

        /**
         * Actor who issued this operation.
         */
        public Builder setActor(String actor) {
            this.actor = actor;
            return this;
        }

        /**
         * Operation type of change.
         */
        public Builder setOperationType(OperationType operationType) {
            this.operationType = operationType;
            return this;
        }

        /**
         * A custom operation type
         */
        public Builder setCustomOperationType(String customOperationType) {
            this.customOperationType = customOperationType;
            return this;
        }

        /**
         * Source of the operation
         */
        public Builder setSourceType(OperationSourceType sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * How many rows were affected by this operation.
         */
        public Builder setNumAffectedRows(Long numAffectedRows) {
            this.numAffectedRows = numAffectedRows;
            return this;
        }

        /**
         * Which other datasets were affected by this operation.
         */
        public Builder setAffectedDatasets(java.util.List<String> affectedDatasets) {
            this.affectedDatasets = affectedDatasets;
            return this;
        }

        /**
         * When time at which the asset was actually updated
         */
        public Builder setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
            this.lastUpdatedTimestamp = lastUpdatedTimestamp;
            return this;
        }

        /**
         * Optional partition identifier
         */
        public Builder setPartition(String partition) {
            this.partition = partition;
            return this;
        }

        /**
         * Custom operation properties
         */
        public Builder setCustomProperties(java.util.List<StringMapEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }


        public Operation build() {
            return new Operation(timestampMillis, actor, operationType, customOperationType, sourceType, numAffectedRows, affectedDatasets, lastUpdatedTimestamp, partition, customProperties);
        }

    }
}
