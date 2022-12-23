package com.linkedin.datahub.graphql.generated;


/**
 * A schedule associated with an Ingestion Source
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class IngestionSchedule implements java.io.Serializable {

    private String timezone;
    @javax.annotation.Nonnull
    private String interval;

    public IngestionSchedule() {
    }

    public IngestionSchedule(String timezone, String interval) {
        this.timezone = timezone;
        this.interval = interval;
    }

    /**
     * Time Zone abbreviation (e.g. GMT, EDT). Defaults to UTC.
     */
    public String getTimezone() {
        return timezone;
    }
    /**
     * Time Zone abbreviation (e.g. GMT, EDT). Defaults to UTC.
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * The cron-formatted interval to execute the ingestion source on
     */
    public String getInterval() {
        return interval;
    }
    /**
     * The cron-formatted interval to execute the ingestion source on
     */
    public void setInterval(String interval) {
        this.interval = interval;
    }



    public static IngestionSchedule.Builder builder() {
        return new IngestionSchedule.Builder();
    }

    public static class Builder {

        private String timezone;
        private String interval;

        public Builder() {
        }

        /**
         * Time Zone abbreviation (e.g. GMT, EDT). Defaults to UTC.
         */
        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * The cron-formatted interval to execute the ingestion source on
         */
        public Builder setInterval(String interval) {
            this.interval = interval;
            return this;
        }


        public IngestionSchedule build() {
            return new IngestionSchedule(timezone, interval);
        }

    }
}
