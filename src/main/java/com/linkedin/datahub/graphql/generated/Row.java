package com.linkedin.datahub.graphql.generated;


/**
 * For consumption by UI only
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class Row implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<String> values;
    @javax.annotation.Nonnull
    private java.util.List<Cell> cells;

    public Row() {
    }

    public Row(java.util.List<String> values, java.util.List<Cell> cells) {
        this.values = values;
        this.cells = cells;
    }

    /**
     * DEPRECATED All values are expected to be strings.
     */
    public java.util.List<String> getValues() {
        return values;
    }
    /**
     * DEPRECATED All values are expected to be strings.
     */
    public void setValues(java.util.List<String> values) {
        this.values = values;
    }

    /**
     * More detailed information about each cell in the row
     */
    public java.util.List<Cell> getCells() {
        return cells;
    }
    /**
     * More detailed information about each cell in the row
     */
    public void setCells(java.util.List<Cell> cells) {
        this.cells = cells;
    }



    public static Row.Builder builder() {
        return new Row.Builder();
    }

    public static class Builder {

        private java.util.List<String> values;
        private java.util.List<Cell> cells;

        public Builder() {
        }

        /**
         * DEPRECATED All values are expected to be strings.
         */
        public Builder setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        /**
         * More detailed information about each cell in the row
         */
        public Builder setCells(java.util.List<Cell> cells) {
            this.cells = cells;
            return this;
        }


        public Row build() {
            return new Row(values, cells);
        }

    }
}
