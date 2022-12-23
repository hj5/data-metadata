package com.linkedin.datahub.graphql.generated;


/**
 * Input provided when adding the association between a Metadata Entity and an user or group owner
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class AddOwnerInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String ownerUrn;
    @javax.annotation.Nonnull
    private OwnerEntityType ownerEntityType;
    private OwnershipType type;
    @javax.annotation.Nonnull
    private String resourceUrn;

    public AddOwnerInput() {
    }

    public AddOwnerInput(String ownerUrn, OwnerEntityType ownerEntityType, OwnershipType type, String resourceUrn) {
        this.ownerUrn = ownerUrn;
        this.ownerEntityType = ownerEntityType;
        this.type = type;
        this.resourceUrn = resourceUrn;
    }

    public String getOwnerUrn() {
        return ownerUrn;
    }
    public void setOwnerUrn(String ownerUrn) {
        this.ownerUrn = ownerUrn;
    }

    public OwnerEntityType getOwnerEntityType() {
        return ownerEntityType;
    }
    public void setOwnerEntityType(OwnerEntityType ownerEntityType) {
        this.ownerEntityType = ownerEntityType;
    }

    public OwnershipType getType() {
        return type;
    }
    public void setType(OwnershipType type) {
        this.type = type;
    }

    public String getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }



    public static AddOwnerInput.Builder builder() {
        return new AddOwnerInput.Builder();
    }

    public static class Builder {

        private String ownerUrn;
        private OwnerEntityType ownerEntityType;
        private OwnershipType type;
        private String resourceUrn;

        public Builder() {
        }

        public Builder setOwnerUrn(String ownerUrn) {
            this.ownerUrn = ownerUrn;
            return this;
        }

        public Builder setOwnerEntityType(OwnerEntityType ownerEntityType) {
            this.ownerEntityType = ownerEntityType;
            return this;
        }

        public Builder setType(OwnershipType type) {
            this.type = type;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }


        public AddOwnerInput build() {
            return new AddOwnerInput(ownerUrn, ownerEntityType, type, resourceUrn);
        }

    }
}
