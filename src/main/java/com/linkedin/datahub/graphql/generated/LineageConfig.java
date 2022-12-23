package com.linkedin.datahub.graphql.generated;


/**
 * Configurations related to Lineage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class LineageConfig implements java.io.Serializable {

    private boolean supportsImpactAnalysis;

    public LineageConfig() {
    }

    public LineageConfig(boolean supportsImpactAnalysis) {
        this.supportsImpactAnalysis = supportsImpactAnalysis;
    }

    /**
     * Whether the backend support impact analysis feature
     */
    public boolean getSupportsImpactAnalysis() {
        return supportsImpactAnalysis;
    }
    /**
     * Whether the backend support impact analysis feature
     */
    public void setSupportsImpactAnalysis(boolean supportsImpactAnalysis) {
        this.supportsImpactAnalysis = supportsImpactAnalysis;
    }



    public static LineageConfig.Builder builder() {
        return new LineageConfig.Builder();
    }

    public static class Builder {

        private boolean supportsImpactAnalysis;

        public Builder() {
        }

        /**
         * Whether the backend support impact analysis feature
         */
        public Builder setSupportsImpactAnalysis(boolean supportsImpactAnalysis) {
            this.supportsImpactAnalysis = supportsImpactAnalysis;
            return this;
        }


        public LineageConfig build() {
            return new LineageConfig(supportsImpactAnalysis);
        }

    }
}
