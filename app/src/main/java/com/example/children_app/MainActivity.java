package com.example.children_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button RepoBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RepoBtn = findViewById(R.id.Repobtn);
        RepoBtn.setOnClickListener(view -> {
            String webpage = "https://github.com/SyedMajidFareed/Children_App";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webpage));
            startActivity(intent);
        });
    }

}