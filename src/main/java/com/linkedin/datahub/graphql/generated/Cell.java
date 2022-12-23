package com.linkedin.datahub.graphql.generated;


/**
 * For consumption by UI only
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class Cell implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String value;
    private Entity entity;
    private LinkParams linkParams;

    public Cell() {
    }

    public Cell(String value, Entity entity, LinkParams linkParams) {
        this.value = value;
        this.entity = entity;
        this.linkParams = linkParams;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public Entity getEntity() {
        return entity;
    }
    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public LinkParams getLinkParams() {
        return linkParams;
    }
    public void setLinkParams(LinkParams linkParams) {
        this.linkParams = linkParams;
    }



    public static Cell.Builder builder() {
        return new Cell.Builder();
    }

    public static class Builder {

        private String value;
        private Entity entity;
        private LinkParams linkParams;

        public Builder() {
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        public Builder setEntity(Entity entity) {
            this.entity = entity;
            return this;
        }

        public Builder setLinkParams(LinkParams linkParams) {
            this.linkParams = linkParams;
            return this;
        }


        public Cell build() {
            return new Cell(value, entity, linkParams);
        }

    }
}
