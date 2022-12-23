package com.linkedin.datahub.graphql.generated;


/**
 * Input required to generate a password reset token for a native user.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class CreateNativeUserResetTokenInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String userUrn;

    public CreateNativeUserResetTokenInput() {
    }

    public CreateNativeUserResetTokenInput(String userUrn) {
        this.userUrn = userUrn;
    }

    public String getUserUrn() {
        return userUrn;
    }
    public void setUserUrn(String userUrn) {
        this.userUrn = userUrn;
    }



    public static CreateNativeUserResetTokenInput.Builder builder() {
        return new CreateNativeUserResetTokenInput.Builder();
    }

    public static class Builder {

        private String userUrn;

        public Builder() {
        }

        public Builder setUserUrn(String userUrn) {
            this.userUrn = userUrn;
            return this;
        }


        public CreateNativeUserResetTokenInput build() {
            return new CreateNativeUserResetTokenInput(userUrn);
        }

    }
}
