package com.linkedin.datahub.graphql.generated;


/**
 * A plaintext secret value
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class SecretValue implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String value;

    public SecretValue() {
    }

    public SecretValue(String name, String value) {
        this.name = name;
        this.value = value;
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
     * The plaintext value of the secret.
     */
    public String getValue() {
        return value;
    }
    /**
     * The plaintext value of the secret.
     */
    public void setValue(String value) {
        this.value = value;
    }



    public static SecretValue.Builder builder() {
        return new SecretValue.Builder();
    }

    public static class Builder {

        private String name;
        private String value;

        public Builder() {
        }

        /**
         * The name of the secret
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The plaintext value of the secret.
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public SecretValue build() {
            return new SecretValue(name, value);
        }

    }
}
