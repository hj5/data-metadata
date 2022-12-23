package com.linkedin.datahub.graphql.generated;


/**
 * Update a particular Corp User's editable properties
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface UpdateCorpUserPropertiesMutationResolver {

    /**
     * Update a particular Corp User's editable properties
     */
    CorpUser updateCorpUserProperties(String urn, CorpUserUpdateInput input) throws Exception;

}