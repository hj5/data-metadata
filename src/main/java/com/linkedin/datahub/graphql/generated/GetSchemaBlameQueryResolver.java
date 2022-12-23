package com.linkedin.datahub.graphql.generated;


/**
 * Returns the most recent changes made to each column in a dataset at each dataset version.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface GetSchemaBlameQueryResolver {

    /**
     * Returns the most recent changes made to each column in a dataset at each dataset version.
     */
    GetSchemaBlameResult getSchemaBlame(GetSchemaBlameInput input) throws Exception;

}