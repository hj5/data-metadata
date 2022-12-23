package com.linkedin.datahub.graphql.generated;


/**
 * The results returned on a single entity autocomplete query
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class AutoCompleteResults implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String query;
    @javax.annotation.Nonnull
    private java.util.List<String> suggestions;
    @javax.annotation.Nonnull
    private java.util.List<Entity> entities;

    public AutoCompleteResults() {
    }

    public AutoCompleteResults(String query, java.util.List<String> suggestions, java.util.List<Entity> entities) {
        this.query = query;
        this.suggestions = suggestions;
        this.entities = entities;
    }

    /**
     * The query string
     */
    public String getQuery() {
        return query;
    }
    /**
     * The query string
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * The autocompletion results
     */
    public java.util.List<String> getSuggestions() {
        return suggestions;
    }
    /**
     * The autocompletion results
     */
    public void setSuggestions(java.util.List<String> suggestions) {
        this.suggestions = suggestions;
    }

    /**
     * A list of entities to render in autocomplete
     */
    public java.util.List<Entity> getEntities() {
        return entities;
    }
    /**
     * A list of entities to render in autocomplete
     */
    public void setEntities(java.util.List<Entity> entities) {
        this.entities = entities;
    }



    public static AutoCompleteResults.Builder builder() {
        return new AutoCompleteResults.Builder();
    }

    public static class Builder {

        private String query;
        private java.util.List<String> suggestions;
        private java.util.List<Entity> entities;

        public Builder() {
        }

        /**
         * The query string
         */
        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        /**
         * The autocompletion results
         */
        public Builder setSuggestions(java.util.List<String> suggestions) {
            this.suggestions = suggestions;
            return this;
        }

        /**
         * A list of entities to render in autocomplete
         */
        public Builder setEntities(java.util.List<Entity> entities) {
            this.entities = entities;
            return this;
        }


        public AutoCompleteResults build() {
            return new AutoCompleteResults(query, suggestions, entities);
        }

    }
}
