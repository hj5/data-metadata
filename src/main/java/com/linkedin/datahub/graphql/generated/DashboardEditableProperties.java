package com.linkedin.datahub.graphql.generated;


/**
 * Dashboard properties that are editable via the UI This represents logical metadata,
as opposed to technical metadata
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class DashboardEditableProperties implements java.io.Serializable {

    private String description;

    public DashboardEditableProperties() {
    }

    public DashboardEditableProperties(String description) {
        this.description = description;
    }

    /**
     * Description of the Dashboard
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the Dashboard
     */
    public void setDescription(String description) {
        this.description = description;
    }



    public static DashboardEditableProperties.Builder builder() {
        return new DashboardEditableProperties.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        /**
         * Description of the Dashboard
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public DashboardEditableProperties build() {
            return new DashboardEditableProperties(description);
        }

    }
}
