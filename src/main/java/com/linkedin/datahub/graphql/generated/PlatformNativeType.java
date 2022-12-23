package com.linkedin.datahub.graphql.generated;

/**
 * Deprecated, do not use this type
The logical type associated with an individual Dataset
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum PlatformNativeType {

    /**
     * Table
     */
    TABLE("TABLE"),
    /**
     * View
     */
    VIEW("VIEW"),
    /**
     * Directory in file system
     */
    DIRECTORY("DIRECTORY"),
    /**
     * Stream
     */
    STREAM("STREAM"),
    /**
     * Bucket in key value store
     */
    BUCKET("BUCKET");

    private final String graphqlName;

    private PlatformNativeType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}