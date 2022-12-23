package com.linkedin.datahub.graphql.generated;


/**
 * Configurations related to managed, UI based ingestion
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ManagedIngestionConfig implements java.io.Serializable {

    private boolean enabled;

    public ManagedIngestionConfig() {
    }

    public ManagedIngestionConfig(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether ingestion screen is enabled in the UI
     */
    public boolean getEnabled() {
        return enabled;
    }
    /**
     * Whether ingestion screen is enabled in the UI
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }



    public static ManagedIngestionConfig.Builder builder() {
        return new ManagedIngestionConfig.Builder();
    }

    public static class Builder {

        private boolean enabled;

        public Builder() {
        }

        /**
         * Whether ingestion screen is enabled in the UI
         */
        public Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }


        public ManagedIngestionConfig build() {
            return new ManagedIngestionConfig(enabled);
        }

    }
}
