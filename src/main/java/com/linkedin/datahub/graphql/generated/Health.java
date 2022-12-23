package com.linkedin.datahub.graphql.generated;


/**
 * The resolved Health of an Asset
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class Health implements java.io.Serializable {

    @javax.annotation.Nonnull
    private HealthStatusType type;
    @javax.annotation.Nonnull
    private HealthStatus status;
    private String message;
    @javax.annotation.Nonnull
    private java.util.List<String> causes;

    public Health() {
    }

    public Health(HealthStatusType type, HealthStatus status, String message, java.util.List<String> causes) {
        this.type = type;
        this.status = status;
        this.message = message;
        this.causes = causes;
    }

    /**
     * An enum representing the type of health indicator
     */
    public HealthStatusType getType() {
        return type;
    }
    /**
     * An enum representing the type of health indicator
     */
    public void setType(HealthStatusType type) {
        this.type = type;
    }

    /**
     * An enum representing the resolved Health status of an Asset
     */
    public HealthStatus getStatus() {
        return status;
    }
    /**
     * An enum representing the resolved Health status of an Asset
     */
    public void setStatus(HealthStatus status) {
        this.status = status;
    }

    /**
     * An optional message describing the resolved health status
     */
    public String getMessage() {
        return message;
    }
    /**
     * An optional message describing the resolved health status
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * The causes responsible for the health status
     */
    public java.util.List<String> getCauses() {
        return causes;
    }
    /**
     * The causes responsible for the health status
     */
    public void setCauses(java.util.List<String> causes) {
        this.causes = causes;
    }



    public static Health.Builder builder() {
        return new Health.Builder();
    }

    public static class Builder {

        private HealthStatusType type;
        private HealthStatus status;
        private String message;
        private java.util.List<String> causes;

        public Builder() {
        }

        /**
         * An enum representing the type of health indicator
         */
        public Builder setType(HealthStatusType type) {
            this.type = type;
            return this;
        }

        /**
         * An enum representing the resolved Health status of an Asset
         */
        public Builder setStatus(HealthStatus status) {
            this.status = status;
            return this;
        }

        /**
         * An optional message describing the resolved health status
         */
        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        /**
         * The causes responsible for the health status
         */
        public Builder setCauses(java.util.List<String> causes) {
            this.causes = causes;
            return this;
        }


        public Health build() {
            return new Health(type, status, message, causes);
        }

    }
}
