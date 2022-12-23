package com.linkedin.datahub.graphql.generated;


/**
 * Tags attached to a particular Metadata Entity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class GlobalTags implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<TagAssociation> tags;

    public GlobalTags() {
    }

    public GlobalTags(java.util.List<TagAssociation> tags) {
        this.tags = tags;
    }

    /**
     * The set of tags attached to the Metadata Entity
     */
    public java.util.List<TagAssociation> getTags() {
        return tags;
    }
    /**
     * The set of tags attached to the Metadata Entity
     */
    public void setTags(java.util.List<TagAssociation> tags) {
        this.tags = tags;
    }



    public static GlobalTags.Builder builder() {
        return new GlobalTags.Builder();
    }

    public static class Builder {

        private java.util.List<TagAssociation> tags;

        public Builder() {
        }

        /**
         * The set of tags attached to the Metadata Entity
         */
        public Builder setTags(java.util.List<TagAssociation> tags) {
            this.tags = tags;
            return this;
        }


        public GlobalTags build() {
            return new GlobalTags(tags);
        }

    }
}
