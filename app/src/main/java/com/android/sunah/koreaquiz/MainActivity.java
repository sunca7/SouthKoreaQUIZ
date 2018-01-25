package com.android.sunah.koreaquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        CheckBoxQuesetionView testView = new CheckBoxQuesetionView(this);
        RadioQuestionView radioView = new RadioQuestionView(this);
        EditTextQuizView editTextQuizView = new EditTextQuizView(this);
        LinearLayout body = (LinearLayout) findViewById(R.id.questionList);
        Button checkAnswer = (Button) findViewById(R.id.checkButton);

        final List<CheckBoxQuestion> checkBoxQuestionList = new ArrayList<>();
        final List<CheckBoxQuesetionView> checkBoxQuesetionViews = new ArrayList<>();
        final List<RadioQuestion> radioQuestions = new ArrayList<>();
        final List<RadioQuestionView> radioQuestionViews = new ArrayList<>();
        final List<EditTextQuiz> editTextQuizList = new ArrayList<>();
        final List<EditTextQuizView> editTextQuizViews = new ArrayList<>();


        checkAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if checkbox question well answer
                for (int position = 0; position < checkBoxQuesetionViews.size(); position++) {
                    if (!checkBoxQuesetionViews.get(position).isQuestionValid()) {
                        Toast.makeText(MainActivity.this, "Something is wrong..Try again!", Toast.LENGTH_LONG).show();
                        return;
                    }
                }

                for (int position = 0; position < radioQuestionViews.size(); position++) {
                    if (!radioQuestionViews.get(position).isQuestionValid()) {
                        Toast.makeText(MainActivity.this, "Something is wrong..Try again!", Toast.LENGTH_LONG).show();
                        return;
                    }
                }

                for (int position = 0; position < editTextQuizViews.size(); position++) {
                    if (!editTextQuizViews.get(position).isQuestionValid()) {
                        Toast.makeText(MainActivity.this, "Something is wrong..Try again!EDITTEXT" + position, Toast.LENGTH_LONG).show();
                        return;
                    }
                }

                Toast.makeText(MainActivity.this, "Wow, excellent!, all is good!", Toast.LENGTH_LONG).show();
            }
        });

        checkBoxQuestionList.add(new CheckBoxQuestion(
                "Q1. What are the two biggest cities in South Korea?",
                new AnswerQuestion(true, "Seoul"),
                new AnswerQuestion(false, "Daegu"),
                new AnswerQuestion(false, "Dajeon"),
                new AnswerQuestion(false, "Jeju"),
                new AnswerQuestion(true, "Busan")
        ));

        checkBoxQuestionList.add(new CheckBoxQuestion(
                "Q2. Which colors can we find in the South Korea flag?",
                new AnswerQuestion(true, "White"),
                new AnswerQuestion(false, "Green"),
                new AnswerQuestion(true, "Blue"),
                new AnswerQuestion(true, "Red"),
                new AnswerQuestion(true, "Black")
        ));

        for (int position = 0; position < checkBoxQuestionList.size(); position++) {
            CheckBoxQuesetionView newView = new CheckBoxQuesetionView(this);
            checkBoxQuesetionViews.add(newView);
            newView.displayQuestion(checkBoxQuestionList.get(position));
            body.addView(newView);
        }

        radioQuestions.add(new RadioQuestion(
                "Q3. South Korea's population is more than 50 million?",
                new AnswerQuestion(true, "True"),
                new AnswerQuestion(false, "False")
        ));

        radioQuestions.add(new RadioQuestion(
                "Q4. 2018 Winter Olympic games will be held in South Korea",
                new AnswerQuestion(true, "True"),
                new AnswerQuestion(false, "Flase")
        ));

        for (int position = 0; position < radioQuestions.size(); position++) {
            RadioQuestionView newView2 = new RadioQuestionView(this);
            radioQuestionViews.add(newView2);
            newView2.displayQuestion2(radioQuestions.get(position));
            body.addView(newView2);
        }

        editTextQuizList.add(new EditTextQuiz(
                "Q5. What is the name of Korean food which is served as a bowl of warm white rice topped with namul and gochujang, soy sauce, or doenjang?",
                new AnswerQuestion(true, "Bibimbap")
        ));

        editTextQuizList.add(new EditTextQuiz(
                "Q6. What is the name of city where 2018 Winter Olympic games will be held?",
                new AnswerQuestion(true, "PyeongChang")
        ));


        for (int position = 0; position < editTextQuizList.size(); position++) {
            EditTextQuizView newView3 = new EditTextQuizView(this);
            editTextQuizViews.add(newView3);
            newView3.displayQuestion3(editTextQuizList.get(position));
            body.addView(newView3);
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
