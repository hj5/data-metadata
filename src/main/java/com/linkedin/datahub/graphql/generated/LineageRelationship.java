package com.linkedin.datahub.graphql.generated;


/**
 * Metadata about a lineage relationship between two entities
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class LineageRelationship implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String type;
    private Entity entity;
    private int degree;

    public LineageRelationship() {
    }

    public LineageRelationship(String type, Entity entity, int degree) {
        this.type = type;
        this.entity = entity;
        this.degree = degree;
    }

    /**
     * The type of the relationship
     */
    public String getType() {
        return type;
    }
    /**
     * The type of the relationship
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Entity that is related via lineage
     */
    public Entity getEntity() {
        return entity;
    }
    /**
     * Entity that is related via lineage
     */
    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    /**
     * Degree of relationship (number of hops to get to entity)
     */
    public int getDegree() {
        return degree;
    }
    /**
     * Degree of relationship (number of hops to get to entity)
     */
    public void setDegree(int degree) {
        this.degree = degree;
    }



    public static LineageRelationship.Builder builder() {
        return new LineageRelationship.Builder();
    }

    public static class Builder {

        private String type;
        private Entity entity;
        private int degree;

        public Builder() {
        }

        /**
         * The type of the relationship
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * Entity that is related via lineage
         */
        public Builder setEntity(Entity entity) {
            this.entity = entity;
            return this;
        }

        /**
         * Degree of relationship (number of hops to get to entity)
         */
        public Builder setDegree(int degree) {
            this.degree = degree;
            return this;
        }


        public LineageRelationship build() {
            return new LineageRelationship(type, entity, degree);
        }

    }
}
