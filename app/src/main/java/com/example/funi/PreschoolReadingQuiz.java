package com.example.funi;

import java.util.ArrayList;
import java.util.Arrays;

public class PreschoolReadingQuiz extends Quiz {
    public PreschoolReadingQuiz() {
        setQuestions();
    }

    public void setQuestions() {
        //eventually set this to 30 for 30 questions
        //question 1
        super.addQuestion("A", new ArrayList<>(Arrays.asList("A", "B", "C", "D")), "Choose A");
        //question 2
        super.addQuestion("E", new ArrayList<>(Arrays.asList("E", "F", "G", "H")), "Choose E");
        //question 3
        super.addQuestion("I", new ArrayList<>(Arrays.asList("I", "J", "K", "L")), "Choose I");
        //question 4
        super.addQuestion("M", new ArrayList<>(Arrays.asList("M", "N", "O", "P")), "Choose M");
        //question 5
        super.addQuestion("Q", new ArrayList<>(Arrays.asList("Q", "R", "S", "T")), "Choose Q");
        //question 6
        super.addQuestion("U", new ArrayList<>(Arrays.asList("U", "V", "W", "X")), "Choose U");
        //question 7
        super.addQuestion("Y", new ArrayList<>(Arrays.asList("Y", "Z", "A", "B")), "Choose Y");
        //Alphabet Ordering Questions
        //question 8
        super.addQuestion("ABCD", new ArrayList<>(Arrays.asList("ACBD","ABCD","ADCB","BACD")), "What is the correct order of letters in the alphabet?");
        //question 9
        super.addQuestion("EFGH", new ArrayList<>(Arrays.asList("EFGH","HGFE","FGHE","EGFH")), "What is the correct order of letters in the alphabet?");

    }
}
