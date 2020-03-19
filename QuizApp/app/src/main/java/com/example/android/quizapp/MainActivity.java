package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method checks if all the questions are answered
     *
     * @param answerSeven
     * @param answerEight
     * @param answerNine
     * @param answerTen
     * @param rightAns
     */
    public void incompleteAnswers(String answerSeven, String answerEight, String answerNine,
                                  String answerTen, int rightAns) {

        if (answerSeven == null || answerEight == null || answerNine == null || answerTen == null) {
            Toast.makeText(this, "Please answer all the question.", Toast.LENGTH_LONG);

        } else {
            Toast.makeText(this, "You got " + rightAns + "Correct", Toast.LENGTH_LONG);
        }

    }

    /**
     * This method checks if all the questions are answered
     */
    public void submitAnswers(View view) {
        int correctAnswers = 0;

        //Getting values from the RadioButtons and TextView
        boolean checked = ((RadioButton) view).isChecked();
        Log.v("MainActivity", "variable is: " + checked);
        TextView questionSeven = (TextView) findViewById(R.id.answerSeven);
        String question7 = questionSeven.getText().toString();

        TextView questionEight = (TextView) findViewById(R.id.answerEight);
        String question8 = questionEight.getText().toString();

        TextView questionNine = (TextView) findViewById(R.id.answerNine);
        String question9 = questionNine.getText().toString();

        TextView questionTen = (TextView) findViewById(R.id.answerTen);
        String question10 = questionTen.getText().toString();


        //Question 1
        switch (view.getId()) {
            case R.id.answer_2:
                if (checked)
                    correctAnswers += 1;
                break;
            case R.id.answer_3:
                if (checked)
                    break;
        }

        //Question 2
        switch (view.getId()) {
            case R.id.answer_2:
                if (checked)
                    correctAnswers += 1;
                break;
            case R.id.answer_3:
                if (checked)
                    break;
        }

        //Question 3
        switch (view.getId()) {
            case R.id.answer_2:
                if (checked)
                    correctAnswers += 1;
                break;
            case R.id.answer_3:
                if (checked)
                    break;
        }

        //Question 4
        switch (view.getId()) {
            case R.id.answer_2:
                if (checked)
                    correctAnswers += 1;
                break;
            case R.id.answer_3:
                if (checked)
                    break;
        }


        //Question 5
        switch (view.getId()) {
            case R.id.answer_2:
                if (checked)
                    correctAnswers += 1;
                break;
            case R.id.answer_3:
                if (checked)
                    break;
        }

        //Question 6
        switch (view.getId()) {
            case R.id.answer_2:
                if (checked)
                    correctAnswers += 1;
                break;
            case R.id.answer_3:
                if (checked)
                    break;
        }

        //Question 7
        if (questionSeven.getText().toString() == "soll")
            correctAnswers += 1;

        //Question 8
        if (questionEight.getText().toString() == "meinem")
            correctAnswers += 1;

        //Question 9
        if (questionNine.getText().toString() == "ihn")
            correctAnswers += 1;

        //Question 10
        if (questionTen.getText().toString() == "so daa")
            correctAnswers += 1;

        incompleteAnswers(question7, question8, question9, question10, correctAnswers);
    }

    public void resetQuestions(View view) {
    }
}
