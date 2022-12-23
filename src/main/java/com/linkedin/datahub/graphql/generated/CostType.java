package com.linkedin.datahub.graphql.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum CostType {

    /**
     * Org Cost Type to which the Cost of this entity should be attributed to
     */
    ORG_COST_TYPE("ORG_COST_TYPE");

    private final String graphqlName;

    private CostType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}