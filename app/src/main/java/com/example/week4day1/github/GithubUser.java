
        package com.example.week4day1.github;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GithubUser implements Parcelable
{

    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("node_id")
    @Expose
    private String nodeId;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("gravatar_id")
    @Expose
    private String gravatarId;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("followers_url")
    @Expose
    private String followersUrl;
    @SerializedName("following_url")
    @Expose
    private String followingUrl;
    @SerializedName("gists_url")
    @Expose
    private String gistsUrl;
    @SerializedName("starred_url")
    @Expose
    private String starredUrl;
    @SerializedName("subscriptions_url")
    @Expose
    private String subscriptionsUrl;
    @SerializedName("organizations_url")
    @Expose
    private String organizationsUrl;
    @SerializedName("repos_url")
    @Expose
    private String reposUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("received_events_url")
    @Expose
    private String receivedEventsUrl;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("site_admin")
    @Expose
    private Boolean siteAdmin;
    @SerializedName("name")
    @Expose
    private Object name;
    @SerializedName("company")
    @Expose
    private Object company;
    @SerializedName("blog")
    @Expose
    private String blog;
    @SerializedName("location")
    @Expose
    private Object location;
    @SerializedName("email")
    @Expose
    private Object email;
    @SerializedName("hireable")
    @Expose
    private Object hireable;
    @SerializedName("bio")
    @Expose
    private Object bio;
    @SerializedName("public_repos")
    @Expose
    private Integer publicRepos;
    @SerializedName("public_gists")
    @Expose
    private Integer publicGists;
    @SerializedName("followers")
    @Expose
    private Integer followers;
    @SerializedName("following")
    @Expose
    private Integer following;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    public final static Parcelable.Creator<GithubUser> CREATOR = new Creator<GithubUser>() {


        @SuppressWarnings({
                "unchecked"
        })
        public GithubUser createFromParcel(Parcel in) {
            return new GithubUser(in);
        }

        public GithubUser[] newArray(int size) {
            return (new GithubUser[size]);
        }

    }
            ;

    protected GithubUser(Parcel in) {
        this.login = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.nodeId = ((String) in.readValue((String.class.getClassLoader())));
        this.avatarUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.gravatarId = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.htmlUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.followersUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.followingUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.gistsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.starredUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.subscriptionsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.organizationsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.reposUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.eventsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.receivedEventsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.siteAdmin = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.name = ((Object) in.readValue((Object.class.getClassLoader())));
        this.company = ((Object) in.readValue((Object.class.getClassLoader())));
        this.blog = ((String) in.readValue((String.class.getClassLoader())));
        this.location = ((Object) in.readValue((Object.class.getClassLoader())));
        this.email = ((Object) in.readValue((Object.class.getClassLoader())));
        this.hireable = ((Object) in.readValue((Object.class.getClassLoader())));
        this.bio = ((Object) in.readValue((Object.class.getClassLoader())));
        this.publicRepos = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.publicGists = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.followers = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.following = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.createdAt = ((String) in.readValue((String.class.getClassLoader())));
        this.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public GithubUser() {
    }

    /**
     *
     * @param eventsUrl
     * @param location
     * @param publicRepos
     * @param type
     * @param blog
     * @param gravatarId
     * @param subscriptionsUrl
     * @param id
     * @param following
     * @param followers
     * @param htmlUrl
     * @param nodeId
     * @param createdAt
     * @param avatarUrl
     * @param name
     * @param followingUrl
     * @param login
     * @param starredUrl
     * @param siteAdmin
     * @param gistsUrl
     * @param url
     * @param updatedAt
     * @param followersUrl
     * @param reposUrl
     * @param hireable
     * @param bio
     * @param publicGists
     * @param email
     * @param receivedEventsUrl
     * @param company
     * @param organizationsUrl
     */
    public GithubUser(String login, Integer id, String nodeId, String avatarUrl, String gravatarId, String url, String htmlUrl, String followersUrl, String followingUrl, String gistsUrl, String starredUrl, String subscriptionsUrl, String organizationsUrl, String reposUrl, String eventsUrl, String receivedEventsUrl, String type, Boolean siteAdmin, Object name, Object company, String blog, Object location, Object email, Object hireable, Object bio, Integer publicRepos, Integer publicGists, Integer followers, Integer following, String createdAt, String updatedAt) {
        super();
        this.login = login;
        this.id = id;
        this.nodeId = nodeId;
        this.avatarUrl = avatarUrl;
        this.gravatarId = gravatarId;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.followersUrl = followersUrl;
        this.followingUrl = followingUrl;
        this.gistsUrl = gistsUrl;
        this.starredUrl = starredUrl;
        this.subscriptionsUrl = subscriptionsUrl;
        this.organizationsUrl = organizationsUrl;
        this.reposUrl = reposUrl;
        this.eventsUrl = eventsUrl;
        this.receivedEventsUrl = receivedEventsUrl;
        this.type = type;
        this.siteAdmin = siteAdmin;
        this.name = name;
        this.company = company;
        this.blog = blog;
        this.location = location;
        this.email = email;
        this.hireable = hireable;
        this.bio = bio;
        this.publicRepos = publicRepos;
        this.publicGists = publicGists;
        this.followers = followers;
        this.following = following;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public GithubUser withLogin(String login) {
        this.login = login;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GithubUser withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public GithubUser withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public GithubUser withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    public String getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    public GithubUser withGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public GithubUser withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public GithubUser withHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public GithubUser withFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
        return this;
    }

    public String getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public GithubUser withFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
        return this;
    }

    public String getGistsUrl() {
        return gistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public GithubUser withGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
        return this;
    }

    public String getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public GithubUser withStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
        return this;
    }

    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public GithubUser withSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
        return this;
    }

    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public GithubUser withOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
        return this;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public GithubUser withReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
        return this;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public GithubUser withEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public GithubUser withReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GithubUser withType(String type) {
        this.type = type;
        return this;
    }

    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public GithubUser withSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
        return this;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public GithubUser withName(Object name) {
        this.name = name;
        return this;
    }

    public Object getCompany() {
        return company;
    }

    public void setCompany(Object company) {
        this.company = company;
    }

    public GithubUser withCompany(Object company) {
        this.company = company;
        return this;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public GithubUser withBlog(String blog) {
        this.blog = blog;
        return this;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public GithubUser withLocation(Object location) {
        this.location = location;
        return this;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public GithubUser withEmail(Object email) {
        this.email = email;
        return this;
    }

    public Object getHireable() {
        return hireable;
    }

    public void setHireable(Object hireable) {
        this.hireable = hireable;
    }

    public GithubUser withHireable(Object hireable) {
        this.hireable = hireable;
        return this;
    }

    public Object getBio() {
        return bio;
    }

    public void setBio(Object bio) {
        this.bio = bio;
    }

    public GithubUser withBio(Object bio) {
        this.bio = bio;
        return this;
    }

    public Integer getPublicRepos() {
        return publicRepos;
    }

    public void setPublicRepos(Integer publicRepos) {
        this.publicRepos = publicRepos;
    }

    public GithubUser withPublicRepos(Integer publicRepos) {
        this.publicRepos = publicRepos;
        return this;
    }

    public Integer getPublicGists() {
        return publicGists;
    }

    public void setPublicGists(Integer publicGists) {
        this.publicGists = publicGists;
    }

    public GithubUser withPublicGists(Integer publicGists) {
        this.publicGists = publicGists;
        return this;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public GithubUser withFollowers(Integer followers) {
        this.followers = followers;
        return this;
    }

    public Integer getFollowing() {
        return following;
    }

    public void setFollowing(Integer following) {
        this.following = following;
    }

    public GithubUser withFollowing(Integer following) {
        this.following = following;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public GithubUser withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public GithubUser withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(login);
        dest.writeValue(id);
        dest.writeValue(nodeId);
        dest.writeValue(avatarUrl);
        dest.writeValue(gravatarId);
        dest.writeValue(url);
        dest.writeValue(htmlUrl);
        dest.writeValue(followersUrl);
        dest.writeValue(followingUrl);
        dest.writeValue(gistsUrl);
        dest.writeValue(starredUrl);
        dest.writeValue(subscriptionsUrl);
        dest.writeValue(organizationsUrl);
        dest.writeValue(reposUrl);
        dest.writeValue(eventsUrl);
        dest.writeValue(receivedEventsUrl);
        dest.writeValue(type);
        dest.writeValue(siteAdmin);
        dest.writeValue(name);
        dest.writeValue(company);
        dest.writeValue(blog);
        dest.writeValue(location);
        dest.writeValue(email);
        dest.writeValue(hireable);
        dest.writeValue(bio);
        dest.writeValue(publicRepos);
        dest.writeValue(publicGists);
        dest.writeValue(followers);
        dest.writeValue(following);
        dest.writeValue(createdAt);
        dest.writeValue(updatedAt);
    }

    public int describeContents() {
        return 0;
    }

}