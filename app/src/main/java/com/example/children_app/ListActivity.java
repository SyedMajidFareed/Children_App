package com.example.children_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {
ListView listView;
String Alphabets[] = {"ONE","TWO","THREE","FOUR","FIVE","SIX"};
String Digits[] = {"1","2","3","4","5","6"};
String Roman[] = {"i","ii","iii","iv","v","vi"};
Integer Images[] = {R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView = findViewById(R.id.mycustomList);
        MyListView listviewAdapter = new MyListView(this,Alphabets,Digits,Roman,Images);
        listView.setAdapter(listviewAdapter);
    }
}