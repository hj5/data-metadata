package com.linkedin.datahub.graphql.generated;


/**
 * Type of assertion. Assertion types can evolve to span Datasets, Flows (Pipelines), Models, Features etc.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class AssertionInfo implements java.io.Serializable {

    @javax.annotation.Nonnull
    private AssertionType type;
    private DatasetAssertionInfo datasetAssertion;

    public AssertionInfo() {
    }

    public AssertionInfo(AssertionType type, DatasetAssertionInfo datasetAssertion) {
        this.type = type;
        this.datasetAssertion = datasetAssertion;
    }

    /**
     * Top-level type of the assertion.
     */
    public AssertionType getType() {
        return type;
    }
    /**
     * Top-level type of the assertion.
     */
    public void setType(AssertionType type) {
        this.type = type;
    }

    /**
     * Dataset-specific assertion information
     */
    public DatasetAssertionInfo getDatasetAssertion() {
        return datasetAssertion;
    }
    /**
     * Dataset-specific assertion information
     */
    public void setDatasetAssertion(DatasetAssertionInfo datasetAssertion) {
        this.datasetAssertion = datasetAssertion;
    }



    public static AssertionInfo.Builder builder() {
        return new AssertionInfo.Builder();
    }

    public static class Builder {

        private AssertionType type;
        private DatasetAssertionInfo datasetAssertion;

        public Builder() {
        }

        /**
         * Top-level type of the assertion.
         */
        public Builder setType(AssertionType type) {
            this.type = type;
            return this;
        }

        /**
         * Dataset-specific assertion information
         */
        public Builder setDatasetAssertion(DatasetAssertionInfo datasetAssertion) {
            this.datasetAssertion = datasetAssertion;
            return this;
        }


        public AssertionInfo build() {
            return new AssertionInfo(type, datasetAssertion);
        }

    }
}
