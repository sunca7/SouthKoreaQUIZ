package com.android.sunah.koreaquiz;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by pc on 2018-01-22.
 */

public class RadioQuestionView extends FrameLayout {

    TextView question;
    RadioButton answer1;
    RadioButton answer2;
    RadioQuestion radionQuestion ;


    public RadioQuestionView(@NonNull Context context) {
        super(context);
        init ();
    }

    public RadioQuestionView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init ();
    }

    public RadioQuestionView(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init ();
    }

    public RadioQuestionView(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr, @StyleRes int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init ();
    }

    public void init () {
        View v = inflate(getContext(), R.layout.radioquiz, this);
        question=v.findViewById(R.id.question1);
        answer1=v.findViewById(R.id.radio1);
        answer2=v.findViewById(R.id.radio2);
    }

    public void displayQuestion2 (RadioQuestion displayQ2) {
        question.setText(displayQ2.radioQuestion);
        answer1.setText(displayQ2.answer1.answer);
        answer2.setText(displayQ2.answer2.answer);
        radionQuestion=displayQ2;
    }

    public boolean isQuestionValid () {
        if (radionQuestion.answer1.isGoodAnswer && !answer1.isChecked()) {
            return false;
        }

        if (!radionQuestion.answer1.isGoodAnswer && answer1.isChecked()) {
            return false;
        }

        if (radionQuestion.answer2.isGoodAnswer && !answer2.isChecked()) {
            return false;
        }

        if (!radionQuestion.answer2.isGoodAnswer && answer2.isChecked()) {
            return false;
        }
        return true;
    }
}

