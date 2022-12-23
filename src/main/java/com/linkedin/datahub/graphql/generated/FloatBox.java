package com.linkedin.datahub.graphql.generated;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class FloatBox implements java.io.Serializable, HyperParameterValueType {

    private double floatValue;

    public FloatBox() {
    }

    public FloatBox(double floatValue) {
        this.floatValue = floatValue;
    }

    public double getFloatValue() {
        return floatValue;
    }
    public void setFloatValue(double floatValue) {
        this.floatValue = floatValue;
    }



    public static FloatBox.Builder builder() {
        return new FloatBox.Builder();
    }

    public static class Builder {

        private double floatValue;

        public Builder() {
        }

        public Builder setFloatValue(double floatValue) {
            this.floatValue = floatValue;
            return this;
        }


        public FloatBox build() {
            return new FloatBox(floatValue);
        }

    }
}
