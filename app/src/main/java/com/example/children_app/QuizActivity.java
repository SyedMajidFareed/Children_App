package com.example.children_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener {
ImageButton OneBtn, TwoBtn, ThreeBtn, FourBtn, FiveBtn, SixBtn;
Button nextBtn, startBtn;
Random random;
TextView questionView, ResultView;
String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        questionView = findViewById(R.id.questionView);
        ResultView = findViewById(R.id.answerView);
        OneBtn= findViewById(R.id.imageButton);
        TwoBtn= findViewById(R.id.imageButton2);
        ThreeBtn= findViewById(R.id.imageButton3);
        FourBtn= findViewById(R.id.imageButton4);
        FiveBtn= findViewById(R.id.imageButton5);
        SixBtn= findViewById(R.id.imageButton6);
        OneBtn.setOnClickListener(this);
        TwoBtn.setOnClickListener(this);
        ThreeBtn.setOnClickListener(this);
        FourBtn.setOnClickListener(this);
        FiveBtn.setOnClickListener(this);
        SixBtn.setOnClickListener(this);
        nextBtn = findViewById(R.id.button);
        startBtn = findViewById(R.id.button2);
        disabled(nextBtn);
        startBtn.setOnClickListener(view -> {
            TextSetter();
            enabled(nextBtn);
        });
        nextBtn.setOnClickListener(view -> {
            TextSetter();
            ResultView.setText("Neutral");
            disabled(startBtn);
        });
    }
    public void disabled(View v)
    {
        v.setEnabled(false);
    }
    public void enabled(View v)
    {
        v.setEnabled(true);
    }
    @Override
    public void onClick(View view) {
        String question;
        question = text;

        if (OneBtn.equals(view)) {
            //if one button is clicked then checking if the text was ONE in the question view
            if(question == "ONE")
            {
                ResultView.setText("Correct!!!");
            }
            else
            {
                ResultView.setText("Wrong!!!");
            }
        }
        if (TwoBtn.equals(view)) {
            //if two button is clicked then checking if the text was TWO in the question view
            if (question == "TWO") {
                ResultView.setText("Correct!!!");
            } else {
                ResultView.setText("Wrong!!!");
            }
        }
        if (ThreeBtn.equals(view)) {
            //if three button is clicked then checking if the text was THREE in the question view
            if (question == "THREE") {
                ResultView.setText("Correct!!!");
            } else {
                ResultView.setText("Wrong!!!");
            }
        }
        if (FourBtn.equals(view)) {
            //if four button is clicked then checking if the text was FOUR in the question view
            if (question == "FOUR") {
                ResultView.setText("Correct!!!");
            } else {
                ResultView.setText("Wrong!!!");
            }
        }
        if (FiveBtn.equals(view)) {
            //if five button is clicked then checking if the text was FIVE in the question view
            if (question == "FIVE") {
                ResultView.setText("Correct!!!");
            } else {
                ResultView.setText("Wrong!!!");
            }
        }
        if (SixBtn.equals(view)) {
            //if six button is clicked then checking if the text was SIX in the question view
            if (question == "SIX") {
                ResultView.setText("Correct!!!");
            } else {
                ResultView.setText("Wrong!!!");
            }
        }
    }
    public void TextSetter()
    {
        //this would generate us a random number bw 1 to 6
        random = new Random();
        int randNum = random.nextInt(7-1) + 1;
        if(randNum == 1)
        {
            questionView.setText("ONE");
            text = "ONE";
        }
        else if(randNum==2)
        {
            questionView.setText("TWO");
            text = "TWO";

        }
        else if(randNum==3)
        {
            questionView.setText("THREE");
            text =  "THREE";

        }
        else if(randNum==4)
        {
            questionView.setText("FOUR");
            text =  "FOUR";

        }
        else if(randNum==5)
        {
            questionView.setText("FIVE");
            text =  "FIVE";

        }
        else if(randNum==6)
        {
            questionView.setText("SIX");
            text =  "SIX";

        }
        else
            text =  "ZERO";
    }
}