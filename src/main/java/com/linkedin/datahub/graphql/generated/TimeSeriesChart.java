package com.linkedin.datahub.graphql.generated;


/**
 * For consumption by UI only
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class TimeSeriesChart implements java.io.Serializable, AnalyticsChart {

    @javax.annotation.Nonnull
    private String title;
    @javax.annotation.Nonnull
    private java.util.List<NamedLine> lines;
    @javax.annotation.Nonnull
    private DateRange dateRange;
    @javax.annotation.Nonnull
    private DateInterval interval;

    public TimeSeriesChart() {
    }

    public TimeSeriesChart(String title, java.util.List<NamedLine> lines, DateRange dateRange, DateInterval interval) {
        this.title = title;
        this.lines = lines;
        this.dateRange = dateRange;
        this.interval = interval;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public java.util.List<NamedLine> getLines() {
        return lines;
    }
    public void setLines(java.util.List<NamedLine> lines) {
        this.lines = lines;
    }

    public DateRange getDateRange() {
        return dateRange;
    }
    public void setDateRange(DateRange dateRange) {
        this.dateRange = dateRange;
    }

    public DateInterval getInterval() {
        return interval;
    }
    public void setInterval(DateInterval interval) {
        this.interval = interval;
    }



    public static TimeSeriesChart.Builder builder() {
        return new TimeSeriesChart.Builder();
    }

    public static class Builder {

        private String title;
        private java.util.List<NamedLine> lines;
        private DateRange dateRange;
        private DateInterval interval;

        public Builder() {
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setLines(java.util.List<NamedLine> lines) {
            this.lines = lines;
            return this;
        }

        public Builder setDateRange(DateRange dateRange) {
            this.dateRange = dateRange;
            return this;
        }

        public Builder setInterval(DateInterval interval) {
            this.interval = interval;
            return this;
        }


        public TimeSeriesChart build() {
            return new TimeSeriesChart(title, lines, dateRange, interval);
        }

    }
}
