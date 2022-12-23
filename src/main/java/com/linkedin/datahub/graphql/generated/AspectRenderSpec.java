package com.linkedin.datahub.graphql.generated;


/**
 * Details for the frontend on how the raw aspect should be rendered
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class AspectRenderSpec implements java.io.Serializable {

    private String displayType;
    private String displayName;
    private String key;

    public AspectRenderSpec() {
    }

    public AspectRenderSpec(String displayType, String displayName, String key) {
        this.displayType = displayType;
        this.displayName = displayName;
        this.key = key;
    }

    /**
     * Format the aspect should be displayed in for the UI. Powered by the renderSpec annotation on the aspect model
     */
    public String getDisplayType() {
        return displayType;
    }
    /**
     * Format the aspect should be displayed in for the UI. Powered by the renderSpec annotation on the aspect model
     */
    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    /**
     * Name to refer to the aspect type by for the UI. Powered by the renderSpec annotation on the aspect model
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * Name to refer to the aspect type by for the UI. Powered by the renderSpec annotation on the aspect model
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Field in the aspect payload to index into for rendering.
     */
    public String getKey() {
        return key;
    }
    /**
     * Field in the aspect payload to index into for rendering.
     */
    public void setKey(String key) {
        this.key = key;
    }



    public static AspectRenderSpec.Builder builder() {
        return new AspectRenderSpec.Builder();
    }

    public static class Builder {

        private String displayType;
        private String displayName;
        private String key;

        public Builder() {
        }

        /**
         * Format the aspect should be displayed in for the UI. Powered by the renderSpec annotation on the aspect model
         */
        public Builder setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }

        /**
         * Name to refer to the aspect type by for the UI. Powered by the renderSpec annotation on the aspect model
         */
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Field in the aspect payload to index into for rendering.
         */
        public Builder setKey(String key) {
            this.key = key;
            return this;
        }


        public AspectRenderSpec build() {
            return new AspectRenderSpec(displayType, displayName, key);
        }

    }
}
