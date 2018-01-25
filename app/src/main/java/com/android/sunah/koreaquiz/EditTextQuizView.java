package com.android.sunah.koreaquiz;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by pc on 2018-01-22.
 */

public class EditTextQuizView extends FrameLayout {

    TextView question;
    EditText answer1;
    EditTextQuiz editTextQuiz;

    public EditTextQuizView(@NonNull Context context) {
        super(context);
        init();
    }

    public EditTextQuizView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EditTextQuizView(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public EditTextQuizView(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr, @StyleRes int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init() {
        View v = inflate(getContext(), R.layout.writequiz, this);
        question = v.findViewById(R.id.question1);
        answer1 = v.findViewById(R.id.editAnswer);
    }

    public void displayQuestion3(EditTextQuiz displayQ3) {
        question.setText(displayQ3.editQuestion);
        editTextQuiz = displayQ3;
    }

    public boolean isQuestionValid () {

        if (answer1.getText().toString().toLowerCase().equals(editTextQuiz.answer1.answer.toLowerCase())) {
            return true;
        }
        return false;
    }
}
