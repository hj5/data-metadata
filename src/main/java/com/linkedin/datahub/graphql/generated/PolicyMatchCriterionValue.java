package com.linkedin.datahub.graphql.generated;


/**
 * Value in PolicyMatchCriterion with hydrated entity if value is urn
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class PolicyMatchCriterionValue implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String value;
    private Entity entity;

    public PolicyMatchCriterionValue() {
    }

    public PolicyMatchCriterionValue(String value, Entity entity) {
        this.value = value;
        this.entity = entity;
    }

    /**
     * The value of the field to match
     */
    public String getValue() {
        return value;
    }
    /**
     * The value of the field to match
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Hydrated entities of the above values. Only set if the value is an urn
     */
    public Entity getEntity() {
        return entity;
    }
    /**
     * Hydrated entities of the above values. Only set if the value is an urn
     */
    public void setEntity(Entity entity) {
        this.entity = entity;
    }



    public static PolicyMatchCriterionValue.Builder builder() {
        return new PolicyMatchCriterionValue.Builder();
    }

    public static class Builder {

        private String value;
        private Entity entity;

        public Builder() {
        }

        /**
         * The value of the field to match
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        /**
         * Hydrated entities of the above values. Only set if the value is an urn
         */
        public Builder setEntity(Entity entity) {
            this.entity = entity;
            return this;
        }


        public PolicyMatchCriterionValue build() {
            return new PolicyMatchCriterionValue(value, entity);
        }

    }
}
