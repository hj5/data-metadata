package com.linkedin.datahub.graphql.generated;


/**
 * Information about the source of Ownership metadata about a Metadata Entity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class OwnershipSource implements java.io.Serializable {

    @javax.annotation.Nonnull
    private OwnershipSourceType type;
    private String url;

    public OwnershipSource() {
    }

    public OwnershipSource(OwnershipSourceType type, String url) {
        this.type = type;
        this.url = url;
    }

    /**
     * The type of the source
     */
    public OwnershipSourceType getType() {
        return type;
    }
    /**
     * The type of the source
     */
    public void setType(OwnershipSourceType type) {
        this.type = type;
    }

    /**
     * An optional reference URL for the source
     */
    public String getUrl() {
        return url;
    }
    /**
     * An optional reference URL for the source
     */
    public void setUrl(String url) {
        this.url = url;
    }



    public static OwnershipSource.Builder builder() {
        return new OwnershipSource.Builder();
    }

    public static class Builder {

        private OwnershipSourceType type;
        private String url;

        public Builder() {
        }

        /**
         * The type of the source
         */
        public Builder setType(OwnershipSourceType type) {
            this.type = type;
            return this;
        }

        /**
         * An optional reference URL for the source
         */
        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }


        public OwnershipSource build() {
            return new OwnershipSource(type, url);
        }

    }
}
