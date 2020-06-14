package com.example.user.twitter;

import io.realm.RealmList;
import io.realm.RealmObject;

public class Entities_ extends RealmObject{

/*    private List<Object> hashtags = new ArrayList<Object>();
    private List<Object> symbols = new ArrayList<Object>();
    private List<Object> user_mentions = new ArrayList<Object>();
    private List<Object> urls = new ArrayList<Object>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
*/
    private RealmList<Media> media;

    public RealmList<Media> getMedia() {
        return media;
    }

    public void setMedia(RealmList<Media> media) {
        this.media = media;
    }

    public int mediaSize(){
        return media.size();
    }

    /**
     * 
     * @return
     *     The hashtags
     *//*
    public List<Object> getHashtags() {
        return hashtags;
    }

    /**
     * 
     * @param hashtags
     *     The hashtags
     *//*
    public void setHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
    }

    /**
     * 
     * @return
     *     The symbols
     *//*
    public List<Object> getSymbols() {
        return symbols;
    }

    /**
     * 
     * @param symbols
     *     The symbols
     *//*
    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    /**
     * 
     * @return
     *     The user_mentions
     *//*
    public List<Object> getUser_mentions() {
        return user_mentions;
    }

    /**
     * 
     * @param user_mentions
     *     The user_mentions
     *//*
    public void setUser_mentions(List<Object> user_mentions) {
        this.user_mentions = user_mentions;
    }

    /**
     * 
     * @return
     *     The urls
     *//*
    public List<Object> getUrls() {
        return urls;
    }

    /**
     * 
     * @param urls
     *     The urls
     *//*
    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
*/
}
