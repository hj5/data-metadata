package com.linkedin.datahub.graphql.generated;


/**
 * Additional read write properties about a user
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class CorpUserEditableProperties implements java.io.Serializable {

    private String displayName;
    private String title;
    private String aboutMe;
    @javax.annotation.Nonnull
    private java.util.List<String> teams;
    @javax.annotation.Nonnull
    private java.util.List<String> skills;
    private String pictureLink;
    private String slack;
    private String phone;
    private String email;

    public CorpUserEditableProperties() {
    }

    public CorpUserEditableProperties(String displayName, String title, String aboutMe, java.util.List<String> teams, java.util.List<String> skills, String pictureLink, String slack, String phone, String email) {
        this.displayName = displayName;
        this.title = title;
        this.aboutMe = aboutMe;
        this.teams = teams;
        this.skills = skills;
        this.pictureLink = pictureLink;
        this.slack = slack;
        this.phone = phone;
        this.email = email;
    }

    /**
     * Display name to show on DataHub
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * Display name to show on DataHub
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Title to show on DataHub
     */
    public String getTitle() {
        return title;
    }
    /**
     * Title to show on DataHub
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * About me section of the user
     */
    public String getAboutMe() {
        return aboutMe;
    }
    /**
     * About me section of the user
     */
    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    /**
     * Teams that the user belongs to
     */
    public java.util.List<String> getTeams() {
        return teams;
    }
    /**
     * Teams that the user belongs to
     */
    public void setTeams(java.util.List<String> teams) {
        this.teams = teams;
    }

    /**
     * Skills that the user possesses
     */
    public java.util.List<String> getSkills() {
        return skills;
    }
    /**
     * Skills that the user possesses
     */
    public void setSkills(java.util.List<String> skills) {
        this.skills = skills;
    }

    /**
     * A URL which points to a picture which user wants to set as a profile photo
     */
    public String getPictureLink() {
        return pictureLink;
    }
    /**
     * A URL which points to a picture which user wants to set as a profile photo
     */
    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }

    /**
     * The slack handle of the user
     */
    public String getSlack() {
        return slack;
    }
    /**
     * The slack handle of the user
     */
    public void setSlack(String slack) {
        this.slack = slack;
    }

    /**
     * Phone number for the user
     */
    public String getPhone() {
        return phone;
    }
    /**
     * Phone number for the user
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Email address for the user
     */
    public String getEmail() {
        return email;
    }
    /**
     * Email address for the user
     */
    public void setEmail(String email) {
        this.email = email;
    }



    public static CorpUserEditableProperties.Builder builder() {
        return new CorpUserEditableProperties.Builder();
    }

    public static class Builder {

        private String displayName;
        private String title;
        private String aboutMe;
        private java.util.List<String> teams;
        private java.util.List<String> skills;
        private String pictureLink;
        private String slack;
        private String phone;
        private String email;

        public Builder() {
        }

        /**
         * Display name to show on DataHub
         */
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Title to show on DataHub
         */
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        /**
         * About me section of the user
         */
        public Builder setAboutMe(String aboutMe) {
            this.aboutMe = aboutMe;
            return this;
        }

        /**
         * Teams that the user belongs to
         */
        public Builder setTeams(java.util.List<String> teams) {
            this.teams = teams;
            return this;
        }

        /**
         * Skills that the user possesses
         */
        public Builder setSkills(java.util.List<String> skills) {
            this.skills = skills;
            return this;
        }

        /**
         * A URL which points to a picture which user wants to set as a profile photo
         */
        public Builder setPictureLink(String pictureLink) {
            this.pictureLink = pictureLink;
            return this;
        }

        /**
         * The slack handle of the user
         */
        public Builder setSlack(String slack) {
            this.slack = slack;
            return this;
        }

        /**
         * Phone number for the user
         */
        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * Email address for the user
         */
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }


        public CorpUserEditableProperties build() {
            return new CorpUserEditableProperties(displayName, title, aboutMe, teams, skills, pictureLink, slack, phone, email);
        }

    }
}
