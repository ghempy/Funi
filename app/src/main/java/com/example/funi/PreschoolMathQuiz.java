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
        //question 4
        super.addQuestion("6", new ArrayList<>(Arrays.asList("9", "2", "6", "5")), "Match the word to a number below: Six");
        //question 5
        super.addQuestion("3", new ArrayList<>(Arrays.asList("3", "5", "9", "4")), "Match the word to a number below: Three");
        //question 6
        super.addQuestion("10", new ArrayList<>(Arrays.asList("0", "2", "1", "10")), "Match the word to a number below: Ten");
        //question 7
        super.addQuestion("5", new ArrayList<>(Arrays.asList("0", "7", "10", "5")), "Match the word to a number below: Five");
        //question 8
        super.addQuestion("7", new ArrayList<>(Arrays.asList("0", "7", "4", "2")), "Match the word to a number below: Seven");
        //question 9
        super.addQuestion("2", new ArrayList<>(Arrays.asList("2", "3", "4", "5")), "Match the word to a number below: Two");
        //question 10
        super.addQuestion("8", new ArrayList<>(Arrays.asList("7", "8", "9", "10")), "Match the word to a number below: Eight");
    }
}
