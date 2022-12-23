package com.linkedin.datahub.graphql.generated;


/**
 * Configurations related to auth
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class AuthConfig implements java.io.Serializable {

    private boolean tokenAuthEnabled;

    public AuthConfig() {
    }

    public AuthConfig(boolean tokenAuthEnabled) {
        this.tokenAuthEnabled = tokenAuthEnabled;
    }

    /**
     * Whether token-based auth is enabled.
     */
    public boolean getTokenAuthEnabled() {
        return tokenAuthEnabled;
    }
    /**
     * Whether token-based auth is enabled.
     */
    public void setTokenAuthEnabled(boolean tokenAuthEnabled) {
        this.tokenAuthEnabled = tokenAuthEnabled;
    }



    public static AuthConfig.Builder builder() {
        return new AuthConfig.Builder();
    }

    public static class Builder {

        private boolean tokenAuthEnabled;

        public Builder() {
        }

        /**
         * Whether token-based auth is enabled.
         */
        public Builder setTokenAuthEnabled(boolean tokenAuthEnabled) {
            this.tokenAuthEnabled = tokenAuthEnabled;
            return this;
        }


        public AuthConfig build() {
            return new AuthConfig(tokenAuthEnabled);
        }

    }
}
