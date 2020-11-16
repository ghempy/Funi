package com.example.funi;

import java.util.ArrayList;
import java.util.Arrays;

public class KindergartenMathQuiz extends Quiz {
    public KindergartenMathQuiz() {
        setQuestions();
    }

    public void setQuestions() {
        //eventually set this to 30 for 30 questions
        //question 1
        super.addQuestion("13", new ArrayList<>(Arrays.asList("11", "12", "13", "14")), "Choose 13");
        //question 2
        super.addQuestion("27", new ArrayList<>(Arrays.asList("20", "22", "24", "27")), "Choose 27");
        //question 3
        super.addQuestion("39", new ArrayList<>(Arrays.asList("31", "39", "33", "40")), "Choose 39");
        //question 4
        super.addQuestion("42", new ArrayList<>(Arrays.asList("42", "43", "44", "45")), "Choose 42");
        //question 5
        super.addQuestion("56", new ArrayList<>(Arrays.asList("5", "6", "58", "56")), "Choose 56");
        //question 6
        super.addQuestion("68", new ArrayList<>(Arrays.asList("68", "67", "66", "65")), "Choose 68");
        //question 7
        super.addQuestion("70", new ArrayList<>(Arrays.asList("71", "70", "72", "73")), "Choose 70");
        //question 8
        super.addQuestion("88", new ArrayList<>(Arrays.asList("8", "88", "888", "80")), "Choose 88");
        //question 9
        super.addQuestion("94", new ArrayList<>(Arrays.asList("91", "92", "94", "99")), "Choose 94");
        //question 10
        super.addQuestion("100", new ArrayList<>(Arrays.asList("99", "100", "101", "102")), "Choose 100");
        //Find the sum of the given equation
        //question 11
        super.addQuestion("2", new ArrayList<>(Arrays.asList("1", "0", "2", "3")), "Find the answer to the expression: 1+1 ");
        //question 12
        super.addQuestion("7", new ArrayList<>(Arrays.asList("1", "0", "7", "8")), "Find the answer to the expression: 4+3 ");
        //question 13
        super.addQuestion("11", new ArrayList<>(Arrays.asList("9", "10", "11", "12")), "Find the answer to the expression: 10+1 ");
        //question 14
        super.addQuestion("34", new ArrayList<>(Arrays.asList("34", "14", "20", "30")), "Find the answer to the expression: 24+10 ");
        //question 15
        super.addQuestion("15", new ArrayList<>(Arrays.asList("12", "15", "16", "17")), "Find the answer to the expression: 6+9 ");
        //question 16
        super.addQuestion("1", new ArrayList<>(Arrays.asList("1", "0", "61", "60")), "Find the answer to the expression: 31-30 ");
        //question 17
        super.addQuestion("0", new ArrayList<>(Arrays.asList("0", "1", "1", "2")), "Find the answer to the expression: 9-9 ");
        //question 18
        super.addQuestion("9", new ArrayList<>(Arrays.asList("1", "0", "2", "3")), "Find the answer to the expression:  16-7");
        //question 19
        super.addQuestion("14", new ArrayList<>(Arrays.asList("15", "14", "13", "12")), "Find the answer to the expression: 24-10 ");
        //question 20
        super.addQuestion("26", new ArrayList<>(Arrays.asList("26", "28", "36", "38")), "Find the answer to the expression: 92-66 ");
    }
}
