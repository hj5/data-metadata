package com.linkedin.datahub.graphql.generated;


/**
 * Input provided when setting the Deprecation status for an Entity.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class UpdateDeprecationInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String urn;
    private boolean deprecated;
    private Long decommissionTime;
    private String note;

    public UpdateDeprecationInput() {
    }

    public UpdateDeprecationInput(String urn, boolean deprecated, Long decommissionTime, String note) {
        this.urn = urn;
        this.deprecated = deprecated;
        this.decommissionTime = decommissionTime;
        this.note = note;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
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



    public static UpdateDeprecationInput.Builder builder() {
        return new UpdateDeprecationInput.Builder();
    }

    public static class Builder {

        private String urn;
        private boolean deprecated;
        private Long decommissionTime;
        private String note;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
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


        public UpdateDeprecationInput build() {
            return new UpdateDeprecationInput(urn, deprecated, decommissionTime, note);
        }

    }
}
