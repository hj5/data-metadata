package com.linkedin.datahub.graphql.generated;


/**
 * Input for updating the parent node of a resource. Currently only GlossaryNodes and GlossaryTerms have parentNodes.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class UpdateParentNodeInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String parentNode;
    @javax.annotation.Nonnull
    private String resourceUrn;

    public UpdateParentNodeInput() {
    }

    public UpdateParentNodeInput(String parentNode, String resourceUrn) {
        this.parentNode = parentNode;
        this.resourceUrn = resourceUrn;
    }

    public String getParentNode() {
        return parentNode;
    }
    public void setParentNode(String parentNode) {
        this.parentNode = parentNode;
    }

    public String getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }



    public static UpdateParentNodeInput.Builder builder() {
        return new UpdateParentNodeInput.Builder();
    }

    public static class Builder {

        private String parentNode;
        private String resourceUrn;

        public Builder() {
        }

        public Builder setParentNode(String parentNode) {
            this.parentNode = parentNode;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }


        public UpdateParentNodeInput build() {
            return new UpdateParentNodeInput(parentNode, resourceUrn);
        }

    }
}
