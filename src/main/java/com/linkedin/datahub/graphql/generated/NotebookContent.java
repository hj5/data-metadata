package com.linkedin.datahub.graphql.generated;


/**
 * The actual content in a Notebook
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class NotebookContent implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<NotebookCell> cells;

    public NotebookContent() {
    }

    public NotebookContent(java.util.List<NotebookCell> cells) {
        this.cells = cells;
    }

    /**
     * The content of a Notebook which is composed by a list of NotebookCell
     */
    public java.util.List<NotebookCell> getCells() {
        return cells;
    }
    /**
     * The content of a Notebook which is composed by a list of NotebookCell
     */
    public void setCells(java.util.List<NotebookCell> cells) {
        this.cells = cells;
    }



    public static NotebookContent.Builder builder() {
        return new NotebookContent.Builder();
    }

    public static class Builder {

        private java.util.List<NotebookCell> cells;

        public Builder() {
        }

        /**
         * The content of a Notebook which is composed by a list of NotebookCell
         */
        public Builder setCells(java.util.List<NotebookCell> cells) {
            this.cells = cells;
            return this;
        }


        public NotebookContent build() {
            return new NotebookContent(cells);
        }

    }
}
