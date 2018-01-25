package com.android.sunah.koreaquiz;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by pc on 2018-01-21.
 */

public class CheckBoxQuesetionView extends FrameLayout {

    TextView question;
    CheckBox checkCheck1;
    CheckBox checkCheck2;
    CheckBox checkCheck3;
    CheckBox checkCheck4;
    CheckBox checkCheck5;
    CheckBoxQuestion checkQuestion;


    public CheckBoxQuesetionView(@NonNull Context context) {
        super(context);
        init();
    }

    public CheckBoxQuesetionView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CheckBoxQuesetionView(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public CheckBoxQuesetionView(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr, @StyleRes int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init () {
        View v = inflate(getContext(), R.layout.checkbockquiz, this);
        question=v.findViewById(R.id.question1);
        checkCheck1=v.findViewById(R.id.choice1);
        checkCheck2=v.findViewById(R.id.choice2);
        checkCheck3=v.findViewById(R.id.choice3);
        checkCheck4=v.findViewById(R.id.choice4);
        checkCheck5=v.findViewById(R.id.choice5);
    }

    public void displayQuestion (CheckBoxQuestion displayQ) {
        question.setText(displayQ.checkBoxQuestion);
        checkCheck1.setText(displayQ.answer1.answer);
        checkCheck2.setText(displayQ.answer2.answer);
        checkCheck3.setText(displayQ.answer3.answer);
        checkCheck4.setText(displayQ.answer4.answer);
        checkCheck5.setText(displayQ.answer5.answer);
        checkQuestion=displayQ;

    }

    public boolean isQuestionValid () {
        if (checkQuestion.answer1.isGoodAnswer && !checkCheck1.isChecked()) {
            return false;
        }

        if (!checkQuestion.answer1.isGoodAnswer && checkCheck1.isChecked()) {
            return false;
        }

        if (checkQuestion.answer2.isGoodAnswer && !checkCheck2.isChecked()) {
            return false;
        }

        if (!checkQuestion.answer2.isGoodAnswer && checkCheck2.isChecked()) {
            return false;
        }

        if (checkQuestion.answer3.isGoodAnswer && !checkCheck3.isChecked()) {
            return false;
        }

        if (!checkQuestion.answer3.isGoodAnswer && checkCheck3.isChecked()) {
            return false;
        }

        if (checkQuestion.answer4.isGoodAnswer && !checkCheck4.isChecked()) {
            return false;
        }

        if (!checkQuestion.answer4.isGoodAnswer && checkCheck4.isChecked()) {
            return false;
        }

        if (checkQuestion.answer5.isGoodAnswer && !checkCheck5.isChecked()) {
            return false;
        }

        if (!checkQuestion.answer5.isGoodAnswer && checkCheck5.isChecked()) {
            return false;
        }

        return true;

    }
}
