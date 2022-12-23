package com.linkedin.datahub.graphql.generated;


/**
 * A referencible secret stored in DataHub's system. Notice that we do not return the actual secret value.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class Secret implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private String name;
    private String description;

    public Secret() {
    }

    public Secret(String urn, String name, String description) {
        this.urn = urn;
        this.name = name;
        this.description = description;
    }

    /**
     * The urn of the secret
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The urn of the secret
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * The name of the secret
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the secret
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * An optional description for the secret
     */
    public String getDescription() {
        return description;
    }
    /**
     * An optional description for the secret
     */
    public void setDescription(String description) {
        this.description = description;
    }



    public static Secret.Builder builder() {
        return new Secret.Builder();
    }

    public static class Builder {

        private String urn;
        private String name;
        private String description;

        public Builder() {
        }

        /**
         * The urn of the secret
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * The name of the secret
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * An optional description for the secret
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public Secret build() {
            return new Secret(urn, name, description);
        }

    }
}
