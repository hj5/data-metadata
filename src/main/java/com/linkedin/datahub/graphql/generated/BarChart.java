package com.linkedin.datahub.graphql.generated;


/**
 * For consumption by UI only
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class BarChart implements java.io.Serializable, AnalyticsChart {

    @javax.annotation.Nonnull
    private String title;
    @javax.annotation.Nonnull
    private java.util.List<NamedBar> bars;

    public BarChart() {
    }

    public BarChart(String title, java.util.List<NamedBar> bars) {
        this.title = title;
        this.bars = bars;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public java.util.List<NamedBar> getBars() {
        return bars;
    }
    public void setBars(java.util.List<NamedBar> bars) {
        this.bars = bars;
    }



    public static BarChart.Builder builder() {
        return new BarChart.Builder();
    }

    public static class Builder {

        private String title;
        private java.util.List<NamedBar> bars;

        public Builder() {
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setBars(java.util.List<NamedBar> bars) {
            this.bars = bars;
            return this;
        }


        public BarChart build() {
            return new BarChart(title, bars);
        }

    }
}
