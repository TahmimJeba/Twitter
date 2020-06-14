
package com.example.user.twitter;

import io.realm.RealmList;
import io.realm.RealmObject;

public class Description extends RealmObject{

    private RealmList<RealmObject> urls = new RealmList<>();
  /*  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The urls
     */
    public RealmList<RealmObject> getUrls() {
        return urls;
    }

    /**
     * 
     * @param urls
     *     The urls
     *//*
    public void setUrls(RealmList<RealmObject> urls) {
        this.urls = urls;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }*/

}
