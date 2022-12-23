package com.linkedin.datahub.graphql.generated;


/**
 * Deprecated, use relationships query instead
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class DownstreamEntityRelationships implements java.io.Serializable {

    private java.util.List<EntityRelationshipLegacy> entities;

    public DownstreamEntityRelationships() {
    }

    public DownstreamEntityRelationships(java.util.List<EntityRelationshipLegacy> entities) {
        this.entities = entities;
    }

    public java.util.List<EntityRelationshipLegacy> getEntities() {
        return entities;
    }
    public void setEntities(java.util.List<EntityRelationshipLegacy> entities) {
        this.entities = entities;
    }



    public static DownstreamEntityRelationships.Builder builder() {
        return new DownstreamEntityRelationships.Builder();
    }

    public static class Builder {

        private java.util.List<EntityRelationshipLegacy> entities;

        public Builder() {
        }

        public Builder setEntities(java.util.List<EntityRelationshipLegacy> entities) {
            this.entities = entities;
            return this;
        }


        public DownstreamEntityRelationships build() {
            return new DownstreamEntityRelationships(entities);
        }

    }
}
