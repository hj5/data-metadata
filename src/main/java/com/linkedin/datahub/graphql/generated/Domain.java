package com.linkedin.datahub.graphql.generated;


/**
 * A domain, or a logical grouping of Metadata Entities
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class Domain implements java.io.Serializable, Entity {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String id;
    private DomainProperties properties;
    private Ownership ownership;
    private InstitutionalMemory institutionalMemory;

    public Domain() {
    }

    public Domain(String urn, EntityType type, String id, DomainProperties properties, Ownership ownership, InstitutionalMemory institutionalMemory) {
        this.urn = urn;
        this.type = type;
        this.id = id;
        this.properties = properties;
        this.ownership = ownership;
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * The primary key of the domain
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the domain
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * A standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * A standard Entity Type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * Id of the domain
     */
    public String getId() {
        return id;
    }
    /**
     * Id of the domain
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Properties about a domain
     */
    public DomainProperties getProperties() {
        return properties;
    }
    /**
     * Properties about a domain
     */
    public void setProperties(DomainProperties properties) {
        this.properties = properties;
    }

    /**
     * Ownership metadata of the dataset
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the dataset
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * References to internal resources related to the dataset
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the dataset
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }



    public static Domain.Builder builder() {
        return new Domain.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String id;
        private DomainProperties properties;
        private Ownership ownership;
        private InstitutionalMemory institutionalMemory;

        public Builder() {
        }

        /**
         * The primary key of the domain
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * A standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * Id of the domain
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * Properties about a domain
         */
        public Builder setProperties(DomainProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Ownership metadata of the dataset
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * References to internal resources related to the dataset
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }


        public Domain build() {
            return new Domain(urn, type, id, properties, ownership, institutionalMemory);
        }

    }
}
