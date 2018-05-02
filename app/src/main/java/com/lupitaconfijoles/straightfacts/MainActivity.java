package com.lupitaconfijoles.straightfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
//user starting sccore
    int userScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//make sure to add a grading logic for the questions and the right answers
public void updateUserScore(View v){
        userScore = userScore + 2;

public void onRadioButtonClicked(View v) {
    return userScore;
    }
public void
}
//make a toast message for the submit button
//public void
//  Toast.makeText(getApplicationContext(), "Your Score is " + Score, Toast.LENGTH_LONG).show();


}



