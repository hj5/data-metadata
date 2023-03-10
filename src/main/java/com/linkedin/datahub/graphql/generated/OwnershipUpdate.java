package com.linkedin.datahub.graphql.generated;


/**
 * An update for the ownership information for a Metadata Entity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class OwnershipUpdate implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<OwnerUpdate> owners;

    public OwnershipUpdate() {
    }

    public OwnershipUpdate(java.util.List<OwnerUpdate> owners) {
        this.owners = owners;
    }

    public java.util.List<OwnerUpdate> getOwners() {
        return owners;
    }
    public void setOwners(java.util.List<OwnerUpdate> owners) {
        this.owners = owners;
    }



    public static OwnershipUpdate.Builder builder() {
        return new OwnershipUpdate.Builder();
    }

    public static class Builder {

        private java.util.List<OwnerUpdate> owners;

        public Builder() {
        }

        public Builder setOwners(java.util.List<OwnerUpdate> owners) {
            this.owners = owners;
            return this;
        }


        public OwnershipUpdate build() {
            return new OwnershipUpdate(owners);
        }

    }
}
