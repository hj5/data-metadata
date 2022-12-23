package com.linkedin.datahub.graphql.generated;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class EntityCountResults implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<EntityCountResult> counts;

    public EntityCountResults() {
    }

    public EntityCountResults(java.util.List<EntityCountResult> counts) {
        this.counts = counts;
    }

    public java.util.List<EntityCountResult> getCounts() {
        return counts;
    }
    public void setCounts(java.util.List<EntityCountResult> counts) {
        this.counts = counts;
    }



    public static EntityCountResults.Builder builder() {
        return new EntityCountResults.Builder();
    }

    public static class Builder {

        private java.util.List<EntityCountResult> counts;

        public Builder() {
        }

        public Builder setCounts(java.util.List<EntityCountResult> counts) {
            this.counts = counts;
            return this;
        }


        public EntityCountResults build() {
            return new EntityCountResults(counts);
        }

    }
}
