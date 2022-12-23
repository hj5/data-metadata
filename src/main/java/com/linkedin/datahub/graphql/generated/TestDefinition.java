package com.linkedin.datahub.graphql.generated;


/**
 * Definition of the test
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class TestDefinition implements java.io.Serializable {

    private String json;

    public TestDefinition() {
    }

    public TestDefinition(String json) {
        this.json = json;
    }

    /**
     * JSON-based def for the test
     */
    public String getJson() {
        return json;
    }
    /**
     * JSON-based def for the test
     */
    public void setJson(String json) {
        this.json = json;
    }



    public static TestDefinition.Builder builder() {
        return new TestDefinition.Builder();
    }

    public static class Builder {

        private String json;

        public Builder() {
        }

        /**
         * JSON-based def for the test
         */
        public Builder setJson(String json) {
            this.json = json;
            return this;
        }


        public TestDefinition build() {
            return new TestDefinition(json);
        }

    }
}
