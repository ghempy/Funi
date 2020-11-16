package com.example.funi;

import java.util.ArrayList;
import java.util.Arrays;

public class KindergartenReadingQuiz extends Quiz {
    public KindergartenReadingQuiz() {
        setQuestions();
    }

    public void setQuestions() {
        //eventually set this to 30 for 30 questions
        //question 1
        super.addQuestion("hat", new ArrayList<>(Arrays.asList("h,a,t", "p,a,t", "c,a,t", "b,a,t")), "Picture of Hat; Select the correct spelling of the word displayed");
        //question 2
        super.addQuestion("cat", new ArrayList<>(Arrays.asList("b,a,t", "c,a,t", "h,a,t", "p,a,t")), "Picture of Cat; Select the correct spelling of the word displayed");
        //question 3
        super.addQuestion("car", new ArrayList<>(Arrays.asList("c,a,r", "b,a,r", "c,a,t", "f,a,r")), "Picture of Car; Select the correct spelling of the word displayed");
        //question 4
        super.addQuestion("cat", new ArrayList<>(Arrays.asList("b,a,t", "c,a,t", "h,a,t", "p,a,t")), "Picture of Bat; Select the correct spelling of the word displayed");
        //question 5
        super.addQuestion("car", new ArrayList<>(Arrays.asList("s,k,i", "s,h,y", "s,k,i,e", "s,k,y")), "Picture of Sky; Select the correct spelling of the word displayed");


    }
}
