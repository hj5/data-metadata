package com.linkedin.datahub.graphql.generated;


/**
 * Update to writable Chart fields
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class ChartEditablePropertiesUpdate implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String description;

    public ChartEditablePropertiesUpdate() {
    }

    public ChartEditablePropertiesUpdate(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }



    public static ChartEditablePropertiesUpdate.Builder builder() {
        return new ChartEditablePropertiesUpdate.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public ChartEditablePropertiesUpdate build() {
            return new ChartEditablePropertiesUpdate(description);
        }

    }
}
