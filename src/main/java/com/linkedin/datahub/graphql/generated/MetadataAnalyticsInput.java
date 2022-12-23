package com.linkedin.datahub.graphql.generated;


/**
 * Input to fetch metadata analytics charts
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class MetadataAnalyticsInput implements java.io.Serializable {

    private EntityType entityType;
    private String domain;
    private String query;

    public MetadataAnalyticsInput() {
    }

    public MetadataAnalyticsInput(EntityType entityType, String domain, String query) {
        this.entityType = entityType;
        this.domain = domain;
        this.query = query;
    }

    public EntityType getEntityType() {
        return entityType;
    }
    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public String getDomain() {
        return domain;
    }
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }



    public static MetadataAnalyticsInput.Builder builder() {
        return new MetadataAnalyticsInput.Builder();
    }

    public static class Builder {

        private EntityType entityType;
        private String domain;
        private String query;

        public Builder() {
        }

        public Builder setEntityType(EntityType entityType) {
            this.entityType = entityType;
            return this;
        }

        public Builder setDomain(String domain) {
            this.domain = domain;
            return this;
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }


        public MetadataAnalyticsInput build() {
            return new MetadataAnalyticsInput(entityType, domain, query);
        }

    }
}
