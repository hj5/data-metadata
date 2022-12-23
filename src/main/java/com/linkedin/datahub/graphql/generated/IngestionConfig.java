package com.linkedin.datahub.graphql.generated;


/**
 * A set of configurations for an Ingestion Source
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class IngestionConfig implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String recipe;
    @javax.annotation.Nonnull
    private String executorId;
    private String version;

    public IngestionConfig() {
    }

    public IngestionConfig(String recipe, String executorId, String version) {
        this.recipe = recipe;
        this.executorId = executorId;
        this.version = version;
    }

    /**
     * The JSON-encoded recipe to use for ingestion
     */
    public String getRecipe() {
        return recipe;
    }
    /**
     * The JSON-encoded recipe to use for ingestion
     */
    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    /**
     * Advanced: The specific executor that should handle the execution request. Defaults to 'default'.
     */
    public String getExecutorId() {
        return executorId;
    }
    /**
     * Advanced: The specific executor that should handle the execution request. Defaults to 'default'.
     */
    public void setExecutorId(String executorId) {
        this.executorId = executorId;
    }

    /**
     * Advanced: The version of the ingestion framework to use
     */
    public String getVersion() {
        return version;
    }
    /**
     * Advanced: The version of the ingestion framework to use
     */
    public void setVersion(String version) {
        this.version = version;
    }



    public static IngestionConfig.Builder builder() {
        return new IngestionConfig.Builder();
    }

    public static class Builder {

        private String recipe;
        private String executorId;
        private String version;

        public Builder() {
        }

        /**
         * The JSON-encoded recipe to use for ingestion
         */
        public Builder setRecipe(String recipe) {
            this.recipe = recipe;
            return this;
        }

        /**
         * Advanced: The specific executor that should handle the execution request. Defaults to 'default'.
         */
        public Builder setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }

        /**
         * Advanced: The version of the ingestion framework to use
         */
        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }


        public IngestionConfig build() {
            return new IngestionConfig(recipe, executorId, version);
        }

    }
}
