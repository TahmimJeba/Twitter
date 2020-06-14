package com.example.user.twitter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class TweetList extends AppCompatActivity {
    ListAdapter listAdapter;
    public TwitterRestAdapter twitterRestAdapter;
    Intent intent;
    public static List<Example> dataSet=new ArrayList<Example>();
    SwipeRefreshLayout swipeRefreshLayout;
    String token;
    Example example;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tweet_details);
        twitterRestAdapter = new TwitterRestAdapter();
        intent=getIntent();

        example= new Example();

        token =intent.getStringExtra("AccessToken");
        getStatus(token);
//
        swipeRefreshLayout=(SwipeRefreshLayout) findViewById(R.id.swipeView);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                getStatus(token);
            }
        });
    }
    public void getStatus(String token) {

        String header = "OAuth oauth_consumer_key=\"oT6QTqb6y9lcrF8MEJmnEyvMr\", oauth_nonce=\"d228bca404d2276404876a81f46034d5\", oauth_signature=\"TZiaA3aAPQquue%2FkiGbe7oRpDEg%3D\", oauth_signature_method=\"HMAC-SHA1\", oauth_timestamp=\"1463816473\", oauth_token=\""+token+"\", oauth_version=\"1.0\"";
        //String header = "OAuth oauth_consumer_key=\"oT6QTqb6y9lcrF8MEJmnEyvMr\", oauth_nonce=\"73cc282b7f21d410aa2deedf289183a9\", oauth_signature=\"DdrA7uPOqvnj75mOarfIAm3Sh5E%3D\", oauth_signature_method=\"HMAC-SHA1\", oauth_timestamp=\""+oauth_timestamp+"\", oauth_token=\""+token+"\", oauth_version=\"1.0\"";
        Call<List<Example>> statusCall = twitterRestAdapter.twitterAPI.getStatus(header);
        statusCall.enqueue(new Callback<List<Example>>() {
            @Override
            public void onResponse(Response<List<Example>> response, Retrofit retrofit) {
                Log.w("success", "status");
                showStatus(response.body());
                swipeRefreshLayout.setRefreshing(false);

            }//

            @Override
            public void onFailure(Throwable t) {
                Log.w("fail", example.getUser().getName());
            }

        });
    }

    public void showStatus( List<Example> t)
    {
        ListView listView=(ListView) findViewById(R.id.tweetsList);
        listAdapter =new ListAdapter(getApplicationContext(), new ArrayList<>(t));
        listView.setAdapter(listAdapter);

        dataSet  = new ArrayList<>(t);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(TweetList.this, "clicked: " + position, Toast.LENGTH_LONG).show();
                showFullPost(position);
            }
        });
    }

    private void showFullPost(int p){
        Intent intent = new Intent(this, FullPost.class);
        intent.putExtra("position",p);
        startActivity(intent);
    }
}
