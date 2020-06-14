package com.example.user.twitter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.squareup.okhttp.ResponseBody;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;


public class MainActivity extends AppCompatActivity {
    public TwitterRestAdapter twitterRestAdapter;
    String a = null, accessResponse = null, token = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void click(View view) {
        twitterRestAdapter = new TwitterRestAdapter();
        getToken();
    }

    public void getToken() {
    /*    Random rng = new Random();
        String oauth_signature = null;
        String oauth_nonce=generateString(rng,32);
        try {

            String parameter = URLEncoder.encode("oauth_consumer_key", "UTF-8") + "=" + "oT6QTqb6y9lcrF8MEJmnEyvMr"
                    + URLEncoder.encode("oauth_nonce", "UTF-8") + "=" + oauth_nonce
                    + URLEncoder.encode("oauth_signature_method", "UTF-8") + "=" + "HMAC-SHA1"
                    + URLEncoder.encode("oauth_timestamp", "UTF-8") + "=" + twitterRestAdapter.oauth_timestamp
                    + URLEncoder.encode("oauth_version", "UTF-8") + "=" + "1.0";

            String signingKey = URLEncoder.encode("L8UjFqhlC7VasKVEmZNqxSqoSzzTAK4e1ZLjOO1qNM9CsUQvMP", "UTF-8")
                    + "&" + URLEncoder.encode("kDfOzSkMnvHxkDBVJixRVCg0jL76y5329cgnt0LRlBLGh", "UTF-8");

            String signatureBaseString = "POST&" + URLEncoder.encode(twitterRestAdapter.baseUrlForReq, "UTF-8") + "&" + URLEncoder.encode(parameter, "UTF-8");

            oauth_signature = generateSignature(signingKey, signatureBaseString);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/
        String authorizationHeader="OAuth oauth_consumer_key=\"oT6QTqb6y9lcrF8MEJmnEyvMr\", oauth_nonce=\"6d70e35aa4cf2cacda9e524757868514\", oauth_signature=\"D%2FKL9Jyzy0n6VJM%2FkV5yiUSYBGA%3D\", oauth_signature_method=\"HMAC-SHA1\", oauth_timestamp=\"1459136722\", oauth_token=\"696603460649803776-MwdOmsA9RMv7Ioquak33dYRJICTumfy\", oauth_version=\"1.0\"";
        //String authorizationHeader="OAuth oauth_consumer_key=\"oT6QTqb6y9lcrF8MEJmnEyvMr\", oauth_nonce=\"6d70e35aa4cf2cacda9e524757868514\", oauth_signature=\"D%2FKL9Jyzy0n6VJM%2FkV5yiUSYBGA%3D\", oauth_signature_method=\"HMAC-SHA1\", oauth_timestamp=\"1459136722\", oauth_token=\"696603460649803776-MwdOmsA9RMv7Ioquak33dYRJICTumfy\", oauth_version=\"1.0\"";
       // String authorizationHeader = "OAuth oauth_consumer_key=\"oT6QTqb6y9lcrF8MEJmnEyvMr\", oauth_nonce=\""+oauth_nonce+"\", oauth_signature=\"" + oauth_signature + "\", oauth_signature_method=\"HMAC-SHA1\",oauth_timestamp=\"" + twitterRestAdapter.oauth_timestamp + "\", oauth_token=\"696603460649803776-MwdOmsA9RMv7Ioquak33dYRJICTumfy\", oauth_version=\"1.0\"";


        Call<ResponseBody> tokenCall = twitterRestAdapter.twitterAPI.getAuthenticationToken(authorizationHeader);
        tokenCall.enqueue(new Callback<ResponseBody>() {
            @Override//
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    a = response.body().string();
                    Log.w("r", a);
                    String pair[] = a.split("&");
                    int c = 0;;
                    for (String i : pair) {
                        String keyValue[] = i.split("=");
                        Log.w(keyValue[0], keyValue[1]);
                        if (c == 0) token = keyValue[1];
                        c++;
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
                directToWeb(token);
            }

            @Override
            public void onFailure(Throwable t) {
                Log.w("hi", "bye");
            }
        });
    }

    private void directToWeb(String token) {
        Uri webpage = Uri.parse("https://api.twitter.com/oauth/authorize?oauth_token=" + token);
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }


    public void getAccessToken(View view) {
        EditText editText = (EditText) findViewById(R.id.enterPin);
        String pin = editText.getText().toString();

        String header = "OAuth oauth_consumer_key=\"oT6QTqb6y9lcrF8MEJmnEyvMr\", oauth_nonce=\"5c222ce5e790be545d12452780ef7a68\", oauth_signature=\"zcWZMVQ6BbpmCa1ed3y5JiJOS2U%3D\", oauth_signature_method=\"HMAC-SHA1\", oauth_timestamp=\"1459136843\", oauth_token=" + token + ", oauth_version=\"1.0\"";
      //  String header = "OAuth oauth_consumer_key=\"oT6QTqb6y9lcrF8MEJmnEyvMr\", oauth_nonce=\"5c222ce5e790be545d12452780ef7a68\", oauth_signature=\"zcWZMVQ6BbpmCa1ed3y5JiJOS2U%3D\", oauth_signature_method=\"HMAC-SHA1\",oauth_timestamp=\"" + oauth_timestamp + "\", oauth_token=" + token + ", oauth_version=\"1.0\"";
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

    private void hpleem(){

    }

    public void goToNext(String token) {
        Intent intent = new Intent(this, TweetList.class);
        intent.putExtra("AccessToken", token);
        startActivity(intent);
    }

    private String generateSignature(String signingKey, String signatureBaseString) {
        Mac mac = null;
        String oauth_signature=null;
        try {
            mac = Mac.getInstance("HmacSHA1");
            SecretKeySpec secret = new SecretKeySpec(signingKey.getBytes("UTF-8"), mac.getAlgorithm());
            mac.init(secret);
            byte[] digest = mac.doFinal(signatureBaseString.getBytes());
            String enc = new String(digest);
            oauth_signature = Base64.encodeToString(enc.getBytes(), Base64.DEFAULT);
            return oauth_signature;

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return oauth_signature;
    }

    public static String generateString(Random rng, int length) {
        String characters="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] text = new char[length];
        for (int i = 0; i < length; i++)
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        return new String(text);
    }
}