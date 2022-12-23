package com.linkedin.datahub.graphql.generated;


/**
 * Token that allows native users to reset their credentials
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ResetToken implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String resetToken;

    public ResetToken() {
    }

    public ResetToken(String resetToken) {
        this.resetToken = resetToken;
    }

    /**
     * The reset token
     */
    public String getResetToken() {
        return resetToken;
    }
    /**
     * The reset token
     */
    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }



    public static ResetToken.Builder builder() {
        return new ResetToken.Builder();
    }

    public static class Builder {

        private String resetToken;

        public Builder() {
        }

        /**
         * The reset token
         */
        public Builder setResetToken(String resetToken) {
            this.resetToken = resetToken;
            return this;
        }


        public ResetToken build() {
            return new ResetToken(resetToken);
        }

    }
}
