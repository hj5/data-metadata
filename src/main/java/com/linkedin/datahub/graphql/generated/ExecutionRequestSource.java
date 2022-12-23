package com.linkedin.datahub.graphql.generated;


/**
 * Information about the source of an execution request
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ExecutionRequestSource implements java.io.Serializable {

    private String type;

    public ExecutionRequestSource() {
    }

    public ExecutionRequestSource(String type) {
        this.type = type;
    }

    /**
     * The type of the source, e.g. SCHEDULED_INGESTION_SOURCE
     */
    public String getType() {
        return type;
    }
    /**
     * The type of the source, e.g. SCHEDULED_INGESTION_SOURCE
     */
    public void setType(String type) {
        this.type = type;
    }



    public static ExecutionRequestSource.Builder builder() {
        return new ExecutionRequestSource.Builder();
    }

    public static class Builder {

        private String type;

        public Builder() {
        }

        /**
         * The type of the source, e.g. SCHEDULED_INGESTION_SOURCE
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }


        public ExecutionRequestSource build() {
            return new ExecutionRequestSource(type);
        }

    }
}
