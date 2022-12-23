package com.linkedin.datahub.graphql.generated;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class BooleanBox implements java.io.Serializable, HyperParameterValueType {

    private boolean booleanValue;

    public BooleanBox() {
    }

    public BooleanBox(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public boolean getBooleanValue() {
        return booleanValue;
    }
    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }



    public static BooleanBox.Builder builder() {
        return new BooleanBox.Builder();
    }

    public static class Builder {

        private boolean booleanValue;

        public Builder() {
        }

        public Builder setBooleanValue(boolean booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }


        public BooleanBox build() {
            return new BooleanBox(booleanValue);
        }

    }
}
