package com.linkedin.datahub.graphql.generated;


/**
 * An update for the institutional memory information for a Metadata Entity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class InstitutionalMemoryUpdate implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<InstitutionalMemoryMetadataUpdate> elements;

    public InstitutionalMemoryUpdate() {
    }

    public InstitutionalMemoryUpdate(java.util.List<InstitutionalMemoryMetadataUpdate> elements) {
        this.elements = elements;
    }

    public java.util.List<InstitutionalMemoryMetadataUpdate> getElements() {
        return elements;
    }
    public void setElements(java.util.List<InstitutionalMemoryMetadataUpdate> elements) {
        this.elements = elements;
    }



    public static InstitutionalMemoryUpdate.Builder builder() {
        return new InstitutionalMemoryUpdate.Builder();
    }

    public static class Builder {

        private java.util.List<InstitutionalMemoryMetadataUpdate> elements;

        public Builder() {
        }

        public Builder setElements(java.util.List<InstitutionalMemoryMetadataUpdate> elements) {
            this.elements = elements;
            return this;
        }


        public InstitutionalMemoryUpdate build() {
            return new InstitutionalMemoryUpdate(elements);
        }

    }
}
