package com.linkedin.datahub.graphql.generated;


/**
 * The technical version associated with a given Metadata Entity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class VersionTag implements java.io.Serializable {

    private String versionTag;

    public VersionTag() {
    }

    public VersionTag(String versionTag) {
        this.versionTag = versionTag;
    }

    public String getVersionTag() {
        return versionTag;
    }
    public void setVersionTag(String versionTag) {
        this.versionTag = versionTag;
    }



    public static VersionTag.Builder builder() {
        return new VersionTag.Builder();
    }

    public static class Builder {

        private String versionTag;

        public Builder() {
        }

        public Builder setVersionTag(String versionTag) {
            this.versionTag = versionTag;
            return this;
        }


        public VersionTag build() {
            return new VersionTag(versionTag);
        }

    }
}
