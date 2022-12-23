package com.linkedin.datahub.graphql.generated;


/**
 * the result of a run, part of the run state
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class DataProcessInstanceRunResult implements java.io.Serializable {

    private DataProcessInstanceRunResultType resultType;
    private String nativeResultType;

    public DataProcessInstanceRunResult() {
    }

    public DataProcessInstanceRunResult(DataProcessInstanceRunResultType resultType, String nativeResultType) {
        this.resultType = resultType;
        this.nativeResultType = nativeResultType;
    }

    /**
     * The outcome of the run
     */
    public DataProcessInstanceRunResultType getResultType() {
        return resultType;
    }
    /**
     * The outcome of the run
     */
    public void setResultType(DataProcessInstanceRunResultType resultType) {
        this.resultType = resultType;
    }

    /**
     * The outcome of the run in the data platforms native language
     */
    public String getNativeResultType() {
        return nativeResultType;
    }
    /**
     * The outcome of the run in the data platforms native language
     */
    public void setNativeResultType(String nativeResultType) {
        this.nativeResultType = nativeResultType;
    }



    public static DataProcessInstanceRunResult.Builder builder() {
        return new DataProcessInstanceRunResult.Builder();
    }

    public static class Builder {

        private DataProcessInstanceRunResultType resultType;
        private String nativeResultType;

        public Builder() {
        }

        /**
         * The outcome of the run
         */
        public Builder setResultType(DataProcessInstanceRunResultType resultType) {
            this.resultType = resultType;
            return this;
        }

        /**
         * The outcome of the run in the data platforms native language
         */
        public Builder setNativeResultType(String nativeResultType) {
            this.nativeResultType = nativeResultType;
            return this;
        }


        public DataProcessInstanceRunResult build() {
            return new DataProcessInstanceRunResult(resultType, nativeResultType);
        }

    }
}
