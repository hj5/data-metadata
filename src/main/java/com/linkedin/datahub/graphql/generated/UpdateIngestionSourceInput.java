package com.linkedin.datahub.graphql.generated;


/**
 * Input arguments for creating / updating an Ingestion Source
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class UpdateIngestionSourceInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String type;
    private String description;
    private UpdateIngestionSourceScheduleInput schedule;
    @javax.annotation.Nonnull
    private UpdateIngestionSourceConfigInput config;

    public UpdateIngestionSourceInput() {
    }

    public UpdateIngestionSourceInput(String name, String type, String description, UpdateIngestionSourceScheduleInput schedule, UpdateIngestionSourceConfigInput config) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.schedule = schedule;
        this.config = config;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateIngestionSourceScheduleInput getSchedule() {
        return schedule;
    }
    public void setSchedule(UpdateIngestionSourceScheduleInput schedule) {
        this.schedule = schedule;
    }

    public UpdateIngestionSourceConfigInput getConfig() {
        return config;
    }
    public void setConfig(UpdateIngestionSourceConfigInput config) {
        this.config = config;
    }



    public static UpdateIngestionSourceInput.Builder builder() {
        return new UpdateIngestionSourceInput.Builder();
    }

    public static class Builder {

        private String name;
        private String type;
        private String description;
        private UpdateIngestionSourceScheduleInput schedule;
        private UpdateIngestionSourceConfigInput config;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setSchedule(UpdateIngestionSourceScheduleInput schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setConfig(UpdateIngestionSourceConfigInput config) {
            this.config = config;
            return this;
        }


        public UpdateIngestionSourceInput build() {
            return new UpdateIngestionSourceInput(name, type, description, schedule, config);
        }

    }
}
