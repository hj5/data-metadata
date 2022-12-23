package com.linkedin.datahub.graphql.generated;

/**
 * Enum of CategoryTypes
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum ChangeCategoryType {

    /**
     * When documentation has been edited
     */
    DOCUMENTATION("DOCUMENTATION"),
    /**
     * When glossary terms have been added or removed
     */
    GLOSSARY_TERM("GLOSSARY_TERM"),
    /**
     * When ownership has been modified
     */
    OWNERSHIP("OWNERSHIP"),
    /**
     * When technical schemas have been added or removed
     */
    TECHNICAL_SCHEMA("TECHNICAL_SCHEMA"),
    /**
     * When tags have been added or removed
     */
    TAG("TAG");

    private final String graphqlName;

    private ChangeCategoryType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}