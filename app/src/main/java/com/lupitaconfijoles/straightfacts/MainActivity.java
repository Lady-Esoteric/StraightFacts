package com.lupitaconfijoles.straightfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.text.Editable;
import java.text.NumberFormat;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
/*user starting score will be listed
so that it will have a minimum
 */
    int userScore = 0;
    @Override
      protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//make sure to add a grading logic for the questions and the right answers
public void addToUserScore(View v){
    userScore = userScore + 4;
}
//for incorrect answers
public void wrongAnswer(View v){
    userScore = userScore + 0;   
}
//make a toast message for the submit button
//public void
//  Toast.makeText(getApplicationContext(), "Your Score is " + Score, Toast.LENGTH_LONG).show();






