package com.linkedin.datahub.graphql.generated;


/**
 * Update a particular Corp Group's editable properties
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface UpdateCorpGroupPropertiesMutationResolver {

    /**
     * Update a particular Corp Group's editable properties
     */
    CorpGroup updateCorpGroupProperties(String urn, CorpGroupUpdateInput input) throws Exception;

}