package com.linkedin.datahub.graphql.generated;


/**
 * Input for creating an execution request input
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class CreateIngestionExecutionRequestInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String ingestionSourceUrn;

    public CreateIngestionExecutionRequestInput() {
    }

    public CreateIngestionExecutionRequestInput(String ingestionSourceUrn) {
        this.ingestionSourceUrn = ingestionSourceUrn;
    }

    public String getIngestionSourceUrn() {
        return ingestionSourceUrn;
    }
    public void setIngestionSourceUrn(String ingestionSourceUrn) {
        this.ingestionSourceUrn = ingestionSourceUrn;
    }



    public static CreateIngestionExecutionRequestInput.Builder builder() {
        return new CreateIngestionExecutionRequestInput.Builder();
    }

    public static class Builder {

        private String ingestionSourceUrn;

        public Builder() {
        }

        public Builder setIngestionSourceUrn(String ingestionSourceUrn) {
            this.ingestionSourceUrn = ingestionSourceUrn;
            return this;
        }


        public CreateIngestionExecutionRequestInput build() {
            return new CreateIngestionExecutionRequestInput(ingestionSourceUrn);
        }

    }
}
