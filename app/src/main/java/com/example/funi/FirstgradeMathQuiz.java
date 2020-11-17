package com.example.funi;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstgradeMathQuiz extends Quiz {

    public FirstgradeMathQuiz() {
        setQuestions();
    }

    public void setQuestions() {
        //eventually set this to 30 for 30 questions
        //question 1
        super.addQuestion("one thousand", new ArrayList<>(Arrays.asList("one hundred", "one thousand", "ten", "ten hundred")), "Picture of 1000; Select the correct word of the number displayed.");
        //question 2
        super.addQuestion("nine hundred fifty two", new ArrayList<>(Arrays.asList("nine hundred fifty two", "nine hundred sixty two", "nine hundred fifty", "six hundred fifty two")), "Picture of 952; Select the correct word of the number displayed.");
        //question 3
        super.addQuestion("eight hundred eighty eight", new ArrayList<>(Arrays.asList("eight hundred", "eight hundred eighty", "eighty eight eight hundred", "eight hundred eighty eight")), "Picture of 888; Select the correct word of the number displayed.");
        //question 4
        super.addQuestion("six hundred ninety four", new ArrayList<>(Arrays.asList("siz hundred ninety three", "six hundred ninety four", "six thousand ninety four", "six nine four")), "Picture of 694; Select the correct word of the number displayed.");
        //question 5
        super.addQuestion("five hundred", new ArrayList<>(Arrays.asList("five zero zero", "five hundred", "five thousand", "fifty")), "Picture of 500; Select the correct word of the number displayed.");
        //question 6
        super.addQuestion("four hundred thirty seven", new ArrayList<>(Arrays.asList("four zero thirty seven", "four hundred thirty seven", "forty seven", "four hundred thirty")), "Picture of 437; Select the correct word of the number displayed.");
        //question 7
        super.addQuestion("three hundred thirty three", new ArrayList<>(Arrays.asList("three hundred thirty three", "three three three", "thirty three thirty three", "three thirty three")), "Picture of 333; Select the correct word of the number displayed.");
        //question 8
        super.addQuestion("two hundred forty six", new ArrayList<>(Arrays.asList("two thousand forty six", "two forty six", "two hundred forty six", "two hundred forty nine")), "Picture of 246; Select the correct word of the number displayed.");
        //question 9
        super.addQuestion("one hundred ninety nine", new ArrayList<>(Arrays.asList("one hundred", "one hundred ninety", "one hundred ninety nine", "one nine nine")), "Picture of 199; Select the correct word of the number displayed.");
        //question 10
        super.addQuestion("one hundred eleven", new ArrayList<>(Arrays.asList("eleven", "one hundred eleven", "one hundred eleven one", "one eleven")), "Picture of 111; Select the correct word of the number displayed.");
        //question 11
        super.addQuestion("900", new ArrayList<>(Arrays.asList("1000", "890", "899", "900")), "888+12=?; Solve the expression for ? and select the answer.");
        //question 12
        super.addQuestion("650", new ArrayList<>(Arrays.asList("660", "640", "650", "670")), "47+603=?; Solve the expression for ? and select the answer.");
        //question 13
        super.addQuestion("8", new ArrayList<>(Arrays.asList("8", "18", "0", "9")), "52+?=60; Solve the expression for ? and select the answer.");
        //question 14
        super.addQuestion("800", new ArrayList<>(Arrays.asList("800", "700", "600", "750")), "109+?=999; Solve the expression for ? and select the answer.");
        //question 15
        super.addQuestion("251", new ArrayList<>(Arrays.asList("151", "250", "251", "351")), "888+12=?; Solve the expression for ? and select the answer.");
        //question 16
        super.addQuestion("700", new ArrayList<>(Arrays.asList("600", "700", "800", "7")), "760-60=?; Solve the expression for ? and select the answer.");
        //question 17
        super.addQuestion("700", new ArrayList<>(Arrays.asList("600", "700", "800", "7")), "822-122=?; Solve the expression for ? and select the answer.");
        //question 18
        super.addQuestion("300", new ArrayList<>(Arrays.asList("300", "200", "100", "400")), "400-?=100; Solve the expression for ? and select the answer.");
        //question 19
        super.addQuestion("71", new ArrayList<>(Arrays.asList("71", "72", "62", "61")), "91-?=20; Solve the expression for ? and select the answer.");
        //question 20
        super.addQuestion("333", new ArrayList<>(Arrays.asList("332", "333", "323", "322")), "655-?=322; Solve the expression for ? and select the answer.");
    }
}
