package com.linkedin.datahub.graphql.generated;


/**
 * Config loaded at application boot time
This configuration dictates the behavior of the UI, such as which features are enabled or disabled
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class AppConfig implements java.io.Serializable {

    private String appVersion;
    @javax.annotation.Nonnull
    private AuthConfig authConfig;
    @javax.annotation.Nonnull
    private AnalyticsConfig analyticsConfig;
    @javax.annotation.Nonnull
    private PoliciesConfig policiesConfig;
    @javax.annotation.Nonnull
    private IdentityManagementConfig identityManagementConfig;
    @javax.annotation.Nonnull
    private ManagedIngestionConfig managedIngestionConfig;
    @javax.annotation.Nonnull
    private LineageConfig lineageConfig;
    @javax.annotation.Nonnull
    private VisualConfig visualConfig;
    @javax.annotation.Nonnull
    private TelemetryConfig telemetryConfig;
    @javax.annotation.Nonnull
    private TestsConfig testsConfig;

    public AppConfig() {
    }

    public AppConfig(String appVersion, AuthConfig authConfig, AnalyticsConfig analyticsConfig, PoliciesConfig policiesConfig, IdentityManagementConfig identityManagementConfig, ManagedIngestionConfig managedIngestionConfig, LineageConfig lineageConfig, VisualConfig visualConfig, TelemetryConfig telemetryConfig, TestsConfig testsConfig) {
        this.appVersion = appVersion;
        this.authConfig = authConfig;
        this.analyticsConfig = analyticsConfig;
        this.policiesConfig = policiesConfig;
        this.identityManagementConfig = identityManagementConfig;
        this.managedIngestionConfig = managedIngestionConfig;
        this.lineageConfig = lineageConfig;
        this.visualConfig = visualConfig;
        this.telemetryConfig = telemetryConfig;
        this.testsConfig = testsConfig;
    }

    /**
     * App version
     */
    public String getAppVersion() {
        return appVersion;
    }
    /**
     * App version
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * Auth-related configurations
     */
    public AuthConfig getAuthConfig() {
        return authConfig;
    }
    /**
     * Auth-related configurations
     */
    public void setAuthConfig(AuthConfig authConfig) {
        this.authConfig = authConfig;
    }

    /**
     * Configurations related to the Analytics Feature
     */
    public AnalyticsConfig getAnalyticsConfig() {
        return analyticsConfig;
    }
    /**
     * Configurations related to the Analytics Feature
     */
    public void setAnalyticsConfig(AnalyticsConfig analyticsConfig) {
        this.analyticsConfig = analyticsConfig;
    }

    /**
     * Configurations related to the Policies Feature
     */
    public PoliciesConfig getPoliciesConfig() {
        return policiesConfig;
    }
    /**
     * Configurations related to the Policies Feature
     */
    public void setPoliciesConfig(PoliciesConfig policiesConfig) {
        this.policiesConfig = policiesConfig;
    }

    /**
     * Configurations related to the User & Group management
     */
    public IdentityManagementConfig getIdentityManagementConfig() {
        return identityManagementConfig;
    }
    /**
     * Configurations related to the User & Group management
     */
    public void setIdentityManagementConfig(IdentityManagementConfig identityManagementConfig) {
        this.identityManagementConfig = identityManagementConfig;
    }

    /**
     * Configurations related to UI-based ingestion
     */
    public ManagedIngestionConfig getManagedIngestionConfig() {
        return managedIngestionConfig;
    }
    /**
     * Configurations related to UI-based ingestion
     */
    public void setManagedIngestionConfig(ManagedIngestionConfig managedIngestionConfig) {
        this.managedIngestionConfig = managedIngestionConfig;
    }

    /**
     * Configurations related to Lineage
     */
    public LineageConfig getLineageConfig() {
        return lineageConfig;
    }
    /**
     * Configurations related to Lineage
     */
    public void setLineageConfig(LineageConfig lineageConfig) {
        this.lineageConfig = lineageConfig;
    }

    /**
     * Configurations related to visual appearance, allows styling the UI without rebuilding the bundle
     */
    public VisualConfig getVisualConfig() {
        return visualConfig;
    }
    /**
     * Configurations related to visual appearance, allows styling the UI without rebuilding the bundle
     */
    public void setVisualConfig(VisualConfig visualConfig) {
        this.visualConfig = visualConfig;
    }

    /**
     * Configurations related to tracking users in the app
     */
    public TelemetryConfig getTelemetryConfig() {
        return telemetryConfig;
    }
    /**
     * Configurations related to tracking users in the app
     */
    public void setTelemetryConfig(TelemetryConfig telemetryConfig) {
        this.telemetryConfig = telemetryConfig;
    }

    /**
     * Configurations related to DataHub tests
     */
    public TestsConfig getTestsConfig() {
        return testsConfig;
    }
    /**
     * Configurations related to DataHub tests
     */
    public void setTestsConfig(TestsConfig testsConfig) {
        this.testsConfig = testsConfig;
    }



    public static AppConfig.Builder builder() {
        return new AppConfig.Builder();
    }

    public static class Builder {

        private String appVersion;
        private AuthConfig authConfig;
        private AnalyticsConfig analyticsConfig;
        private PoliciesConfig policiesConfig;
        private IdentityManagementConfig identityManagementConfig;
        private ManagedIngestionConfig managedIngestionConfig;
        private LineageConfig lineageConfig;
        private VisualConfig visualConfig;
        private TelemetryConfig telemetryConfig;
        private TestsConfig testsConfig;

        public Builder() {
        }

        /**
         * App version
         */
        public Builder setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }

        /**
         * Auth-related configurations
         */
        public Builder setAuthConfig(AuthConfig authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * Configurations related to the Analytics Feature
         */
        public Builder setAnalyticsConfig(AnalyticsConfig analyticsConfig) {
            this.analyticsConfig = analyticsConfig;
            return this;
        }

        /**
         * Configurations related to the Policies Feature
         */
        public Builder setPoliciesConfig(PoliciesConfig policiesConfig) {
            this.policiesConfig = policiesConfig;
            return this;
        }

        /**
         * Configurations related to the User & Group management
         */
        public Builder setIdentityManagementConfig(IdentityManagementConfig identityManagementConfig) {
            this.identityManagementConfig = identityManagementConfig;
            return this;
        }

        /**
         * Configurations related to UI-based ingestion
         */
        public Builder setManagedIngestionConfig(ManagedIngestionConfig managedIngestionConfig) {
            this.managedIngestionConfig = managedIngestionConfig;
            return this;
        }

        /**
         * Configurations related to Lineage
         */
        public Builder setLineageConfig(LineageConfig lineageConfig) {
            this.lineageConfig = lineageConfig;
            return this;
        }

        /**
         * Configurations related to visual appearance, allows styling the UI without rebuilding the bundle
         */
        public Builder setVisualConfig(VisualConfig visualConfig) {
            this.visualConfig = visualConfig;
            return this;
        }

        /**
         * Configurations related to tracking users in the app
         */
        public Builder setTelemetryConfig(TelemetryConfig telemetryConfig) {
            this.telemetryConfig = telemetryConfig;
            return this;
        }

        /**
         * Configurations related to DataHub tests
         */
        public Builder setTestsConfig(TestsConfig testsConfig) {
            this.testsConfig = testsConfig;
            return this;
        }


        public AppConfig build() {
            return new AppConfig(appVersion, authConfig, analyticsConfig, policiesConfig, identityManagementConfig, managedIngestionConfig, lineageConfig, visualConfig, telemetryConfig, testsConfig);
        }

    }
}
