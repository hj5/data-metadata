package com.linkedin.datahub.graphql.generated;


/**
 * String map entry input
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class StringMapEntryInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String key;
    private String value;

    public StringMapEntryInput() {
    }

    public StringMapEntryInput(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }



    public static StringMapEntryInput.Builder builder() {
        return new StringMapEntryInput.Builder();
    }

    public static class Builder {

        private String key;
        private String value;

        public Builder() {
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public StringMapEntryInput build() {
            return new StringMapEntryInput(key, value);
        }

    }
}
