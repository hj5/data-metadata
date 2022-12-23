package com.linkedin.datahub.graphql.generated;


/**
 * The actors that a DataHub Access Policy applies to
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ActorFilter implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<String> users;
    @javax.annotation.Nonnull
    private java.util.List<String> groups;
    private boolean resourceOwners;
    private boolean allUsers;
    private boolean allGroups;
    @javax.annotation.Nonnull
    private java.util.List<CorpUser> resolvedUsers;
    @javax.annotation.Nonnull
    private java.util.List<CorpGroup> resolvedGroups;

    public ActorFilter() {
    }

    public ActorFilter(java.util.List<String> users, java.util.List<String> groups, boolean resourceOwners, boolean allUsers, boolean allGroups, java.util.List<CorpUser> resolvedUsers, java.util.List<CorpGroup> resolvedGroups) {
        this.users = users;
        this.groups = groups;
        this.resourceOwners = resourceOwners;
        this.allUsers = allUsers;
        this.allGroups = allGroups;
        this.resolvedUsers = resolvedUsers;
        this.resolvedGroups = resolvedGroups;
    }

    /**
     * A disjunctive set of users to apply the policy to
     */
    public java.util.List<String> getUsers() {
        return users;
    }
    /**
     * A disjunctive set of users to apply the policy to
     */
    public void setUsers(java.util.List<String> users) {
        this.users = users;
    }

    /**
     * A disjunctive set of groups to apply the policy to
     */
    public java.util.List<String> getGroups() {
        return groups;
    }
    /**
     * A disjunctive set of groups to apply the policy to
     */
    public void setGroups(java.util.List<String> groups) {
        this.groups = groups;
    }

    /**
     * Whether the filter should return TRUE for owners of a particular resource
Only applies to policies of type METADATA, which have a resource associated with them
     */
    public boolean getResourceOwners() {
        return resourceOwners;
    }
    /**
     * Whether the filter should return TRUE for owners of a particular resource
Only applies to policies of type METADATA, which have a resource associated with them
     */
    public void setResourceOwners(boolean resourceOwners) {
        this.resourceOwners = resourceOwners;
    }

    /**
     * Whether the filter should apply to all users
     */
    public boolean getAllUsers() {
        return allUsers;
    }
    /**
     * Whether the filter should apply to all users
     */
    public void setAllUsers(boolean allUsers) {
        this.allUsers = allUsers;
    }

    /**
     * Whether the filter should apply to all groups
     */
    public boolean getAllGroups() {
        return allGroups;
    }
    /**
     * Whether the filter should apply to all groups
     */
    public void setAllGroups(boolean allGroups) {
        this.allGroups = allGroups;
    }

    /**
     * The list of users on the Policy, resolved.
     */
    public java.util.List<CorpUser> getResolvedUsers() {
        return resolvedUsers;
    }
    /**
     * The list of users on the Policy, resolved.
     */
    public void setResolvedUsers(java.util.List<CorpUser> resolvedUsers) {
        this.resolvedUsers = resolvedUsers;
    }

    /**
     * The list of groups on the Policy, resolved.
     */
    public java.util.List<CorpGroup> getResolvedGroups() {
        return resolvedGroups;
    }
    /**
     * The list of groups on the Policy, resolved.
     */
    public void setResolvedGroups(java.util.List<CorpGroup> resolvedGroups) {
        this.resolvedGroups = resolvedGroups;
    }



    public static ActorFilter.Builder builder() {
        return new ActorFilter.Builder();
    }

    public static class Builder {

        private java.util.List<String> users;
        private java.util.List<String> groups;
        private boolean resourceOwners;
        private boolean allUsers;
        private boolean allGroups;
        private java.util.List<CorpUser> resolvedUsers;
        private java.util.List<CorpGroup> resolvedGroups;

        public Builder() {
        }

        /**
         * A disjunctive set of users to apply the policy to
         */
        public Builder setUsers(java.util.List<String> users) {
            this.users = users;
            return this;
        }

        /**
         * A disjunctive set of groups to apply the policy to
         */
        public Builder setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * Whether the filter should return TRUE for owners of a particular resource
Only applies to policies of type METADATA, which have a resource associated with them
         */
        public Builder setResourceOwners(boolean resourceOwners) {
            this.resourceOwners = resourceOwners;
            return this;
        }

        /**
         * Whether the filter should apply to all users
         */
        public Builder setAllUsers(boolean allUsers) {
            this.allUsers = allUsers;
            return this;
        }

        /**
         * Whether the filter should apply to all groups
         */
        public Builder setAllGroups(boolean allGroups) {
            this.allGroups = allGroups;
            return this;
        }

        /**
         * The list of users on the Policy, resolved.
         */
        public Builder setResolvedUsers(java.util.List<CorpUser> resolvedUsers) {
            this.resolvedUsers = resolvedUsers;
            return this;
        }

        /**
         * The list of groups on the Policy, resolved.
         */
        public Builder setResolvedGroups(java.util.List<CorpGroup> resolvedGroups) {
            this.resolvedGroups = resolvedGroups;
            return this;
        }


        public ActorFilter build() {
            return new ActorFilter(users, groups, resourceOwners, allUsers, allGroups, resolvedUsers, resolvedGroups);
        }

    }
}
