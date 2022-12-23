package com.linkedin.datahub.graphql.generated;


/**
 * Object that encodes the privileges the actor has for a given resource
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class Privileges implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<String> privileges;

    public Privileges() {
    }

    public Privileges(java.util.List<String> privileges) {
        this.privileges = privileges;
    }

    /**
     * Granted Privileges
     */
    public java.util.List<String> getPrivileges() {
        return privileges;
    }
    /**
     * Granted Privileges
     */
    public void setPrivileges(java.util.List<String> privileges) {
        this.privileges = privileges;
    }



    public static Privileges.Builder builder() {
        return new Privileges.Builder();
    }

    public static class Builder {

        private java.util.List<String> privileges;

        public Builder() {
        }

        /**
         * Granted Privileges
         */
        public Builder setPrivileges(java.util.List<String> privileges) {
            this.privileges = privileges;
            return this;
        }


        public Privileges build() {
            return new Privileges(privileges);
        }

    }
}
