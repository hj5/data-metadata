package com.linkedin.datahub.graphql.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum IntendedUserType {

    /**
     * Developed for Enterprise Users
     */
    ENTERPRISE("ENTERPRISE"),
    /**
     * Developed for Hobbyists
     */
    HOBBY("HOBBY"),
    /**
     * Developed for Entertainment Purposes
     */
    ENTERTAINMENT("ENTERTAINMENT");

    private final String graphqlName;

    private IntendedUserType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}