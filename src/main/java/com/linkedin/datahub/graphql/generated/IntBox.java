package com.linkedin.datahub.graphql.generated;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class IntBox implements java.io.Serializable, HyperParameterValueType {

    private int intValue;

    public IntBox() {
    }

    public IntBox(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }
    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }



    public static IntBox.Builder builder() {
        return new IntBox.Builder();
    }

    public static class Builder {

        private int intValue;

        public Builder() {
        }

        public Builder setIntValue(int intValue) {
            this.intValue = intValue;
            return this;
        }


        public IntBox build() {
            return new IntBox(intValue);
        }

    }
}
