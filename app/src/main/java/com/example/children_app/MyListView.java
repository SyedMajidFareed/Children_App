package com.example.children_app;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

public class MyListView extends ArrayAdapter
{
    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;

    public MyListView(Activity context, String[] maintitle, String[] subtitle, Integer[] imgid) {
        super(context, resource, textViewResourceId, objects);
        this.context = context1;
        this.maintitle = maintitle;
        this.subtitle = subtitle;
        this.imgid = imgid;
    }
}
