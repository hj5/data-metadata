package com.linkedin.datahub.graphql.generated;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class CreateAccessTokenInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private AccessTokenType type;
    @javax.annotation.Nonnull
    private String actorUrn;
    @javax.annotation.Nonnull
    private AccessTokenDuration duration;
    @javax.annotation.Nonnull
    private String name;
    private String description;

    public CreateAccessTokenInput() {
    }

    public CreateAccessTokenInput(AccessTokenType type, String actorUrn, AccessTokenDuration duration, String name, String description) {
        this.type = type;
        this.actorUrn = actorUrn;
        this.duration = duration;
        this.name = name;
        this.description = description;
    }

    public AccessTokenType getType() {
        return type;
    }
    public void setType(AccessTokenType type) {
        this.type = type;
    }

    public String getActorUrn() {
        return actorUrn;
    }
    public void setActorUrn(String actorUrn) {
        this.actorUrn = actorUrn;
    }

    public AccessTokenDuration getDuration() {
        return duration;
    }
    public void setDuration(AccessTokenDuration duration) {
        this.duration = duration;
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



    public static CreateAccessTokenInput.Builder builder() {
        return new CreateAccessTokenInput.Builder();
    }

    public static class Builder {

        private AccessTokenType type;
        private String actorUrn;
        private AccessTokenDuration duration;
        private String name;
        private String description;

        public Builder() {
        }

        public Builder setType(AccessTokenType type) {
            this.type = type;
            return this;
        }

        public Builder setActorUrn(String actorUrn) {
            this.actorUrn = actorUrn;
            return this;
        }

        public Builder setDuration(AccessTokenDuration duration) {
            this.duration = duration;
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


        public CreateAccessTokenInput build() {
            return new CreateAccessTokenInput(type, actorUrn, duration, name, description);
        }

    }
}
