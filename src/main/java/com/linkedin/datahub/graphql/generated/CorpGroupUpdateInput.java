package com.linkedin.datahub.graphql.generated;


/**
 * Arguments provided to update a CorpGroup Entity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class CorpGroupUpdateInput implements java.io.Serializable {

    private String description;
    private String slack;
    private String email;

    public CorpGroupUpdateInput() {
    }

    public CorpGroupUpdateInput(String description, String slack, String email) {
        this.description = description;
        this.slack = slack;
        this.email = email;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getSlack() {
        return slack;
    }
    public void setSlack(String slack) {
        this.slack = slack;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }



    public static CorpGroupUpdateInput.Builder builder() {
        return new CorpGroupUpdateInput.Builder();
    }

    public static class Builder {

        private String description;
        private String slack;
        private String email;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setSlack(String slack) {
            this.slack = slack;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }


        public CorpGroupUpdateInput build() {
            return new CorpGroupUpdateInput(description, slack, email);
        }

    }
}
