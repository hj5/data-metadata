package com.linkedin.datahub.graphql.generated;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class SourceCode implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<SourceCodeUrl> sourceCode;

    public SourceCode() {
    }

    public SourceCode(java.util.List<SourceCodeUrl> sourceCode) {
        this.sourceCode = sourceCode;
    }

    /**
     * Source Code along with types
     */
    public java.util.List<SourceCodeUrl> getSourceCode() {
        return sourceCode;
    }
    /**
     * Source Code along with types
     */
    public void setSourceCode(java.util.List<SourceCodeUrl> sourceCode) {
        this.sourceCode = sourceCode;
    }



    public static SourceCode.Builder builder() {
        return new SourceCode.Builder();
    }

    public static class Builder {

        private java.util.List<SourceCodeUrl> sourceCode;

        public Builder() {
        }

        /**
         * Source Code along with types
         */
        public Builder setSourceCode(java.util.List<SourceCodeUrl> sourceCode) {
            this.sourceCode = sourceCode;
            return this;
        }


        public SourceCode build() {
            return new SourceCode(sourceCode);
        }

    }
}
