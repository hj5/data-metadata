package com.linkedin.datahub.graphql.generated;


/**
 * Input provided when creating an Execution Request
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ExecutionRequestInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String task;
    @javax.annotation.Nonnull
    private ExecutionRequestSource source;
    @javax.annotation.Nonnull
    private java.util.List<StringMapEntry> arguments;
    @javax.annotation.Nonnull
    private Long requestedAt;

    public ExecutionRequestInput() {
    }

    public ExecutionRequestInput(String task, ExecutionRequestSource source, java.util.List<StringMapEntry> arguments, Long requestedAt) {
        this.task = task;
        this.source = source;
        this.arguments = arguments;
        this.requestedAt = requestedAt;
    }

    /**
     * The type of the task to executed
     */
    public String getTask() {
        return task;
    }
    /**
     * The type of the task to executed
     */
    public void setTask(String task) {
        this.task = task;
    }

    /**
     * The source of the execution request
     */
    public ExecutionRequestSource getSource() {
        return source;
    }
    /**
     * The source of the execution request
     */
    public void setSource(ExecutionRequestSource source) {
        this.source = source;
    }

    /**
     * Arguments provided when creating the execution request
     */
    public java.util.List<StringMapEntry> getArguments() {
        return arguments;
    }
    /**
     * Arguments provided when creating the execution request
     */
    public void setArguments(java.util.List<StringMapEntry> arguments) {
        this.arguments = arguments;
    }

    /**
     * The time at which the request was created
     */
    public Long getRequestedAt() {
        return requestedAt;
    }
    /**
     * The time at which the request was created
     */
    public void setRequestedAt(Long requestedAt) {
        this.requestedAt = requestedAt;
    }



    public static ExecutionRequestInput.Builder builder() {
        return new ExecutionRequestInput.Builder();
    }

    public static class Builder {

        private String task;
        private ExecutionRequestSource source;
        private java.util.List<StringMapEntry> arguments;
        private Long requestedAt;

        public Builder() {
        }

        /**
         * The type of the task to executed
         */
        public Builder setTask(String task) {
            this.task = task;
            return this;
        }

        /**
         * The source of the execution request
         */
        public Builder setSource(ExecutionRequestSource source) {
            this.source = source;
            return this;
        }

        /**
         * Arguments provided when creating the execution request
         */
        public Builder setArguments(java.util.List<StringMapEntry> arguments) {
            this.arguments = arguments;
            return this;
        }

        /**
         * The time at which the request was created
         */
        public Builder setRequestedAt(Long requestedAt) {
            this.requestedAt = requestedAt;
            return this;
        }


        public ExecutionRequestInput build() {
            return new ExecutionRequestInput(task, source, arguments, requestedAt);
        }

    }
}
