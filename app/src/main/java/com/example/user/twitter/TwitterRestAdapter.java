package com.example.user.twitter;


import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;


public class TwitterRestAdapter {
    public Retrofit retrofit;
    public final String TWITTER_URL="https://api.twitter.com/";//cvb
    public TwitterAPI twitterAPI;
    public String baseUrlForReq="https://api.twitter.com/oauth/request_token";

    String oauth_nonce="9cfc6e3150b3eb92efbfb0ead2f525c0",
           // oauth_callback="https://Fieldbuzz_twitter_offline.com",
            oauth_callback="https%3A%2F%2FFieldbuzz%5Ftwitter%5Foffline%2Ecom",
            oauth_signature_method="HMAC-SHA1",
            oauth_timestamp=String.valueOf(System.currentTimeMillis()/1000),
            oauth_consumer_key="oT6QTqb6y9lcrF8MEJmnEyvMr",
            oauth_signature="j9UmlJMPFMCCyYa4yf4dvPqSKX8%3D",
            oauth_version="1.0";

    public TwitterRestAdapter(){
        OkHttpClient okHttpClient=new OkHttpClient();
        HttpLoggingInterceptor httpLoggingInterceptor=new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        okHttpClient.interceptors().add(httpLoggingInterceptor);

        retrofit=new Retrofit.Builder().baseUrl(TWITTER_URL).client(okHttpClient).addConverterFactory(GsonConverterFactory.create()).build();
        twitterAPI=retrofit.create(TwitterAPI.class);
    }
}
