package com.example.user.twitter;

import io.realm.RealmObject;

public class Media extends RealmObject{
    private String media_url;

    public String getMedia_url() {
        return media_url;
    }

    public void setMedia_url(String media_url) {
        this.media_url = media_url;
    }

}
