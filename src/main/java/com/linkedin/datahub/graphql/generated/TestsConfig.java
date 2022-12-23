package com.linkedin.datahub.graphql.generated;


/**
 * Configurations related to DataHub Tests feature
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class TestsConfig implements java.io.Serializable {

    private boolean enabled;

    public TestsConfig() {
    }

    public TestsConfig(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether Tests feature is enabled
     */
    public boolean getEnabled() {
        return enabled;
    }
    /**
     * Whether Tests feature is enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }



    public static TestsConfig.Builder builder() {
        return new TestsConfig.Builder();
    }

    public static class Builder {

        private boolean enabled;

        public Builder() {
        }

        /**
         * Whether Tests feature is enabled
         */
        public Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }


        public TestsConfig build() {
            return new TestsConfig(enabled);
        }

    }
}
