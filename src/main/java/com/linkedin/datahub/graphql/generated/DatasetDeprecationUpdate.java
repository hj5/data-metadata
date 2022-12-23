package com.linkedin.datahub.graphql.generated;


/**
 * An update for the deprecation information for a Metadata Entity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class DatasetDeprecationUpdate implements java.io.Serializable {

    private boolean deprecated;
    private Long decommissionTime;
    @javax.annotation.Nonnull
    private String note;

    public DatasetDeprecationUpdate() {
    }

    public DatasetDeprecationUpdate(boolean deprecated, Long decommissionTime, String note) {
        this.deprecated = deprecated;
        this.decommissionTime = decommissionTime;
        this.note = note;
    }

    public boolean getDeprecated() {
        return deprecated;
    }
    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }

    public Long getDecommissionTime() {
        return decommissionTime;
    }
    public void setDecommissionTime(Long decommissionTime) {
        this.decommissionTime = decommissionTime;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }



    public static DatasetDeprecationUpdate.Builder builder() {
        return new DatasetDeprecationUpdate.Builder();
    }

    public static class Builder {

        private boolean deprecated;
        private Long decommissionTime;
        private String note;

        public Builder() {
        }

        public Builder setDeprecated(boolean deprecated) {
            this.deprecated = deprecated;
            return this;
        }

        public Builder setDecommissionTime(Long decommissionTime) {
            this.decommissionTime = decommissionTime;
            return this;
        }

        public Builder setNote(String note) {
            this.note = note;
            return this;
        }


        public DatasetDeprecationUpdate build() {
            return new DatasetDeprecationUpdate(deprecated, decommissionTime, note);
        }

    }
}
