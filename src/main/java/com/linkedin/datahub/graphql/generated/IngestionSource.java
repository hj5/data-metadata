package com.linkedin.datahub.graphql.generated;


/**
 * An Ingestion Source Entity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class IngestionSource implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private String type;
    @javax.annotation.Nonnull
    private String name;
    private IngestionSchedule schedule;
    @javax.annotation.Nonnull
    private IngestionConfig config;

    public IngestionSource() {
    }

    public IngestionSource(String urn, String type, String name, IngestionSchedule schedule, IngestionConfig config) {
        this.urn = urn;
        this.type = type;
        this.name = name;
        this.schedule = schedule;
        this.config = config;
    }

    /**
     * The primary key of the Ingestion Source
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Ingestion Source
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * The type of the source itself, e.g. mysql, bigquery, bigquery-usage. Should match the recipe.
     */
    public String getType() {
        return type;
    }
    /**
     * The type of the source itself, e.g. mysql, bigquery, bigquery-usage. Should match the recipe.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The display name of the Ingestion Source
     */
    public String getName() {
        return name;
    }
    /**
     * The display name of the Ingestion Source
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * An optional schedule associated with the Ingestion Source
     */
    public IngestionSchedule getSchedule() {
        return schedule;
    }
    /**
     * An optional schedule associated with the Ingestion Source
     */
    public void setSchedule(IngestionSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * An type-specific set of configurations for the ingestion source
     */
    public IngestionConfig getConfig() {
        return config;
    }
    /**
     * An type-specific set of configurations for the ingestion source
     */
    public void setConfig(IngestionConfig config) {
        this.config = config;
    }



    public static IngestionSource.Builder builder() {
        return new IngestionSource.Builder();
    }

    public static class Builder {

        private String urn;
        private String type;
        private String name;
        private IngestionSchedule schedule;
        private IngestionConfig config;

        public Builder() {
        }

        /**
         * The primary key of the Ingestion Source
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * The type of the source itself, e.g. mysql, bigquery, bigquery-usage. Should match the recipe.
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * The display name of the Ingestion Source
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * An optional schedule associated with the Ingestion Source
         */
        public Builder setSchedule(IngestionSchedule schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * An type-specific set of configurations for the ingestion source
         */
        public Builder setConfig(IngestionConfig config) {
            this.config = config;
            return this;
        }


        public IngestionSource build() {
            return new IngestionSource(urn, type, name, schedule, config);
        }

    }
}
