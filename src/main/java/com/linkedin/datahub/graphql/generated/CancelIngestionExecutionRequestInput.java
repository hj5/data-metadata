package com.linkedin.datahub.graphql.generated;


/**
 * Input for cancelling an execution request input
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class CancelIngestionExecutionRequestInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String ingestionSourceUrn;
    @javax.annotation.Nonnull
    private String executionRequestUrn;

    public CancelIngestionExecutionRequestInput() {
    }

    public CancelIngestionExecutionRequestInput(String ingestionSourceUrn, String executionRequestUrn) {
        this.ingestionSourceUrn = ingestionSourceUrn;
        this.executionRequestUrn = executionRequestUrn;
    }

    public String getIngestionSourceUrn() {
        return ingestionSourceUrn;
    }
    public void setIngestionSourceUrn(String ingestionSourceUrn) {
        this.ingestionSourceUrn = ingestionSourceUrn;
    }

    public String getExecutionRequestUrn() {
        return executionRequestUrn;
    }
    public void setExecutionRequestUrn(String executionRequestUrn) {
        this.executionRequestUrn = executionRequestUrn;
    }



    public static CancelIngestionExecutionRequestInput.Builder builder() {
        return new CancelIngestionExecutionRequestInput.Builder();
    }

    public static class Builder {

        private String ingestionSourceUrn;
        private String executionRequestUrn;

        public Builder() {
        }

        public Builder setIngestionSourceUrn(String ingestionSourceUrn) {
            this.ingestionSourceUrn = ingestionSourceUrn;
            return this;
        }

        public Builder setExecutionRequestUrn(String executionRequestUrn) {
            this.executionRequestUrn = executionRequestUrn;
            return this;
        }


        public CancelIngestionExecutionRequestInput build() {
            return new CancelIngestionExecutionRequestInput(ingestionSourceUrn, executionRequestUrn);
        }

    }
}
