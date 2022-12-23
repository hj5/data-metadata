package com.linkedin.datahub.graphql.generated;


/**
 * The runs associated with an Ingestion Source managed by DataHub
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class IngestionRun implements java.io.Serializable {

    private String executionRequestUrn;

    public IngestionRun() {
    }

    public IngestionRun(String executionRequestUrn) {
        this.executionRequestUrn = executionRequestUrn;
    }

    /**
     * The urn of the execution request associated with the user
     */
    public String getExecutionRequestUrn() {
        return executionRequestUrn;
    }
    /**
     * The urn of the execution request associated with the user
     */
    public void setExecutionRequestUrn(String executionRequestUrn) {
        this.executionRequestUrn = executionRequestUrn;
    }



    public static IngestionRun.Builder builder() {
        return new IngestionRun.Builder();
    }

    public static class Builder {

        private String executionRequestUrn;

        public Builder() {
        }

        /**
         * The urn of the execution request associated with the user
         */
        public Builder setExecutionRequestUrn(String executionRequestUrn) {
            this.executionRequestUrn = executionRequestUrn;
            return this;
        }


        public IngestionRun build() {
            return new IngestionRun(executionRequestUrn);
        }

    }
}
