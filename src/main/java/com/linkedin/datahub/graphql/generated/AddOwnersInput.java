package com.linkedin.datahub.graphql.generated;


/**
 * Input provided when adding multiple associations between a Metadata Entity and an user or group owner
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class AddOwnersInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<OwnerInput> owners;
    @javax.annotation.Nonnull
    private String resourceUrn;

    public AddOwnersInput() {
    }

    public AddOwnersInput(java.util.List<OwnerInput> owners, String resourceUrn) {
        this.owners = owners;
        this.resourceUrn = resourceUrn;
    }

    public java.util.List<OwnerInput> getOwners() {
        return owners;
    }
    public void setOwners(java.util.List<OwnerInput> owners) {
        this.owners = owners;
    }

    public String getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }



    public static AddOwnersInput.Builder builder() {
        return new AddOwnersInput.Builder();
    }

    public static class Builder {

        private java.util.List<OwnerInput> owners;
        private String resourceUrn;

        public Builder() {
        }

        public Builder setOwners(java.util.List<OwnerInput> owners) {
            this.owners = owners;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }


        public AddOwnersInput build() {
            return new AddOwnersInput(owners, resourceUrn);
        }

    }
}
