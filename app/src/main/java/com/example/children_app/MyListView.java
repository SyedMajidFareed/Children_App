package com.example.children_app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListView extends ArrayAdapter
{
    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final String[] subtitle1;
    private final Integer[] imgid;

    public MyListView(Activity context, String[] maintitle, String[] subtitle, String[] subtitle1, Integer[] imgid)
    {
        super(context, R.layout.customized, maintitle);
        this.context = context;
        this.maintitle = maintitle;
        this.subtitle = subtitle;
        this.subtitle1 = subtitle1;
        this.imgid = imgid;
    }
    public View getView(int position, View view, ViewGroup parent)
    {
            LayoutInflater inflater=context.getLayoutInflater();
            View singleEntityView=inflater.inflate(R.layout.customized, null,true);
            TextView Alphabet =  singleEntityView.findViewById(R.id.AlphabetTextView);
            ImageView imageView =  singleEntityView.findViewById(R.id.imageView7);
            TextView Digits = singleEntityView.findViewById(R.id.DIgitTextView);
            TextView Roman = singleEntityView.findViewById(R.id.RomantextView);
            Alphabet.setText(maintitle[position]);
            imageView.setImageResource(imgid[position]);
            Digits.setText(subtitle[position]);
            Roman.setText(subtitle1[position]);
            return singleEntityView;
    };

}
