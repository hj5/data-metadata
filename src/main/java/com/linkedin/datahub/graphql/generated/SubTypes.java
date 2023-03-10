package com.linkedin.datahub.graphql.generated;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class SubTypes implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<String> typeNames;

    public SubTypes() {
    }

    public SubTypes(java.util.List<String> typeNames) {
        this.typeNames = typeNames;
    }

    /**
     * The sub-types that this entity implements. e.g. Datasets that are views will implement the "view" subtype
     */
    public java.util.List<String> getTypeNames() {
        return typeNames;
    }
    /**
     * The sub-types that this entity implements. e.g. Datasets that are views will implement the "view" subtype
     */
    public void setTypeNames(java.util.List<String> typeNames) {
        this.typeNames = typeNames;
    }



    public static SubTypes.Builder builder() {
        return new SubTypes.Builder();
    }

    public static class Builder {

        private java.util.List<String> typeNames;

        public Builder() {
        }

        /**
         * The sub-types that this entity implements. e.g. Datasets that are views will implement the "view" subtype
         */
        public Builder setTypeNames(java.util.List<String> typeNames) {
            this.typeNames = typeNames;
            return this;
        }


        public SubTypes build() {
            return new SubTypes(typeNames);
        }

    }
}
