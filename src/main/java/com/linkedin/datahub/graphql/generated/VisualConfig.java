package com.linkedin.datahub.graphql.generated;


/**
 * Configurations related to visual appearance of the app
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class VisualConfig implements java.io.Serializable {

    private String logoUrl;

    public VisualConfig() {
    }

    public VisualConfig(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    /**
     * Custom logo url for the homepage & top banner
     */
    public String getLogoUrl() {
        return logoUrl;
    }
    /**
     * Custom logo url for the homepage & top banner
     */
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }



    public static VisualConfig.Builder builder() {
        return new VisualConfig.Builder();
    }

    public static class Builder {

        private String logoUrl;

        public Builder() {
        }

        /**
         * Custom logo url for the homepage & top banner
         */
        public Builder setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }


        public VisualConfig build() {
            return new VisualConfig(logoUrl);
        }

    }
}
