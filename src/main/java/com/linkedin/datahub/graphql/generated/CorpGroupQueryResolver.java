package com.linkedin.datahub.graphql.generated;


/**
 * Fetch a CorpGroup, representing a DataHub platform group by primary key (urn)
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface CorpGroupQueryResolver {

    /**
     * Fetch a CorpGroup, representing a DataHub platform group by primary key (urn)
     */
    CorpGroup corpGroup(String urn) throws Exception;

}