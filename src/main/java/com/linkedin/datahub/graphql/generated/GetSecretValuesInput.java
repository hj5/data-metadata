package com.linkedin.datahub.graphql.generated;


/**
 * Input arguments for retrieving the plaintext values of a set of secrets
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class GetSecretValuesInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<String> secrets;

    public GetSecretValuesInput() {
    }

    public GetSecretValuesInput(java.util.List<String> secrets) {
        this.secrets = secrets;
    }

    public java.util.List<String> getSecrets() {
        return secrets;
    }
    public void setSecrets(java.util.List<String> secrets) {
        this.secrets = secrets;
    }



    public static GetSecretValuesInput.Builder builder() {
        return new GetSecretValuesInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> secrets;

        public Builder() {
        }

        public Builder setSecrets(java.util.List<String> secrets) {
            this.secrets = secrets;
            return this;
        }


        public GetSecretValuesInput build() {
            return new GetSecretValuesInput(secrets);
        }

    }
}
