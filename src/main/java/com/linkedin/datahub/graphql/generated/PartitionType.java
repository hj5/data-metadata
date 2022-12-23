package com.linkedin.datahub.graphql.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum PartitionType {

    FULL_TABLE("FULL_TABLE"),
    QUERY("QUERY"),
    PARTITION("PARTITION");

    private final String graphqlName;

    private PartitionType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}