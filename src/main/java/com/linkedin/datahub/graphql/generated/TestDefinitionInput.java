package com.linkedin.datahub.graphql.generated;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class TestDefinitionInput implements java.io.Serializable {

    private String json;

    public TestDefinitionInput() {
    }

    public TestDefinitionInput(String json) {
        this.json = json;
    }

    public String getJson() {
        return json;
    }
    public void setJson(String json) {
        this.json = json;
    }



    public static TestDefinitionInput.Builder builder() {
        return new TestDefinitionInput.Builder();
    }

    public static class Builder {

        private String json;

        public Builder() {
        }

        public Builder setJson(String json) {
            this.json = json;
            return this;
        }


        public TestDefinitionInput build() {
            return new TestDefinitionInput(json);
        }

    }
}
