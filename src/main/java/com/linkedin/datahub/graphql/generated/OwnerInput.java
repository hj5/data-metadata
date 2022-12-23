package com.linkedin.datahub.graphql.generated;


/**
 * Input provided when adding an owner to an asset
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class OwnerInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String ownerUrn;
    @javax.annotation.Nonnull
    private OwnerEntityType ownerEntityType;
    private OwnershipType type;

    public OwnerInput() {
    }

    public OwnerInput(String ownerUrn, OwnerEntityType ownerEntityType, OwnershipType type) {
        this.ownerUrn = ownerUrn;
        this.ownerEntityType = ownerEntityType;
        this.type = type;
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



    public static OwnerInput.Builder builder() {
        return new OwnerInput.Builder();
    }

    public static class Builder {

        private String ownerUrn;
        private OwnerEntityType ownerEntityType;
        private OwnershipType type;

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


        public OwnerInput build() {
            return new OwnerInput(ownerUrn, ownerEntityType, type);
        }

    }
}
