package com.linkedin.datahub.graphql.generated;

/**
 * The type of an AssertionStdParameter
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum AssertionStdParameterType {

    STRING("STRING"),
    NUMBER("NUMBER"),
    LIST("LIST"),
    SET("SET"),
    UNKNOWN("UNKNOWN");

    private final String graphqlName;

    private AssertionStdParameterType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}