package com.linkedin.datahub.graphql.generated;


/**
 * Input required to create a new Tag
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class CreateTagInput implements java.io.Serializable {

    private String id;
    @javax.annotation.Nonnull
    private String name;
    private String description;

    public CreateTagInput() {
    }

    public CreateTagInput(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }



    public static CreateTagInput.Builder builder() {
        return new CreateTagInput.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public CreateTagInput build() {
            return new CreateTagInput(id, name, description);
        }

    }
}
