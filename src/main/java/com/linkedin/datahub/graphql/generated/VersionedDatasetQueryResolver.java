package com.linkedin.datahub.graphql.generated;


/**
 * Fetch a Dataset by primary key (urn) at a point in time based on aspect versions (versionStamp)
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface VersionedDatasetQueryResolver {

    /**
     * Fetch a Dataset by primary key (urn) at a point in time based on aspect versions (versionStamp)
     */
    VersionedDataset versionedDataset(String urn, String versionStamp) throws Exception;

}