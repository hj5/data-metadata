package com.linkedin.datahub.graphql.generated;


/**
 * Token that allows users to sign up as a native user
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class InviteToken implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String inviteToken;

    public InviteToken() {
    }

    public InviteToken(String inviteToken) {
        this.inviteToken = inviteToken;
    }

    /**
     * The invite token
     */
    public String getInviteToken() {
        return inviteToken;
    }
    /**
     * The invite token
     */
    public void setInviteToken(String inviteToken) {
        this.inviteToken = inviteToken;
    }



    public static InviteToken.Builder builder() {
        return new InviteToken.Builder();
    }

    public static class Builder {

        private String inviteToken;

        public Builder() {
        }

        /**
         * The invite token
         */
        public Builder setInviteToken(String inviteToken) {
            this.inviteToken = inviteToken;
            return this;
        }


        public InviteToken build() {
            return new InviteToken(inviteToken);
        }

    }
}
