package com.android.sunah.koreaquiz;

/**
 * Created by pc on 2018-01-21.
 */

public class CheckBoxQuestion {
     String checkBoxQuestion ;
     AnswerQuestion answer1 ;
     AnswerQuestion answer2 ;
     AnswerQuestion answer3 ;
     AnswerQuestion answer4 ;
     AnswerQuestion answer5 ;

    public CheckBoxQuestion(String checkBoxQuestion, AnswerQuestion answer1, AnswerQuestion answer2, AnswerQuestion answer3, AnswerQuestion answer4, AnswerQuestion answer5) {
        this.checkBoxQuestion = checkBoxQuestion;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
    }


}
