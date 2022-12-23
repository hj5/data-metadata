package com.linkedin.datahub.graphql.generated;

/**
 * The state of a CorpUser
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum CorpUserStatus {

    /**
     * A User that has been provisioned and logged in
     */
    ACTIVE("ACTIVE");

    private final String graphqlName;

    private CorpUserStatus(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}