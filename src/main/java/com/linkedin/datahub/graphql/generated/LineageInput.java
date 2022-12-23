package com.linkedin.datahub.graphql.generated;


/**
 * Input for the list lineage property of an Entity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class LineageInput implements java.io.Serializable {

    @javax.annotation.Nonnull
    private LineageDirection direction;
    private Integer start;
    private Integer count;

    public LineageInput() {
    }

    public LineageInput(LineageDirection direction, Integer start, Integer count) {
        this.direction = direction;
        this.start = start;
        this.count = count;
    }

    public LineageDirection getDirection() {
        return direction;
    }
    public void setDirection(LineageDirection direction) {
        this.direction = direction;
    }

    public Integer getStart() {
        return start;
    }
    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }



    public static LineageInput.Builder builder() {
        return new LineageInput.Builder();
    }

    public static class Builder {

        private LineageDirection direction;
        private Integer start;
        private Integer count;

        public Builder() {
        }

        public Builder setDirection(LineageDirection direction) {
            this.direction = direction;
            return this;
        }

        public Builder setStart(Integer start) {
            this.start = start;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }


        public LineageInput build() {
            return new LineageInput(direction, start, count);
        }

    }
}
