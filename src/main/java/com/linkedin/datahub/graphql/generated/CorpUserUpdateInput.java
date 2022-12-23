package com.linkedin.datahub.graphql.generated;


/**
 * Arguments provided to update a CorpUser Entity
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class CorpUserUpdateInput implements java.io.Serializable {

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

    public CorpUserUpdateInput() {
    }

    public CorpUserUpdateInput(String displayName, String title, String aboutMe, java.util.List<String> teams, java.util.List<String> skills, String pictureLink, String slack, String phone, String email) {
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

    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAboutMe() {
        return aboutMe;
    }
    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public java.util.List<String> getTeams() {
        return teams;
    }
    public void setTeams(java.util.List<String> teams) {
        this.teams = teams;
    }

    public java.util.List<String> getSkills() {
        return skills;
    }
    public void setSkills(java.util.List<String> skills) {
        this.skills = skills;
    }

    public String getPictureLink() {
        return pictureLink;
    }
    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }

    public String getSlack() {
        return slack;
    }
    public void setSlack(String slack) {
        this.slack = slack;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }



    public static CorpUserUpdateInput.Builder builder() {
        return new CorpUserUpdateInput.Builder();
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

        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAboutMe(String aboutMe) {
            this.aboutMe = aboutMe;
            return this;
        }

        public Builder setTeams(java.util.List<String> teams) {
            this.teams = teams;
            return this;
        }

        public Builder setSkills(java.util.List<String> skills) {
            this.skills = skills;
            return this;
        }

        public Builder setPictureLink(String pictureLink) {
            this.pictureLink = pictureLink;
            return this;
        }

        public Builder setSlack(String slack) {
            this.slack = slack;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }


        public CorpUserUpdateInput build() {
            return new CorpUserUpdateInput(displayName, title, aboutMe, teams, skills, pictureLink, slack, phone, email);
        }

    }
}
