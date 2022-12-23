package com.linkedin.datahub.graphql.generated;


/**
 * Input provided when adding Terms to an asset
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class AddTermsInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<String> termUrns;
    @javax.annotation.Nonnull
    private String resourceUrn;
    private SubResourceType subResourceType;
    private String subResource;

    public AddTermsInput() {
    }

    public AddTermsInput(java.util.List<String> termUrns, String resourceUrn, SubResourceType subResourceType, String subResource) {
        this.termUrns = termUrns;
        this.resourceUrn = resourceUrn;
        this.subResourceType = subResourceType;
        this.subResource = subResource;
    }

    public java.util.List<String> getTermUrns() {
        return termUrns;
    }
    public void setTermUrns(java.util.List<String> termUrns) {
        this.termUrns = termUrns;
    }

    public String getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }

    public SubResourceType getSubResourceType() {
        return subResourceType;
    }
    public void setSubResourceType(SubResourceType subResourceType) {
        this.subResourceType = subResourceType;
    }

    public String getSubResource() {
        return subResource;
    }
    public void setSubResource(String subResource) {
        this.subResource = subResource;
    }



    public static AddTermsInput.Builder builder() {
        return new AddTermsInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> termUrns;
        private String resourceUrn;
        private SubResourceType subResourceType;
        private String subResource;

        public Builder() {
        }

        public Builder setTermUrns(java.util.List<String> termUrns) {
            this.termUrns = termUrns;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }

        public Builder setSubResourceType(SubResourceType subResourceType) {
            this.subResourceType = subResourceType;
            return this;
        }

        public Builder setSubResource(String subResource) {
            this.subResource = subResource;
            return this;
        }


        public AddTermsInput build() {
            return new AddTermsInput(termUrns, resourceUrn, subResourceType, subResource);
        }

    }
}
