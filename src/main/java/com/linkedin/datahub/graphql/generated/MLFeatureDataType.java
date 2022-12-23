package com.linkedin.datahub.graphql.generated;

/**
 * The data type associated with an individual Machine Learning Feature
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum MLFeatureDataType {

    USELESS("USELESS"),
    NOMINAL("NOMINAL"),
    ORDINAL("ORDINAL"),
    BINARY("BINARY"),
    COUNT("COUNT"),
    TIME("TIME"),
    INTERVAL("INTERVAL"),
    IMAGE("IMAGE"),
    VIDEO("VIDEO"),
    AUDIO("AUDIO"),
    TEXT("TEXT"),
    MAP("MAP"),
    SEQUENCE("SEQUENCE"),
    SET("SET"),
    CONTINUOUS("CONTINUOUS"),
    BYTE("BYTE"),
    UNKNOWN("UNKNOWN");

    private final String graphqlName;

    private MLFeatureDataType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}