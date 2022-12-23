package com.linkedin.datahub.graphql.generated;


/**
 * A versioned aspect, or single group of related metadata, associated with an Entity and having a unique version
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface Aspect {

    /**
     * The version of the aspect, where zero represents the latest version
     */
    Long getVersion();

}