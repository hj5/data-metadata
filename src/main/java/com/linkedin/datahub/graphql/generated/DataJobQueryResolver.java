package com.linkedin.datahub.graphql.generated;


/**
 * Fetch a Data Job (or Data Task) by primary key (urn)
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface DataJobQueryResolver {

    /**
     * Fetch a Data Job (or Data Task) by primary key (urn)
     */
    DataJob dataJob(String urn) throws Exception;

}