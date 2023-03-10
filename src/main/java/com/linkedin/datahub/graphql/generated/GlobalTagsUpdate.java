package com.linkedin.datahub.graphql.generated;


/**
 * Deprecated, use addTag or removeTag mutation instead
Update to the Tags associated with a Metadata Entity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class GlobalTagsUpdate implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<TagAssociationUpdate> tags;

    public GlobalTagsUpdate() {
    }

    public GlobalTagsUpdate(java.util.List<TagAssociationUpdate> tags) {
        this.tags = tags;
    }

    public java.util.List<TagAssociationUpdate> getTags() {
        return tags;
    }
    public void setTags(java.util.List<TagAssociationUpdate> tags) {
        this.tags = tags;
    }



    public static GlobalTagsUpdate.Builder builder() {
        return new GlobalTagsUpdate.Builder();
    }

    public static class Builder {

        private java.util.List<TagAssociationUpdate> tags;

        public Builder() {
        }

        public Builder setTags(java.util.List<TagAssociationUpdate> tags) {
            this.tags = tags;
            return this;
        }


        public GlobalTagsUpdate build() {
            return new GlobalTagsUpdate(tags);
        }

    }
}
