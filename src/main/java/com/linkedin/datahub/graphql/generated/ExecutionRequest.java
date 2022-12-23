package com.linkedin.datahub.graphql.generated;


/**
 * Retrieve an ingestion execution request
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ExecutionRequest implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private ExecutionRequestInput input;
    private ExecutionRequestResult result;

    public ExecutionRequest() {
    }

    public ExecutionRequest(String urn, ExecutionRequestInput input, ExecutionRequestResult result) {
        this.urn = urn;
        this.input = input;
        this.result = result;
    }

    /**
     * Urn of the execution request
     */
    public String getUrn() {
        return urn;
    }
    /**
     * Urn of the execution request
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * Input provided when creating the Execution Request
     */
    public ExecutionRequestInput getInput() {
        return input;
    }
    /**
     * Input provided when creating the Execution Request
     */
    public void setInput(ExecutionRequestInput input) {
        this.input = input;
    }

    /**
     * Result of the execution request
     */
    public ExecutionRequestResult getResult() {
        return result;
    }
    /**
     * Result of the execution request
     */
    public void setResult(ExecutionRequestResult result) {
        this.result = result;
    }



    public static ExecutionRequest.Builder builder() {
        return new ExecutionRequest.Builder();
    }

    public static class Builder {

        private String urn;
        private ExecutionRequestInput input;
        private ExecutionRequestResult result;

        public Builder() {
        }

        /**
         * Urn of the execution request
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * Input provided when creating the Execution Request
         */
        public Builder setInput(ExecutionRequestInput input) {
            this.input = input;
            return this;
        }

        /**
         * Result of the execution request
         */
        public Builder setResult(ExecutionRequestResult result) {
            this.result = result;
            return this;
        }


        public ExecutionRequest build() {
            return new ExecutionRequest(urn, input, result);
        }

    }
}
