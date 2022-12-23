package com.linkedin.datahub.graphql.generated;


/**
 * A metadata entity representing a DataHub Test
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class Test implements java.io.Serializable, Entity {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String category;
    private String description;
    @javax.annotation.Nonnull
    private TestDefinition definition;

    public Test() {
    }

    public Test(String urn, EntityType type, String name, String category, String description, TestDefinition definition) {
        this.urn = urn;
        this.type = type;
        this.name = name;
        this.category = category;
        this.description = description;
        this.definition = definition;
    }

    /**
     * The primary key of the Test itself
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Test itself
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * The standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * The standard Entity Type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * The name of the Test
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the Test
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The category of the Test (user defined)
     */
    public String getCategory() {
        return category;
    }
    /**
     * The category of the Test (user defined)
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Description of the test
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the test
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Definition for the test
     */
    public TestDefinition getDefinition() {
        return definition;
    }
    /**
     * Definition for the test
     */
    public void setDefinition(TestDefinition definition) {
        this.definition = definition;
    }



    public static Test.Builder builder() {
        return new Test.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String name;
        private String category;
        private String description;
        private TestDefinition definition;

        public Builder() {
        }

        /**
         * The primary key of the Test itself
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * The standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * The name of the Test
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The category of the Test (user defined)
         */
        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        /**
         * Description of the test
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Definition for the test
         */
        public Builder setDefinition(TestDefinition definition) {
            this.definition = definition;
            return this;
        }


        public Test build() {
            return new Test(urn, type, name, category, description, definition);
        }

    }
}
