package com.linkedin.datahub.graphql.generated;


/**
 * Set the hex color associated with an existing Tag
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface SetTagColorMutationResolver {

    /**
     * Set the hex color associated with an existing Tag
     */
    Boolean setTagColor(String urn, String colorHex) throws Exception;

}