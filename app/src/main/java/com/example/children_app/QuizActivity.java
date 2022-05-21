package com.example.children_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener {
ImageButton OneBtn, TwoBtn, ThreeBtn, FourBtn, FiveBtn, SixBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        OneBtn= findViewById(R.id.imageButton);
        TwoBtn= findViewById(R.id.imageButton2);
        ThreeBtn= findViewById(R.id.imageButton3);
        FourBtn= findViewById(R.id.imageButton4);
        FiveBtn= findViewById(R.id.imageButton5);
        SixBtn= findViewById(R.id.imageButton6);
    }

    @Override
    public void onClick(View view) {

    }
}