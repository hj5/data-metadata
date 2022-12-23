package com.linkedin.datahub.graphql.generated;


/**
 * The result of evaluating an assertion.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class AssertionResult implements java.io.Serializable {

    @javax.annotation.Nonnull
    private AssertionResultType type;
    private Long rowCount;
    private Long missingCount;
    private Long unexpectedCount;
    private Float actualAggValue;
    private String externalUrl;
    @javax.annotation.Nonnull
    private java.util.List<StringMapEntry> nativeResults;

    public AssertionResult() {
    }

    public AssertionResult(AssertionResultType type, Long rowCount, Long missingCount, Long unexpectedCount, Float actualAggValue, String externalUrl, java.util.List<StringMapEntry> nativeResults) {
        this.type = type;
        this.rowCount = rowCount;
        this.missingCount = missingCount;
        this.unexpectedCount = unexpectedCount;
        this.actualAggValue = actualAggValue;
        this.externalUrl = externalUrl;
        this.nativeResults = nativeResults;
    }

    /**
     * The final result, e.g. either SUCCESS or FAILURE.
     */
    public AssertionResultType getType() {
        return type;
    }
    /**
     * The final result, e.g. either SUCCESS or FAILURE.
     */
    public void setType(AssertionResultType type) {
        this.type = type;
    }

    /**
     * Number of rows for evaluated batch
     */
    public Long getRowCount() {
        return rowCount;
    }
    /**
     * Number of rows for evaluated batch
     */
    public void setRowCount(Long rowCount) {
        this.rowCount = rowCount;
    }

    /**
     * Number of rows with missing value for evaluated batch
     */
    public Long getMissingCount() {
        return missingCount;
    }
    /**
     * Number of rows with missing value for evaluated batch
     */
    public void setMissingCount(Long missingCount) {
        this.missingCount = missingCount;
    }

    /**
     * Number of rows with unexpected value for evaluated batch
     */
    public Long getUnexpectedCount() {
        return unexpectedCount;
    }
    /**
     * Number of rows with unexpected value for evaluated batch
     */
    public void setUnexpectedCount(Long unexpectedCount) {
        this.unexpectedCount = unexpectedCount;
    }

    /**
     * Observed aggregate value for evaluated batch
     */
    public Float getActualAggValue() {
        return actualAggValue;
    }
    /**
     * Observed aggregate value for evaluated batch
     */
    public void setActualAggValue(Float actualAggValue) {
        this.actualAggValue = actualAggValue;
    }

    /**
     * URL where full results are available
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * URL where full results are available
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * Native results / properties of evaluation
     */
    public java.util.List<StringMapEntry> getNativeResults() {
        return nativeResults;
    }
    /**
     * Native results / properties of evaluation
     */
    public void setNativeResults(java.util.List<StringMapEntry> nativeResults) {
        this.nativeResults = nativeResults;
    }



    public static AssertionResult.Builder builder() {
        return new AssertionResult.Builder();
    }

    public static class Builder {

        private AssertionResultType type;
        private Long rowCount;
        private Long missingCount;
        private Long unexpectedCount;
        private Float actualAggValue;
        private String externalUrl;
        private java.util.List<StringMapEntry> nativeResults;

        public Builder() {
        }

        /**
         * The final result, e.g. either SUCCESS or FAILURE.
         */
        public Builder setType(AssertionResultType type) {
            this.type = type;
            return this;
        }

        /**
         * Number of rows for evaluated batch
         */
        public Builder setRowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }

        /**
         * Number of rows with missing value for evaluated batch
         */
        public Builder setMissingCount(Long missingCount) {
            this.missingCount = missingCount;
            return this;
        }

        /**
         * Number of rows with unexpected value for evaluated batch
         */
        public Builder setUnexpectedCount(Long unexpectedCount) {
            this.unexpectedCount = unexpectedCount;
            return this;
        }

        /**
         * Observed aggregate value for evaluated batch
         */
        public Builder setActualAggValue(Float actualAggValue) {
            this.actualAggValue = actualAggValue;
            return this;
        }

        /**
         * URL where full results are available
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * Native results / properties of evaluation
         */
        public Builder setNativeResults(java.util.List<StringMapEntry> nativeResults) {
            this.nativeResults = nativeResults;
            return this;
        }


        public AssertionResult build() {
            return new AssertionResult(type, rowCount, missingCount, unexpectedCount, actualAggValue, externalUrl, nativeResults);
        }

    }
}
