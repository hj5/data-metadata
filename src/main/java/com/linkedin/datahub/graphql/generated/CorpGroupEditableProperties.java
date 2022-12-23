package com.linkedin.datahub.graphql.generated;


/**
 * Additional read write properties about a group
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class CorpGroupEditableProperties implements java.io.Serializable {

    private String description;
    private String slack;
    private String email;

    public CorpGroupEditableProperties() {
    }

    public CorpGroupEditableProperties(String description, String slack, String email) {
        this.description = description;
        this.slack = slack;
        this.email = email;
    }

    /**
     * DataHub description of the group
     */
    public String getDescription() {
        return description;
    }
    /**
     * DataHub description of the group
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Slack handle for the group
     */
    public String getSlack() {
        return slack;
    }
    /**
     * Slack handle for the group
     */
    public void setSlack(String slack) {
        this.slack = slack;
    }

    /**
     * Email address for the group
     */
    public String getEmail() {
        return email;
    }
    /**
     * Email address for the group
     */
    public void setEmail(String email) {
        this.email = email;
    }



    public static CorpGroupEditableProperties.Builder builder() {
        return new CorpGroupEditableProperties.Builder();
    }

    public static class Builder {

        private String description;
        private String slack;
        private String email;

        public Builder() {
        }

        /**
         * DataHub description of the group
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Slack handle for the group
         */
        public Builder setSlack(String slack) {
            this.slack = slack;
            return this;
        }

        /**
         * Email address for the group
         */
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }


        public CorpGroupEditableProperties build() {
            return new CorpGroupEditableProperties(description, slack, email);
        }

    }
}
