package com.linkedin.datahub.graphql.generated;


/**
 * Params to configure what list of aspects should be fetched by the aspects property
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class AspectParams implements java.io.Serializable {

    private Boolean autoRenderOnly;

    public AspectParams() {
    }

    public AspectParams(Boolean autoRenderOnly) {
        this.autoRenderOnly = autoRenderOnly;
    }

    public Boolean getAutoRenderOnly() {
        return autoRenderOnly;
    }
    public void setAutoRenderOnly(Boolean autoRenderOnly) {
        this.autoRenderOnly = autoRenderOnly;
    }



    public static AspectParams.Builder builder() {
        return new AspectParams.Builder();
    }

    public static class Builder {

        private Boolean autoRenderOnly;

        public Builder() {
        }

        public Builder setAutoRenderOnly(Boolean autoRenderOnly) {
            this.autoRenderOnly = autoRenderOnly;
            return this;
        }


        public AspectParams build() {
            return new AspectParams(autoRenderOnly);
        }

    }
}
