package com.lupitaconfijoles.straightfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//make sure to add a grading logic for the questions and the right answers


public void onRadioButtonClicked(View view) {
    boolean checked = ((RadioButton)view).isChecked();

    switch(view.getId()){
        case R.id.answr6True:
            if (checked)
                break;
    }
}
//make a toast message for the submit button
//  Toast.makeText(getApplicationContext(), "Your Score is " + Score, Toast.LENGTH_LONG).show();


}



