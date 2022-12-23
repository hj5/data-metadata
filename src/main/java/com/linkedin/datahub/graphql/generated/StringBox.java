package com.linkedin.datahub.graphql.generated;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class StringBox implements java.io.Serializable, ResultsType, HyperParameterValueType {

    @javax.annotation.Nonnull
    private String stringValue;

    public StringBox() {
    }

    public StringBox(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getStringValue() {
        return stringValue;
    }
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }



    public static StringBox.Builder builder() {
        return new StringBox.Builder();
    }

    public static class Builder {

        private String stringValue;

        public Builder() {
        }

        public Builder setStringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }


        public StringBox build() {
            return new StringBox(stringValue);
        }

    }
}
