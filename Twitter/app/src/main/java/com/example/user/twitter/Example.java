package com.example.user.twitter;

public class Example {

    private String created_at;
    //  private Integer id;
    private String id_str;
    private String text;
    private User user;
    private int retweet_count;
    private int favorite_count;
    private Entities_ entities;


/*  //  private Boolean truncated;
    private String source;
    private Object in_reply_to_status_id;
    private Object in_reply_to_status_id_str;
    private Object in_reply_to_user_id;
    private Object in_reply_to_user_id_str;
    private Object in_reply_to_screen_name;
    private Object geo;
    private Object coordinates;
    private Object place;
    private Object contributors;
//    private Boolean is_quote_status;
    private Integer retweet_count;
    private Integer favorite_count;
//    private Boolean favorited;
  //  private Boolean retweeted;
    private String lang;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();*/

    /**
     *
     * @return
     *     The created_at
     */
    public String getCreated_at() {
        return created_at;
    }

    /**
     *
     * @param created_at
     *     The created_at
     */
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

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
     */
    public String getId_str() {
        return id_str;
    }

    /**
     *
     * @param id_str
     *     The id_str
     */
    public void setId_str(String id_str) {
        this.id_str = id_str;
    }

    /**
     *
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * @return
     *     The truncated
     *//*
    public Boolean getTruncated() {
        return truncated;
    }

    /**
     *
     * @param truncated
     *     The truncated
     *//*
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     *
     * @return
     *     The source
     *//*
    public String getSource() {
        return source;
    }

    /**
     *
     * @param source
     *     The source
     *//*
    public void setSource(String source) {
        this.source = source;
    }

    /**
     *
     * @return
     *     The in_reply_to_status_id
     *//*
    public Object getIn_reply_to_status_id() {
        return in_reply_to_status_id;
    }

    /**
     *
     * @param in_reply_to_status_id
     *     The in_reply_to_status_id
     *//*
    public void setIn_reply_to_status_id(Object in_reply_to_status_id) {
        this.in_reply_to_status_id = in_reply_to_status_id;
    }

    /**
     *
     * @return
     *     The in_reply_to_status_id_str
     *//*
    public Object getIn_reply_to_status_id_str() {
        return in_reply_to_status_id_str;
    }

    /**
     *
     * @param in_reply_to_status_id_str
     *     The in_reply_to_status_id_str
     *//*
    public void setIn_reply_to_status_id_str(Object in_reply_to_status_id_str) {
        this.in_reply_to_status_id_str = in_reply_to_status_id_str;
    }

    /**
     *
     * @return
     *     The in_reply_to_user_id
     *//*
    public Object getIn_reply_to_user_id() {
        return in_reply_to_user_id;
    }

    /**
     *
     * @param in_reply_to_user_id
     *     The in_reply_to_user_id
     *//*
    public void setIn_reply_to_user_id(Object in_reply_to_user_id) {
        this.in_reply_to_user_id = in_reply_to_user_id;
    }

    /**
     *
     * @return
     *     The in_reply_to_user_id_str
     *//*
    public Object getIn_reply_to_user_id_str() {
        return in_reply_to_user_id_str;
    }

    /**
     *
     * @param in_reply_to_user_id_str
     *     The in_reply_to_user_id_str
     *//*
    public void setIn_reply_to_user_id_str(Object in_reply_to_user_id_str) {
        this.in_reply_to_user_id_str = in_reply_to_user_id_str;
    }

    /**
     *
     * @return
     *     The in_reply_to_screen_name
     *//*
    public Object getIn_reply_to_screen_name() {
        return in_reply_to_screen_name;
    }

    /**
     *
     * @param in_reply_to_screen_name
     *     The in_reply_to_screen_name
     *//*
    public void setIn_reply_to_screen_name(Object in_reply_to_screen_name) {
        this.in_reply_to_screen_name = in_reply_to_screen_name;
    }

    /**
     *
     * @return
     *     The user
     */
    public User getUser() {
        return user;
    }

    /**
     *
     * @param user
     *     The user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     *
     * @return
     *     The geo
     *//*
    public Object getGeo() {
        return geo;
    }

    /**
     *
     * @param geo
     *     The geo
     *//*
    public void setGeo(Object geo) {
        this.geo = geo;
    }

    /**
     *
     * @return
     *     The coordinates
     *//*
    public Object getCoordinates() {
        return coordinates;
    }

    /**
     *
     * @param coordinates
     *     The coordinates
     *//*
    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    /**
     *
     * @return
     *     The place
     *//*
    public Object getPlace() {
        return place;
    }

    /**
     *
     * @param place
     *     The place
     *//*
    public void setPlace(Object place) {
        this.place = place;
    }

    /**
     *
     * @return
     *     The contributors
     *//*
    public Object getContributors() {
        return contributors;
    }

    /**
     *
     * @param contributors
     *     The contributors
     *//*
    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    /**
     *
     * @return
     *     The is_quote_status
     *//*
    public Boolean getIs_quote_status() {
        return is_quote_status;
    }

    /**
     *
     * @param is_quote_status
     *     The is_quote_status
     *//*
    public void setIs_quote_status(Boolean is_quote_status) {
        this.is_quote_status = is_quote_status;
    }

    /**
     *
     * @return
     *     The retweet_count
     */
    public int getRetweet_count() {
        return retweet_count;
    }

    /**
     *
     * @param retweet_count
     *     The retweet_count
     */
    public void setRetweet_count(int retweet_count) {
        this.retweet_count = retweet_count;
    }

    /**
     *
     * @return
     *     The favorite_count
     */
    public int getFavorite_count() {
        return favorite_count;
    }

    /**
     *
     * @param favorite_count
     *     The favorite_count
     */
    public void setFavorite_count(int favorite_count) {
        this.favorite_count = favorite_count;
    }

    /**
     *
     * @return
     *     The entities
     */
    public Entities_ getEntities() {
        return entities;
    }

    /**
     *
     * @param entities
     *     The entities
     */
    public void setEntities(Entities_ entities) {
        this.entities = entities;
    }

    /**
     *
     * @return
     *     The favorited
     *//*
    public Boolean getFavorited() {
        return favorited;
    }

    /**
     * 
     * @param favorited
     *     The favorited
     *//*
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    /**
     * 
     * @return
     *     The retweeted
     *//*
    public Boolean getRetweeted() {
        return retweeted;
    }

    /**
     * 
     * @param retweeted
     *     The retweeted
     *//*
    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
*/
}
