package com.linkedin.datahub.graphql.generated;


/**
 * Information about the partition being profiled
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class PartitionSpec implements java.io.Serializable {

    @javax.annotation.Nonnull
    private PartitionType type;
    @javax.annotation.Nonnull
    private String partition;
    private TimeWindow timePartition;

    public PartitionSpec() {
    }

    public PartitionSpec(PartitionType type, String partition, TimeWindow timePartition) {
        this.type = type;
        this.partition = partition;
        this.timePartition = timePartition;
    }

    /**
     * The partition type
     */
    public PartitionType getType() {
        return type;
    }
    /**
     * The partition type
     */
    public void setType(PartitionType type) {
        this.type = type;
    }

    /**
     * The partition identifier
     */
    public String getPartition() {
        return partition;
    }
    /**
     * The partition identifier
     */
    public void setPartition(String partition) {
        this.partition = partition;
    }

    /**
     * The optional time window partition information
     */
    public TimeWindow getTimePartition() {
        return timePartition;
    }
    /**
     * The optional time window partition information
     */
    public void setTimePartition(TimeWindow timePartition) {
        this.timePartition = timePartition;
    }



    public static PartitionSpec.Builder builder() {
        return new PartitionSpec.Builder();
    }

    public static class Builder {

        private PartitionType type;
        private String partition;
        private TimeWindow timePartition;

        public Builder() {
        }

        /**
         * The partition type
         */
        public Builder setType(PartitionType type) {
            this.type = type;
            return this;
        }

        /**
         * The partition identifier
         */
        public Builder setPartition(String partition) {
            this.partition = partition;
            return this;
        }

        /**
         * The optional time window partition information
         */
        public Builder setTimePartition(TimeWindow timePartition) {
            this.timePartition = timePartition;
            return this;
        }


        public PartitionSpec build() {
            return new PartitionSpec(type, partition, timePartition);
        }

    }
}
