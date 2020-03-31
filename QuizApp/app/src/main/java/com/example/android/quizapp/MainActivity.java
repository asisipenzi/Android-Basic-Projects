package com.example.android.quizapp;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mQuestionSeven;
    private EditText mQuestionEight;
    private EditText mQuestionNine;
    private EditText mQuestionTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *Method shows number of correct answers via a Toast
     */
    public void submitAnswers(View view) {

        //Stores number of correct answers
        int correctAnswers = 0;

        //Getting values from the RadioButtons and EditText
        RadioButton questionOne = (RadioButton) findViewById(R.id.answer_2);
        RadioButton questionTwo = (RadioButton) findViewById(R.id.answer_3);
        RadioButton questionThree = (RadioButton) findViewById(R.id.answer_6);
        RadioButton questionFour = (RadioButton) findViewById(R.id.answer_8);
        RadioButton questionFive = (RadioButton) findViewById(R.id.answer_10);
        RadioButton questionSix = (RadioButton) findViewById(R.id.answer_11);
        mQuestionSeven = (EditText) findViewById(R.id.answerSeven);
        mQuestionEight = (EditText) findViewById(R.id.answerEight);
        mQuestionNine = (EditText) findViewById(R.id.answerNine);
        mQuestionTen = (EditText) findViewById(R.id.answerTen);

        //Question 1
        if (questionOne.isChecked())
            correctAnswers += 1;

        //Question 2
        if (questionTwo.isChecked())
            correctAnswers += 1;

        //Question 3
        if (questionThree.isChecked())
            correctAnswers += 1;

        //Question 4
        if (questionFour.isChecked())
            correctAnswers += 1;

        //Question 5
        if (questionFive.isChecked())
            correctAnswers += 1;

        //Question 6
        if (questionSix.isChecked())
            correctAnswers += 1;

        //Question 7
        if (mQuestionSeven.getText().toString().toLowerCase().equals("soll"))
            correctAnswers += 1;

        //Question 8
        if (mQuestionEight.getText().toString().toLowerCase().equals("meinem"))
            correctAnswers += 1;

        //Question 9
        if (mQuestionNine.getText().toString().toLowerCase().equals("ihn"))
            correctAnswers += 1;

        //Question 10
        if (mQuestionTen.getText().toString().toLowerCase().equals("so dass"))
            correctAnswers += 1;

        Toast.makeText(this, "You got " + correctAnswers + " Correct", Toast.LENGTH_LONG).show();
    }

    public void resetQuestions(View view) {
        //Get RadioGroup values
        RadioGroup groupQuestionOne = (RadioGroup)findViewById(R.id.radioGroudQuestion1);
        RadioGroup groupQuestionTwo = (RadioGroup)findViewById(R.id.radioGroudQuestion2);
        RadioGroup groupQuestionThree = (RadioGroup)findViewById(R.id.radioGroudQuestion3);
        RadioGroup groupQuestionFour = (RadioGroup)findViewById(R.id.radioGroudQuestion4);
        RadioGroup groupQuestionFive = (RadioGroup)findViewById(R.id.radioGroudQuestion5);
        RadioGroup groupQuestionSix = (RadioGroup)findViewById(R.id.radioGroudQuestion6);

        groupQuestionOne.clearCheck();
        groupQuestionTwo.clearCheck();
        groupQuestionThree.clearCheck();
        groupQuestionFour.clearCheck();
        groupQuestionFive.clearCheck();
        groupQuestionSix.clearCheck();
        mQuestionSeven.setText("");
        mQuestionEight.setText("");
        mQuestionNine.setText("");
        mQuestionTen.setText("");
    }
}
