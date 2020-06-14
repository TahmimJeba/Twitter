package com.example.user.twitter;

import com.squareup.okhttp.ResponseBody;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.POST;
import retrofit.http.Query;

public interface TwitterAPI {
    @POST("/oauth/request_token")
    Call<ResponseBody> getAuthenticationToken(
            @Header("Authorization") String authorization
    );

    @GET("/oauth/access_token")
    Call<ResponseBody> getAccess(
            @Header("Authorization") String authorization,
            @Query("oauth_verifier")String oauth_verifier
    );

  /*  @POST("/oauth/access_token")
    Call<ResponseBody> getAuthenticationToken(
            @Header("Authorization") String authorization,
            @Query("x_auth_mode")String mode,
            @Query("x_auth_password")String password,
            @Query("x_auth_username")String username
    );*/

    @GET("/1.1/statuses/home_timeline.json")
    Call<List<Example>> getStatus(
            @Header("Authorization") String authorization
    );
}
