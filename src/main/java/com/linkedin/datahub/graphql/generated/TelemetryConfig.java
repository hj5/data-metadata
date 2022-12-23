package com.linkedin.datahub.graphql.generated;


/**
 * Configurations related to tracking users in the app
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class TelemetryConfig implements java.io.Serializable {

    private Boolean enableThirdPartyLogging;

    public TelemetryConfig() {
    }

    public TelemetryConfig(Boolean enableThirdPartyLogging) {
        this.enableThirdPartyLogging = enableThirdPartyLogging;
    }

    /**
     * Env variable for whether or not third party logging should be enabled for this instance
     */
    public Boolean getEnableThirdPartyLogging() {
        return enableThirdPartyLogging;
    }
    /**
     * Env variable for whether or not third party logging should be enabled for this instance
     */
    public void setEnableThirdPartyLogging(Boolean enableThirdPartyLogging) {
        this.enableThirdPartyLogging = enableThirdPartyLogging;
    }



    public static TelemetryConfig.Builder builder() {
        return new TelemetryConfig.Builder();
    }

    public static class Builder {

        private Boolean enableThirdPartyLogging;

        public Builder() {
        }

        /**
         * Env variable for whether or not third party logging should be enabled for this instance
         */
        public Builder setEnableThirdPartyLogging(Boolean enableThirdPartyLogging) {
            this.enableThirdPartyLogging = enableThirdPartyLogging;
            return this;
        }


        public TelemetryConfig build() {
            return new TelemetryConfig(enableThirdPartyLogging);
        }

    }
}
