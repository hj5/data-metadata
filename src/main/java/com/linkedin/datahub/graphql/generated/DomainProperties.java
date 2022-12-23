package com.linkedin.datahub.graphql.generated;


/**
 * Properties about a domain
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class DomainProperties implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String name;
    private String description;

    public DomainProperties() {
    }

    public DomainProperties(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Display name of the domain
     */
    public String getName() {
        return name;
    }
    /**
     * Display name of the domain
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description of the Domain
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the Domain
     */
    public void setDescription(String description) {
        this.description = description;
    }



    public static DomainProperties.Builder builder() {
        return new DomainProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;

        public Builder() {
        }

        /**
         * Display name of the domain
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Description of the Domain
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public DomainProperties build() {
            return new DomainProperties(name, description);
        }

    }
}
