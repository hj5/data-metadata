package com.linkedin.datahub.graphql.generated;


/**
 * Fetch a Dataset by primary key (urn)
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface DatasetQueryResolver {

    /**
     * Fetch a Dataset by primary key (urn)
     */
    Dataset dataset(String urn) throws Exception;

}