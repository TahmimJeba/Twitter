package com.example.user.twitter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class FullPost extends AppCompatActivity {
    int position;
    Intent intent;
    private List<Example> data=new ArrayList<Example>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_post);
        intent=getIntent();

        position=intent.getIntExtra("position", 0);
        data=TweetList.dataSet;

        String s = data.get(position).getText();
        String [] ss = s.split("http");

        TextView userName=(TextView) findViewById(R.id.userName);
        userName.setText(data.get(position).getUser().getName());

        TextView screenName=(TextView) findViewById(R.id.screenName);
        screenName.setText("@"+data.get(position).getUser().getScreen_name());

        ImageView uploadedPhoto= (ImageView)findViewById(R.id.uploadedPhoto);
        TextView tweetText = (TextView) findViewById(R.id.tweetText);

        if(ss.length<2) {
            tweetText.setText(s);
            uploadedPhoto.setVisibility(View.GONE);
        }
        else{
            tweetText.setText(ss[0]);
            //String url="http"+ss[1];abcdefghijklmnopqrst
            int size = data.get(position).getEntities().mediaSize();
            String url=data.get(position).getEntities().getMedia().get(size-1).getMedia_url();
            Picasso.with(this).load(url).into(uploadedPhoto);
        }

        TextView retweetCount=(TextView) findViewById(R.id.retweetCount);
        retweetCount.setText(""+data.get(position).getRetweet_count());

        TextView likeCount=(TextView) findViewById(R.id.likeCount);
        likeCount.setText("" + data.get(position).getFavorite_count());

        ImageView profilePhoto = (ImageView)findViewById(R.id.profilePhoto);
        Picasso.with(this).load(data.get(position).getUser().getProfile_image_url()).into(profilePhoto);


    }
}
