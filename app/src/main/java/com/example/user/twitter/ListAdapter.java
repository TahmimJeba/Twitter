package com.example.user.twitter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends BaseAdapter {

    private List<Example> data=new ArrayList<Example>();
    private Context context;
    private static LayoutInflater inflater=null;

    ListAdapter(Context context, ArrayList<Example> tweets)
    {
        this.context=context;
        data=tweets;

        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View newView=inflater.inflate(R.layout.tweets,null);

        TextView tweetText=(TextView) newView.findViewById(R.id.tweetText);
        TextView timeText=(TextView) newView.findViewById(R.id.dateAndTime);
        TextView userName=(TextView) newView.findViewById(R.id.userName);

        tweetText.setText(data.get(position).getText());
        timeText.setText(data.get(position).getCreated_at());
        userName.setText(data.get(position).getUser().getName());

        return newView;
    }
}
