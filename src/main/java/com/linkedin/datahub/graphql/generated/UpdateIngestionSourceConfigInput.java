package com.linkedin.datahub.graphql.generated;


/**
 * Input parameters for creating / updating an Ingestion Source
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class UpdateIngestionSourceConfigInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String recipe;
    private String version;
    @javax.annotation.Nonnull
    private String executorId;

    public UpdateIngestionSourceConfigInput() {
    }

    public UpdateIngestionSourceConfigInput(String recipe, String version, String executorId) {
        this.recipe = recipe;
        this.version = version;
        this.executorId = executorId;
    }

    public String getRecipe() {
        return recipe;
    }
    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public String getExecutorId() {
        return executorId;
    }
    public void setExecutorId(String executorId) {
        this.executorId = executorId;
    }



    public static UpdateIngestionSourceConfigInput.Builder builder() {
        return new UpdateIngestionSourceConfigInput.Builder();
    }

    public static class Builder {

        private String recipe;
        private String version;
        private String executorId;

        public Builder() {
        }

        public Builder setRecipe(String recipe) {
            this.recipe = recipe;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        public Builder setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }


        public UpdateIngestionSourceConfigInput build() {
            return new UpdateIngestionSourceConfigInput(recipe, version, executorId);
        }

    }
}
