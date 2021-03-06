package com.example.user.twitter;

import io.realm.RealmObject;

public class User extends RealmObject{
    private String name;
    private String screen_name;
    private String profile_image_url;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }


  /*  private Integer id;
    private String id_str;
    private String name;
    private String location;
    private String description;
    private Object url;
//    private Boolean _protected;
    private Integer followers_count;
    private Integer friends_count;
    private Integer listed_count;
    private String created_at;
    private Integer favourites_count;
    private Object utc_offset;
    private Object time_zone;
//    private Boolean geo_enabled;
//    private Boolean verified;
    private Integer statuses_count;
    private String lang;
//    private Boolean contributors_enabled;
//    private Boolean is_translator;
//    private Boolean is_translation_enabled;
    private String profile_background_color;
    private Object profile_background_image_url;
    private Object profile_background_image_url_https;
  //  private Boolean profile_background_tile;
    private String profile_image_url;
    private String profile_image_url_https;
    private String profile_link_color;
    private String profile_sidebar_border_color;
    private String profile_sidebar_fill_color;
    private String profile_text_color;
   // private Boolean profile_use_background_image;
 //   private Booleacn has_extended_profile;
  //  private Boolean default_profile;
  //  private Boolean default_profile_image;
   // private Boolean following;
//    private Boolean follow_request_sent;
//    private Boolean notifications;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     *//*
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     *//*
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * 
     * @return
     *     The id_str
     *//*
    public String getId_str() {
        return id_str;
    }

    /**
     * 
     * @param id_str
     *     The id_str
     *//*
    public void setId_str(String id_str) {
        this.id_str = id_str;
    }

    /**
     * 
     * @return
     *     The name
     *//*
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     *//*
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The screen_name
     *//*
    public String getScreen_name() {
        return screen_name;
    }

    /**
     * 
     * @param screen_name
     *     The screen_name
     *//*
    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    /**
     * 
     * @return
     *     The location
     *//*
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     *//*
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The description
     *//*
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     *//*
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The url
     *//*
    public Object getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     *//*
    public void setUrl(Object url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The entities
     *//*
    public Entities getEntities() {
        return entities;
    }

    /**
     * 
     * @param entities
     *     The entities
     *//*
    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    /**
     * 
     * @return
     *     The _protected
     *//*
    public Boolean getProtected() {
        return _protected;
    }

    /**
     * 
     * @param _protected
     *     The protected
     *//*
    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    /**
     * 
     * @return
     *     The followers_count
     *//*
    public Integer getFollowers_count() {
        return followers_count;
    }

    /**
     * 
     * @param followers_count
     *     The followers_count
     *//*
    public void setFollowers_count(Integer followers_count) {
        this.followers_count = followers_count;
    }

    /**
     * 
     * @return
     *     The friends_count
     *//*
    public Integer getFriends_count() {
        return friends_count;
    }

    /**
     * 
     * @param friends_count
     *     The friends_count
     *//*
    public void setFriends_count(Integer friends_count) {
        this.friends_count = friends_count;
    }

    /**
     * 
     * @return
     *     The listed_count
     *//*
    public Integer getListed_count() {
        return listed_count;
    }

    /**
     * 
     * @param listed_count
     *     The listed_count
     *//*
    public void setListed_count(Integer listed_count) {
        this.listed_count = listed_count;
    }

    /**
     * 
     * @return
     *     The created_at
     *//*
    public String getCreated_at() {
        return created_at;
    }

    /**
     * 
     * @param created_at
     *     The created_at
     *//*
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    /**
     * 
     * @return
     *     The favourites_count
     *//*
    public Integer getFavourites_count() {
        return favourites_count;
    }

    /**
     * 
     * @param favourites_count
     *     The favourites_count
     *//*
    public void setFavourites_count(Integer favourites_count) {
        this.favourites_count = favourites_count;
    }

    /**
     * 
     * @return
     *     The utc_offset
     *//*
    public Object getUtc_offset() {
        return utc_offset;
    }

    /**
     * 
     * @param utc_offset
     *     The utc_offset
     *//*
    public void setUtc_offset(Object utc_offset) {
        this.utc_offset = utc_offset;
    }

    /**
     * 
     * @return
     *     The time_zone
     *//*
    public Object getTime_zone() {
        return time_zone;
    }

    /**
     * 
     * @param time_zone
     *     The time_zone
     *//*
    public void setTime_zone(Object time_zone) {
        this.time_zone = time_zone;
    }

    /**
     * 
     * @return
     *     The geo_enabled
     *//*
    public Boolean getGeo_enabled() {
        return geo_enabled;
    }

    /**
     * 
     * @param geo_enabled
     *     The geo_enabled
     *//*
    public void setGeo_enabled(Boolean geo_enabled) {
        this.geo_enabled = geo_enabled;
    }

    /**
     * 
     * @return
     *     The verified
     *//*
    public Boolean getVerified() {
        return verified;
    }

    /**
     * 
     * @param verified
     *     The verified
     *//*
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * 
     * @return
     *     The statuses_count
     *//*
    public Integer getStatuses_count() {
        return statuses_count;
    }

    /**
     * 
     * @param statuses_count
     *     The statuses_count
     *//*
    public void setStatuses_count(Integer statuses_count) {
        this.statuses_count = statuses_count;
    }

    /**
     * 
     * @return
     *     The lang
     *//*
    public String getLang() {
        return lang;
    }

    /**
     * 
     * @param lang
     *     The lang
     *//*
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * 
     * @return
     *     The contributors_enabled
     *//*
    public Boolean getContributors_enabled() {
        return contributors_enabled;
    }

    /**
     * 
     * @param contributors_enabled
     *     The contributors_enabled
     *//*
    public void setContributors_enabled(Boolean contributors_enabled) {
        this.contributors_enabled = contributors_enabled;
    }

    /**
     * 
     * @return
     *     The is_translator
     *//*
    public Boolean getIs_translator() {
        return is_translator;
    }

    /**
     * 
     * @param is_translator
     *     The is_translator
     *//*
    public void setIs_translator(Boolean is_translator) {
        this.is_translator = is_translator;
    }

    /**
     * 
     * @return
     *     The is_translation_enabled
     *//*
    public Boolean getIs_translation_enabled() {
        return is_translation_enabled;
    }

    /**
     * 
     * @param is_translation_enabled
     *     The is_translation_enabled
     *//*
    public void setIs_translation_enabled(Boolean is_translation_enabled) {
        this.is_translation_enabled = is_translation_enabled;
    }

    /**
     * 
     * @return
     *     The profile_background_color
     *//*
    public String getProfile_background_color() {
        return profile_background_color;
    }

    /**
     * 
     * @param profile_background_color
     *     The profile_background_color
     *//*
    public void setProfile_background_color(String profile_background_color) {
        this.profile_background_color = profile_background_color;
    }

    /**
     * 
     * @return
     *     The profile_background_image_url
     *//*
    public Object getProfile_background_image_url() {
        return profile_background_image_url;
    }

    /**
     * 
     * @param profile_background_image_url
     *     The profile_background_image_url
     *//*
    public void setProfile_background_image_url(Object profile_background_image_url) {
        this.profile_background_image_url = profile_background_image_url;
    }

    /**
     * 
     * @return
     *     The profile_background_image_url_https
     *//*
    public Object getProfile_background_image_url_https() {
        return profile_background_image_url_https;
    }

    /**
     * 
     * @param profile_background_image_url_https
     *     The profile_background_image_url_https
     *//*
    public void setProfile_background_image_url_https(Object profile_background_image_url_https) {
        this.profile_background_image_url_https = profile_background_image_url_https;
    }

    /**
     * 
     * @return
     *     The profile_background_tile
     *//*
    public Boolean getProfile_background_tile() {
        return profile_background_tile;
    }

    /**
     * 
     * @param profile_background_tile
     *     The profile_background_tile
     *//*
    public void setProfile_background_tile(Boolean profile_background_tile) {
        this.profile_background_tile = profile_background_tile;
    }

    /**
     * 
     * @return
     *     The profile_image_url
     */
    public String getProfile_image_url() {
        return profile_image_url;
    }

    /**
     * 
     * @param profile_image_url
     *     The profile_image_url
     */
    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    /**
     * 
     * @return
     *     The profile_image_url_https
     *//*
    public String getProfile_image_url_https() {
        return profile_image_url_https;
    }

    /**
     * 
     * @param profile_image_url_https
     *     The profile_image_url_https
     *//*
    public void setProfile_image_url_https(String profile_image_url_https) {
        this.profile_image_url_https = profile_image_url_https;
    }

    /**
     * 
     * @return
     *     The profile_link_color
     *//*
    public String getProfile_link_color() {
        return profile_link_color;
    }

    /**
     * 
     * @param profile_link_color
     *     The profile_link_color
     *//*
    public void setProfile_link_color(String profile_link_color) {
        this.profile_link_color = profile_link_color;
    }

    /**
     * 
     * @return
     *     The profile_sidebar_border_color
     *//*
    public String getProfile_sidebar_border_color() {
        return profile_sidebar_border_color;
    }

    /**
     * 
     * @param profile_sidebar_border_color
     *     The profile_sidebar_border_color
     *//*
    public void setProfile_sidebar_border_color(String profile_sidebar_border_color) {
        this.profile_sidebar_border_color = profile_sidebar_border_color;
    }

    /**
     * 
     * @return
     *     The profile_sidebar_fill_color
     *//*
    public String getProfile_sidebar_fill_color() {
        return profile_sidebar_fill_color;
    }

    /**
     * 
     * @param profile_sidebar_fill_color
     *     The profile_sidebar_fill_color
     *//*
    public void setProfile_sidebar_fill_color(String profile_sidebar_fill_color) {
        this.profile_sidebar_fill_color = profile_sidebar_fill_color;
    }

    /**
     * 
     * @return
     *     The profile_text_color
     *//*
    public String getProfile_text_color() {
        return profile_text_color;
    }

    /**
     * 
     * @param profile_text_color
     *     The profile_text_color
     *//*
    public void setProfile_text_color(String profile_text_color) {
        this.profile_text_color = profile_text_color;
    }

    /**
     * 
     * @return
     *     The profile_use_background_image
     *//*
    public Boolean getProfile_use_background_image() {
        return profile_use_background_image;
    }

    /**
     * 
     * @param profile_use_background_image
     *     The profile_use_background_image
     *//*
    public void setProfile_use_background_image(Boolean profile_use_background_image) {
        this.profile_use_background_image = profile_use_background_image;
    }

    /**
     * 
     * @return
     *     The has_extended_profile
     *//*
    public Boolean getHas_extended_profile() {
        return has_extended_profile;
    }

    /**
     * 
     * @param has_extended_profile
     *     The has_extended_profile
     *//*
    public void setHas_extended_profile(Boolean has_extended_profile) {
        this.has_extended_profile = has_extended_profile;
    }

    /**
     * 
     * @return
     *     The default_profile
     *//*
    public Boolean getDefault_profile() {
        return default_profile;
    }

    /**
     * 
     * @param default_profile
     *     The default_profile
     *//*
    public void setDefault_profile(Boolean default_profile) {
        this.default_profile = default_profile;
    }

    /**
     * 
     * @return
     *     The default_profile_image
     *//*
    public Boolean getDefault_profile_image() {
        return default_profile_image;
    }

    /**
     * 
     * @param default_profile_image
     *     The default_profile_image
     *//*
    public void setDefault_profile_image(Boolean default_profile_image) {
        this.default_profile_image = default_profile_image;
    }

    /**
     * 
     * @return
     *     The following
     *//*
    public Boolean getFollowing() {
        return following;
    }

    /**
     * 
     * @param following
     *     The following
     *//*
    public void setFollowing(Boolean following) {
        this.following = following;
    }

    /**
     * 
     * @return
     *     The follow_request_sent
     *//*
    public Boolean getFollow_request_sent() {
        return follow_request_sent;
    }

    /**
     * 
     * @param follow_request_sent
     *     The follow_request_sent
     *//*
    public void setFollow_request_sent(Boolean follow_request_sent) {
        this.follow_request_sent = follow_request_sent;
    }

    /**
     * 
     * @return
     *     The notifications
     *//*
    public Boolean getNotifications() {
        return notifications;
    }

    /**
     * 
     * @param notifications
     *     The notifications
     *//*
    public void setNotifications(Boolean notifications) {
        this.notifications = notifications;
    }*//*

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
*/

}
