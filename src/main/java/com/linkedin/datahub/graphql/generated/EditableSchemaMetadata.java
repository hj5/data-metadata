package com.linkedin.datahub.graphql.generated;


/**
 * Information about schema metadata that is editable via the UI
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class EditableSchemaMetadata implements java.io.Serializable {

    @javax.annotation.Nonnull
    private java.util.List<EditableSchemaFieldInfo> editableSchemaFieldInfo;

    public EditableSchemaMetadata() {
    }

    public EditableSchemaMetadata(java.util.List<EditableSchemaFieldInfo> editableSchemaFieldInfo) {
        this.editableSchemaFieldInfo = editableSchemaFieldInfo;
    }

    /**
     * Editable schema field metadata
     */
    public java.util.List<EditableSchemaFieldInfo> getEditableSchemaFieldInfo() {
        return editableSchemaFieldInfo;
    }
    /**
     * Editable schema field metadata
     */
    public void setEditableSchemaFieldInfo(java.util.List<EditableSchemaFieldInfo> editableSchemaFieldInfo) {
        this.editableSchemaFieldInfo = editableSchemaFieldInfo;
    }



    public static EditableSchemaMetadata.Builder builder() {
        return new EditableSchemaMetadata.Builder();
    }

    public static class Builder {

        private java.util.List<EditableSchemaFieldInfo> editableSchemaFieldInfo;

        public Builder() {
        }

        /**
         * Editable schema field metadata
         */
        public Builder setEditableSchemaFieldInfo(java.util.List<EditableSchemaFieldInfo> editableSchemaFieldInfo) {
            this.editableSchemaFieldInfo = editableSchemaFieldInfo;
            return this;
        }


        public EditableSchemaMetadata build() {
            return new EditableSchemaMetadata(editableSchemaFieldInfo);
        }

    }
}
