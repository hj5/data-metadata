package com.linkedin.datahub.graphql.generated;


/**
 * Input for updating the name of an entity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class UpdateNameInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String urn;

    public UpdateNameInput() {
    }

    public UpdateNameInput(String name, String urn) {
        this.name = name;
        this.urn = urn;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }



    public static UpdateNameInput.Builder builder() {
        return new UpdateNameInput.Builder();
    }

    public static class Builder {

        private String name;
        private String urn;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }


        public UpdateNameInput build() {
            return new UpdateNameInput(name, urn);
        }

    }
}
