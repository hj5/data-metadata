package com.linkedin.datahub.graphql.generated;


/**
 * Input arguments for creating / updating the schedule of an Ingestion Source
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class UpdateIngestionSourceScheduleInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String interval;
    @javax.annotation.Nonnull
    private String timezone;

    public UpdateIngestionSourceScheduleInput() {
    }

    public UpdateIngestionSourceScheduleInput(String interval, String timezone) {
        this.interval = interval;
        this.timezone = timezone;
    }

    public String getInterval() {
        return interval;
    }
    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getTimezone() {
        return timezone;
    }
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }



    public static UpdateIngestionSourceScheduleInput.Builder builder() {
        return new UpdateIngestionSourceScheduleInput.Builder();
    }

    public static class Builder {

        private String interval;
        private String timezone;

        public Builder() {
        }

        public Builder setInterval(String interval) {
            this.interval = interval;
            return this;
        }

        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }


        public UpdateIngestionSourceScheduleInput build() {
            return new UpdateIngestionSourceScheduleInput(interval, timezone);
        }

    }
}
