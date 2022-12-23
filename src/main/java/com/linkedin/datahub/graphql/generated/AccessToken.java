package com.linkedin.datahub.graphql.generated;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class AccessToken implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String accessToken;
    private AccessTokenMetadata metadata;

    public AccessToken() {
    }

    public AccessToken(String accessToken, AccessTokenMetadata metadata) {
        this.accessToken = accessToken;
        this.metadata = metadata;
    }

    /**
     * The access token itself
     */
    public String getAccessToken() {
        return accessToken;
    }
    /**
     * The access token itself
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * Metadata about the generated token
     */
    public AccessTokenMetadata getMetadata() {
        return metadata;
    }
    /**
     * Metadata about the generated token
     */
    public void setMetadata(AccessTokenMetadata metadata) {
        this.metadata = metadata;
    }



    public static AccessToken.Builder builder() {
        return new AccessToken.Builder();
    }

    public static class Builder {

        private String accessToken;
        private AccessTokenMetadata metadata;

        public Builder() {
        }

        /**
         * The access token itself
         */
        public Builder setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Metadata about the generated token
         */
        public Builder setMetadata(AccessTokenMetadata metadata) {
            this.metadata = metadata;
            return this;
        }


        public AccessToken build() {
            return new AccessToken(accessToken, metadata);
        }

    }
}
