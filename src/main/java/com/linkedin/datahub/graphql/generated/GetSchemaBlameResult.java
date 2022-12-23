package com.linkedin.datahub.graphql.generated;


/**
 * Schema changes computed at a specific version.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class GetSchemaBlameResult implements java.io.Serializable {

    @javax.annotation.Nonnull
    private SemanticVersionStruct latestVersion;
    private SemanticVersionStruct version;
    @javax.annotation.Nonnull
    private java.util.List<SemanticVersionStruct> semanticVersionList;
    @javax.annotation.Nonnull
    private java.util.List<SchemaFieldBlame> schemaFieldBlameList;

    public GetSchemaBlameResult() {
    }

    public GetSchemaBlameResult(SemanticVersionStruct latestVersion, SemanticVersionStruct version, java.util.List<SemanticVersionStruct> semanticVersionList, java.util.List<SchemaFieldBlame> schemaFieldBlameList) {
        this.latestVersion = latestVersion;
        this.version = version;
        this.semanticVersionList = semanticVersionList;
        this.schemaFieldBlameList = schemaFieldBlameList;
    }

    /**
     * Latest and current semantic version
     */
    public SemanticVersionStruct getLatestVersion() {
        return latestVersion;
    }
    /**
     * Latest and current semantic version
     */
    public void setLatestVersion(SemanticVersionStruct latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * Selected semantic version
     */
    public SemanticVersionStruct getVersion() {
        return version;
    }
    /**
     * Selected semantic version
     */
    public void setVersion(SemanticVersionStruct version) {
        this.version = version;
    }

    /**
     * All semantic versions. Absent when there are no versions.
     */
    public java.util.List<SemanticVersionStruct> getSemanticVersionList() {
        return semanticVersionList;
    }
    /**
     * All semantic versions. Absent when there are no versions.
     */
    public void setSemanticVersionList(java.util.List<SemanticVersionStruct> semanticVersionList) {
        this.semanticVersionList = semanticVersionList;
    }

    /**
     * List of schema blame. Absent when there are no fields to return history for.
     */
    public java.util.List<SchemaFieldBlame> getSchemaFieldBlameList() {
        return schemaFieldBlameList;
    }
    /**
     * List of schema blame. Absent when there are no fields to return history for.
     */
    public void setSchemaFieldBlameList(java.util.List<SchemaFieldBlame> schemaFieldBlameList) {
        this.schemaFieldBlameList = schemaFieldBlameList;
    }



    public static GetSchemaBlameResult.Builder builder() {
        return new GetSchemaBlameResult.Builder();
    }

    public static class Builder {

        private SemanticVersionStruct latestVersion;
        private SemanticVersionStruct version;
        private java.util.List<SemanticVersionStruct> semanticVersionList;
        private java.util.List<SchemaFieldBlame> schemaFieldBlameList;

        public Builder() {
        }

        /**
         * Latest and current semantic version
         */
        public Builder setLatestVersion(SemanticVersionStruct latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * Selected semantic version
         */
        public Builder setVersion(SemanticVersionStruct version) {
            this.version = version;
            return this;
        }

        /**
         * All semantic versions. Absent when there are no versions.
         */
        public Builder setSemanticVersionList(java.util.List<SemanticVersionStruct> semanticVersionList) {
            this.semanticVersionList = semanticVersionList;
            return this;
        }

        /**
         * List of schema blame. Absent when there are no fields to return history for.
         */
        public Builder setSchemaFieldBlameList(java.util.List<SchemaFieldBlame> schemaFieldBlameList) {
            this.schemaFieldBlameList = schemaFieldBlameList;
            return this;
        }


        public GetSchemaBlameResult build() {
            return new GetSchemaBlameResult(latestVersion, version, semanticVersionList, schemaFieldBlameList);
        }

    }
}
