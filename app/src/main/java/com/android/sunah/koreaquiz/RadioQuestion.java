package com.android.sunah.koreaquiz;

/**
 * Created by pc on 2018-01-22.
 */

public class RadioQuestion {
    String radioQuestion;
    AnswerQuestion answer1;
    AnswerQuestion answer2;


    public RadioQuestion(String radioQuestion, AnswerQuestion answer1,  AnswerQuestion answer2) {
        this.radioQuestion = radioQuestion;
        this.answer1 = answer1;
        this.answer2 = answer2;
    }

}