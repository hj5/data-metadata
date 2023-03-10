package com.linkedin.datahub.graphql.generated;


/**
 * Update to writable Data Job fields
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class DataJobEditablePropertiesUpdate implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String description;

    public DataJobEditablePropertiesUpdate() {
    }

    public DataJobEditablePropertiesUpdate(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }



    public static DataJobEditablePropertiesUpdate.Builder builder() {
        return new DataJobEditablePropertiesUpdate.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public DataJobEditablePropertiesUpdate build() {
            return new DataJobEditablePropertiesUpdate(description);
        }

    }
}
