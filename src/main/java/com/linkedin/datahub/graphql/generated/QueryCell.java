package com.linkedin.datahub.graphql.generated;


/**
 * A Notebook cell which contains Query as content
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class QueryCell implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String cellTitle;
    @javax.annotation.Nonnull
    private String cellId;
    private ChangeAuditStamps changeAuditStamps;
    @javax.annotation.Nonnull
    private String rawQuery;
    private AuditStamp lastExecuted;

    public QueryCell() {
    }

    public QueryCell(String cellTitle, String cellId, ChangeAuditStamps changeAuditStamps, String rawQuery, AuditStamp lastExecuted) {
        this.cellTitle = cellTitle;
        this.cellId = cellId;
        this.changeAuditStamps = changeAuditStamps;
        this.rawQuery = rawQuery;
        this.lastExecuted = lastExecuted;
    }

    /**
     * Title of the cell
     */
    public String getCellTitle() {
        return cellTitle;
    }
    /**
     * Title of the cell
     */
    public void setCellTitle(String cellTitle) {
        this.cellTitle = cellTitle;
    }

    /**
     * Unique id for the cell.
     */
    public String getCellId() {
        return cellId;
    }
    /**
     * Unique id for the cell.
     */
    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

    /**
     * Captures information about who created/last modified/deleted this TextCell and when
     */
    public ChangeAuditStamps getChangeAuditStamps() {
        return changeAuditStamps;
    }
    /**
     * Captures information about who created/last modified/deleted this TextCell and when
     */
    public void setChangeAuditStamps(ChangeAuditStamps changeAuditStamps) {
        this.changeAuditStamps = changeAuditStamps;
    }

    /**
     * Raw query to explain some specific logic in a Notebook
     */
    public String getRawQuery() {
        return rawQuery;
    }
    /**
     * Raw query to explain some specific logic in a Notebook
     */
    public void setRawQuery(String rawQuery) {
        this.rawQuery = rawQuery;
    }

    /**
     * Captures information about who last executed this query cell and when
     */
    public AuditStamp getLastExecuted() {
        return lastExecuted;
    }
    /**
     * Captures information about who last executed this query cell and when
     */
    public void setLastExecuted(AuditStamp lastExecuted) {
        this.lastExecuted = lastExecuted;
    }



    public static QueryCell.Builder builder() {
        return new QueryCell.Builder();
    }

    public static class Builder {

        private String cellTitle;
        private String cellId;
        private ChangeAuditStamps changeAuditStamps;
        private String rawQuery;
        private AuditStamp lastExecuted;

        public Builder() {
        }

        /**
         * Title of the cell
         */
        public Builder setCellTitle(String cellTitle) {
            this.cellTitle = cellTitle;
            return this;
        }

        /**
         * Unique id for the cell.
         */
        public Builder setCellId(String cellId) {
            this.cellId = cellId;
            return this;
        }

        /**
         * Captures information about who created/last modified/deleted this TextCell and when
         */
        public Builder setChangeAuditStamps(ChangeAuditStamps changeAuditStamps) {
            this.changeAuditStamps = changeAuditStamps;
            return this;
        }

        /**
         * Raw query to explain some specific logic in a Notebook
         */
        public Builder setRawQuery(String rawQuery) {
            this.rawQuery = rawQuery;
            return this;
        }

        /**
         * Captures information about who last executed this query cell and when
         */
        public Builder setLastExecuted(AuditStamp lastExecuted) {
            this.lastExecuted = lastExecuted;
            return this;
        }


        public QueryCell build() {
            return new QueryCell(cellTitle, cellId, changeAuditStamps, rawQuery, lastExecuted);
        }

    }
}
