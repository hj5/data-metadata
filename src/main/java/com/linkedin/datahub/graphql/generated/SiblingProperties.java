package com.linkedin.datahub.graphql.generated;


/**
 * Metadata about the entity's siblings
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class SiblingProperties implements java.io.Serializable {

    private Boolean isPrimary;
    private java.util.List<Entity> siblings;

    public SiblingProperties() {
    }

    public SiblingProperties(Boolean isPrimary, java.util.List<Entity> siblings) {
        this.isPrimary = isPrimary;
        this.siblings = siblings;
    }

    /**
     * If this entity is the primary sibling among the sibling set
     */
    public Boolean getIsPrimary() {
        return isPrimary;
    }
    /**
     * If this entity is the primary sibling among the sibling set
     */
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    /**
     * The sibling entities
     */
    public java.util.List<Entity> getSiblings() {
        return siblings;
    }
    /**
     * The sibling entities
     */
    public void setSiblings(java.util.List<Entity> siblings) {
        this.siblings = siblings;
    }



    public static SiblingProperties.Builder builder() {
        return new SiblingProperties.Builder();
    }

    public static class Builder {

        private Boolean isPrimary;
        private java.util.List<Entity> siblings;

        public Builder() {
        }

        /**
         * If this entity is the primary sibling among the sibling set
         */
        public Builder setIsPrimary(Boolean isPrimary) {
            this.isPrimary = isPrimary;
            return this;
        }

        /**
         * The sibling entities
         */
        public Builder setSiblings(java.util.List<Entity> siblings) {
            this.siblings = siblings;
            return this;
        }


        public SiblingProperties build() {
            return new SiblingProperties(isPrimary, siblings);
        }

    }
}
