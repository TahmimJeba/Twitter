package com.example.user.twitter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.squareup.okhttp.ResponseBody;

import java.io.IOException;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;


public class MainActivity extends AppCompatActivity {
    public TwitterRestAdapter twitterRestAdapter;
    String a=null, accessResponse=null,token=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void click(View view)
    {
        twitterRestAdapter = new TwitterRestAdapter();
        getToken();
    }

    public void getToken() {

        String authorizationHeader="OAuth oauth_consumer_key=\"oT6QTqb6y9lcrF8MEJmnEyvMr\", oauth_nonce=\"a64ab35138076dff72f993a4847abd81\", oauth_signature=\"RBdng%2FU%2FtHefYlStluL1ZBawFJ0%3D\", oauth_signature_method=\"HMAC-SHA1\", oauth_timestamp=\"1463816163\", oauth_token=\"696603460649803776-MwdOmsA9RMv7Ioquak33dYRJICTumfy\", oauth_version=\"1.0\"";

        Call<ResponseBody> tokenCall = twitterRestAdapter.twitterAPI.getAuthenticationToken(authorizationHeader);
        tokenCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    a=response.body().string();
                    Log.w("r", a);
                    String pair[] = a.split("&");
                    int c=0;
                    for (String i:pair){
                        String keyValue[]=i.split("=");
                        Log.w(keyValue[0],keyValue[1]);
                        if(c==0)token=keyValue[1];
                        c++;
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
                // getAuthenticated(token);
                directToWeb(token);
            }
            @Override
            public void onFailure(Throwable t) {
                Log.w("hi","bye");
            }
        });
    }

    public void directToWeb(String token){
        Uri webpage = Uri.parse("https://api.twitter.com/oauth/authorize?oauth_token="+token);
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void getAccessToken(View view) {
        EditText editText = (EditText) findViewById(R.id.enterPin);
        String pin = editText.getText().toString();
        String header = "OAuth oauth_consumer_key=\"oT6QTqb6y9lcrF8MEJmnEyvMr\", oauth_nonce=\"6adf6b20396fe4bf13c66a264266682c\", oauth_signature=\"u7EvaxsW%2F9fZPs1fMa4vpQ1Ofts%3D\", oauth_signature_method=\"HMAC-SHA1\", oauth_timestamp=\"1463816358\", oauth_token=\"" + token + ", oauth_version=\"1.0\"";
        Call<ResponseBody> accessTokenCall = twitterRestAdapter.twitterAPI.getAccess(header, pin);
        accessTokenCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    accessResponse = response.body().string();
                    // Log.w("new", a);
                    String pair[] = accessResponse.split("&");

                    int c = 0;
                    for (String i : pair) {
                        String keyValue[] = i.split("=");
                        Log.w(keyValue[0], keyValue[1]);
                        if (c == 0) token = keyValue[1];
                        c++;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                goToNext(token);
            }

            @Override
            public void onFailure(Throwable t) {
                Log.w("fail", "fail");
            }
        });
    }

    public void goToNext(String token){
        Intent intent = new Intent(this, TweetList.class);
        intent.putExtra("AccessToken",token);
        startActivity(intent);
    }

}
