package com.linkedin.datahub.graphql.generated;


/**
 * Fetch a CorpUser, representing a DataHub platform user, by primary key (urn)
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface CorpUserQueryResolver {

    /**
     * Fetch a CorpUser, representing a DataHub platform user, by primary key (urn)
     */
    CorpUser corpUser(String urn) throws Exception;

}