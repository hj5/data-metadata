package com.linkedin.datahub.graphql.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public enum SourceCodeUrlType {

    /**
     * MLModel Source Code
     */
    ML_MODEL_SOURCE_CODE("ML_MODEL_SOURCE_CODE"),
    /**
     * Training Pipeline Source Code
     */
    TRAINING_PIPELINE_SOURCE_CODE("TRAINING_PIPELINE_SOURCE_CODE"),
    /**
     * Evaluation Pipeline Source Code
     */
    EVALUATION_PIPELINE_SOURCE_CODE("EVALUATION_PIPELINE_SOURCE_CODE");

    private final String graphqlName;

    private SourceCodeUrlType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}