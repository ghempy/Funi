package com.example.funi;

import java.util.ArrayList;
import java.util.Arrays;

public class PreschoolMathQuiz extends Quiz {
    public PreschoolMathQuiz() {
        setQuestions();
    }

    public void setQuestions() {
        //eventually set this to 30 for 30 questions
        //question 1
        super.addQuestion("1", new ArrayList<>(Arrays.asList("0", "1", "2", "3")), "Match the word to a number below: One");
        //question 2
        super.addQuestion("4", new ArrayList<>(Arrays.asList("3", "8", "4", "2")), "Match the word to a number below: Four");
        //question 3
        super.addQuestion("9", new ArrayList<>(Arrays.asList("6", "7", "9", "4")), "Match the word to a number below: Nine");
        //question
    }
}
