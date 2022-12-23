package com.linkedin.datahub.graphql.generated;


/**
 * Input for creating a new group
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class CreateGroupInput implements java.io.Serializable {

    private String id;
    @javax.annotation.Nonnull
    private String name;
    private String description;

    public CreateGroupInput() {
    }

    public CreateGroupInput(String id, String name, String description) {
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



    public static CreateGroupInput.Builder builder() {
        return new CreateGroupInput.Builder();
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


        public CreateGroupInput build() {
            return new CreateGroupInput(id, name, description);
        }

    }
}
