package com.linkedin.datahub.graphql.generated;


/**
 * Glossary Terms attached to a particular Metadata Entity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class GlossaryTerms implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<GlossaryTermAssociation> terms;

    public GlossaryTerms() {
    }

    public GlossaryTerms(java.util.List<GlossaryTermAssociation> terms) {
        this.terms = terms;
    }

    /**
     * The set of glossary terms attached to the Metadata Entity
     */
    public java.util.List<GlossaryTermAssociation> getTerms() {
        return terms;
    }
    /**
     * The set of glossary terms attached to the Metadata Entity
     */
    public void setTerms(java.util.List<GlossaryTermAssociation> terms) {
        this.terms = terms;
    }



    public static GlossaryTerms.Builder builder() {
        return new GlossaryTerms.Builder();
    }

    public static class Builder {

        private java.util.List<GlossaryTermAssociation> terms;

        public Builder() {
        }

        /**
         * The set of glossary terms attached to the Metadata Entity
         */
        public Builder setTerms(java.util.List<GlossaryTermAssociation> terms) {
            this.terms = terms;
            return this;
        }


        public GlossaryTerms build() {
            return new GlossaryTerms(terms);
        }

    }
}
