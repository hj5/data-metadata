package com.linkedin.datahub.graphql.generated;


/**
 * Fetch a Data Platform by primary key (urn)
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface DataPlatformQueryResolver {

    /**
     * Fetch a Data Platform by primary key (urn)
     */
    DataPlatform dataPlatform(String urn) throws Exception;

}