package com.linkedin.datahub.graphql.generated;


/**
 * The platform privileges that the currently authenticated user has
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class PlatformPrivileges implements java.io.Serializable {

    private boolean viewAnalytics;
    private boolean managePolicies;
    private boolean manageIdentities;
    private boolean generatePersonalAccessTokens;
    private boolean createDomains;
    private boolean manageDomains;
    private boolean manageIngestion;
    private boolean manageSecrets;
    private boolean manageTokens;
    private boolean manageTests;
    private boolean manageGlossaries;
    private boolean manageUserCredentials;
    private boolean createTags;
    private boolean manageTags;

    public PlatformPrivileges() {
    }

    public PlatformPrivileges(boolean viewAnalytics, boolean managePolicies, boolean manageIdentities, boolean generatePersonalAccessTokens, boolean createDomains, boolean manageDomains, boolean manageIngestion, boolean manageSecrets, boolean manageTokens, boolean manageTests, boolean manageGlossaries, boolean manageUserCredentials, boolean createTags, boolean manageTags) {
        this.viewAnalytics = viewAnalytics;
        this.managePolicies = managePolicies;
        this.manageIdentities = manageIdentities;
        this.generatePersonalAccessTokens = generatePersonalAccessTokens;
        this.createDomains = createDomains;
        this.manageDomains = manageDomains;
        this.manageIngestion = manageIngestion;
        this.manageSecrets = manageSecrets;
        this.manageTokens = manageTokens;
        this.manageTests = manageTests;
        this.manageGlossaries = manageGlossaries;
        this.manageUserCredentials = manageUserCredentials;
        this.createTags = createTags;
        this.manageTags = manageTags;
    }

    /**
     * Whether the user should be able to view analytics
     */
    public boolean getViewAnalytics() {
        return viewAnalytics;
    }
    /**
     * Whether the user should be able to view analytics
     */
    public void setViewAnalytics(boolean viewAnalytics) {
        this.viewAnalytics = viewAnalytics;
    }

    /**
     * Whether the user should be able to manage policies
     */
    public boolean getManagePolicies() {
        return managePolicies;
    }
    /**
     * Whether the user should be able to manage policies
     */
    public void setManagePolicies(boolean managePolicies) {
        this.managePolicies = managePolicies;
    }

    /**
     * Whether the user should be able to manage users & groups
     */
    public boolean getManageIdentities() {
        return manageIdentities;
    }
    /**
     * Whether the user should be able to manage users & groups
     */
    public void setManageIdentities(boolean manageIdentities) {
        this.manageIdentities = manageIdentities;
    }

    /**
     * Whether the user should be able to generate personal access tokens
     */
    public boolean getGeneratePersonalAccessTokens() {
        return generatePersonalAccessTokens;
    }
    /**
     * Whether the user should be able to generate personal access tokens
     */
    public void setGeneratePersonalAccessTokens(boolean generatePersonalAccessTokens) {
        this.generatePersonalAccessTokens = generatePersonalAccessTokens;
    }

    /**
     * Whether the user should be able to create new Domains
     */
    public boolean getCreateDomains() {
        return createDomains;
    }
    /**
     * Whether the user should be able to create new Domains
     */
    public void setCreateDomains(boolean createDomains) {
        this.createDomains = createDomains;
    }

    /**
     * Whether the user should be able to manage Domains
     */
    public boolean getManageDomains() {
        return manageDomains;
    }
    /**
     * Whether the user should be able to manage Domains
     */
    public void setManageDomains(boolean manageDomains) {
        this.manageDomains = manageDomains;
    }

    /**
     * Whether the user is able to manage UI-based ingestion
     */
    public boolean getManageIngestion() {
        return manageIngestion;
    }
    /**
     * Whether the user is able to manage UI-based ingestion
     */
    public void setManageIngestion(boolean manageIngestion) {
        this.manageIngestion = manageIngestion;
    }

    /**
     * Whether the user is able to manage UI-based secrets
     */
    public boolean getManageSecrets() {
        return manageSecrets;
    }
    /**
     * Whether the user is able to manage UI-based secrets
     */
    public void setManageSecrets(boolean manageSecrets) {
        this.manageSecrets = manageSecrets;
    }

    /**
     * Whether the user should be able to manage tokens on behalf of other users.
     */
    public boolean getManageTokens() {
        return manageTokens;
    }
    /**
     * Whether the user should be able to manage tokens on behalf of other users.
     */
    public void setManageTokens(boolean manageTokens) {
        this.manageTokens = manageTokens;
    }

    /**
     * Whether the user is able to manage Tests
     */
    public boolean getManageTests() {
        return manageTests;
    }
    /**
     * Whether the user is able to manage Tests
     */
    public void setManageTests(boolean manageTests) {
        this.manageTests = manageTests;
    }

    /**
     * Whether the user should be able to manage Glossaries
     */
    public boolean getManageGlossaries() {
        return manageGlossaries;
    }
    /**
     * Whether the user should be able to manage Glossaries
     */
    public void setManageGlossaries(boolean manageGlossaries) {
        this.manageGlossaries = manageGlossaries;
    }

    /**
     * Whether the user is able to manage user credentials
     */
    public boolean getManageUserCredentials() {
        return manageUserCredentials;
    }
    /**
     * Whether the user is able to manage user credentials
     */
    public void setManageUserCredentials(boolean manageUserCredentials) {
        this.manageUserCredentials = manageUserCredentials;
    }

    /**
     * Whether the user should be able to create new Tags
     */
    public boolean getCreateTags() {
        return createTags;
    }
    /**
     * Whether the user should be able to create new Tags
     */
    public void setCreateTags(boolean createTags) {
        this.createTags = createTags;
    }

    /**
     * Whether the user should be able to create and delete all Tags
     */
    public boolean getManageTags() {
        return manageTags;
    }
    /**
     * Whether the user should be able to create and delete all Tags
     */
    public void setManageTags(boolean manageTags) {
        this.manageTags = manageTags;
    }



    public static PlatformPrivileges.Builder builder() {
        return new PlatformPrivileges.Builder();
    }

    public static class Builder {

        private boolean viewAnalytics;
        private boolean managePolicies;
        private boolean manageIdentities;
        private boolean generatePersonalAccessTokens;
        private boolean createDomains;
        private boolean manageDomains;
        private boolean manageIngestion;
        private boolean manageSecrets;
        private boolean manageTokens;
        private boolean manageTests;
        private boolean manageGlossaries;
        private boolean manageUserCredentials;
        private boolean createTags;
        private boolean manageTags;

        public Builder() {
        }

        /**
         * Whether the user should be able to view analytics
         */
        public Builder setViewAnalytics(boolean viewAnalytics) {
            this.viewAnalytics = viewAnalytics;
            return this;
        }

        /**
         * Whether the user should be able to manage policies
         */
        public Builder setManagePolicies(boolean managePolicies) {
            this.managePolicies = managePolicies;
            return this;
        }

        /**
         * Whether the user should be able to manage users & groups
         */
        public Builder setManageIdentities(boolean manageIdentities) {
            this.manageIdentities = manageIdentities;
            return this;
        }

        /**
         * Whether the user should be able to generate personal access tokens
         */
        public Builder setGeneratePersonalAccessTokens(boolean generatePersonalAccessTokens) {
            this.generatePersonalAccessTokens = generatePersonalAccessTokens;
            return this;
        }

        /**
         * Whether the user should be able to create new Domains
         */
        public Builder setCreateDomains(boolean createDomains) {
            this.createDomains = createDomains;
            return this;
        }

        /**
         * Whether the user should be able to manage Domains
         */
        public Builder setManageDomains(boolean manageDomains) {
            this.manageDomains = manageDomains;
            return this;
        }

        /**
         * Whether the user is able to manage UI-based ingestion
         */
        public Builder setManageIngestion(boolean manageIngestion) {
            this.manageIngestion = manageIngestion;
            return this;
        }

        /**
         * Whether the user is able to manage UI-based secrets
         */
        public Builder setManageSecrets(boolean manageSecrets) {
            this.manageSecrets = manageSecrets;
            return this;
        }

        /**
         * Whether the user should be able to manage tokens on behalf of other users.
         */
        public Builder setManageTokens(boolean manageTokens) {
            this.manageTokens = manageTokens;
            return this;
        }

        /**
         * Whether the user is able to manage Tests
         */
        public Builder setManageTests(boolean manageTests) {
            this.manageTests = manageTests;
            return this;
        }

        /**
         * Whether the user should be able to manage Glossaries
         */
        public Builder setManageGlossaries(boolean manageGlossaries) {
            this.manageGlossaries = manageGlossaries;
            return this;
        }

        /**
         * Whether the user is able to manage user credentials
         */
        public Builder setManageUserCredentials(boolean manageUserCredentials) {
            this.manageUserCredentials = manageUserCredentials;
            return this;
        }

        /**
         * Whether the user should be able to create new Tags
         */
        public Builder setCreateTags(boolean createTags) {
            this.createTags = createTags;
            return this;
        }

        /**
         * Whether the user should be able to create and delete all Tags
         */
        public Builder setManageTags(boolean manageTags) {
            this.manageTags = manageTags;
            return this;
        }


        public PlatformPrivileges build() {
            return new PlatformPrivileges(viewAnalytics, managePolicies, manageIdentities, generatePersonalAccessTokens, createDomains, manageDomains, manageIngestion, manageSecrets, manageTokens, manageTests, manageGlossaries, manageUserCredentials, createTags, manageTags);
        }

    }
}
