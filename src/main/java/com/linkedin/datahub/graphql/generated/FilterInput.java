package com.linkedin.datahub.graphql.generated;


/**
 * A set of filter criteria
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class FilterInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<FacetFilterInput> and;

    public FilterInput() {
    }

    public FilterInput(java.util.List<FacetFilterInput> and) {
        this.and = and;
    }

    public java.util.List<FacetFilterInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FacetFilterInput> and) {
        this.and = and;
    }



    public static FilterInput.Builder builder() {
        return new FilterInput.Builder();
    }

    public static class Builder {

        private java.util.List<FacetFilterInput> and;

        public Builder() {
        }

        public Builder setAnd(java.util.List<FacetFilterInput> and) {
            this.and = and;
            return this;
        }


        public FilterInput build() {
            return new FilterInput(and);
        }

    }
}
