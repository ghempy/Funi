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
        super.addQuestion("h,a,t", new ArrayList<>(Arrays.asList("h,a,t", "p,a,t", "c,a,t", "b,a,t")), "Picture of Hat; Select the correct spelling of the word displayed");
        //question 2
        super.addQuestion("c,a,t", new ArrayList<>(Arrays.asList("b,a,t", "c,a,t", "c,t,a", "f,a,t")), "Picture of Cat; Select the correct spelling of the word displayed");
        //question 3
        super.addQuestion("c,a,r", new ArrayList<>(Arrays.asList("c,a,r", "b,a,r", "r,a,c", "a,r,c")), "Picture of Car; Select the correct spelling of the word displayed");
        //question 4
        super.addQuestion("b,a,t", new ArrayList<>(Arrays.asList("t,a,b", "a,b,t", "p,a,t", "b,a,t")), "Picture of Bat; Select the correct spelling of the word displayed");
        //question 5
        super.addQuestion("s,k,y", new ArrayList<>(Arrays.asList("s,k,i", "s,h,y", "s,k,i,e", "s,k,y")), "Picture of Sky; Select the correct spelling of the word displayed");
        //question 6
        super.addQuestion("r,e,d", new ArrayList<>(Arrays.asList("r,a,d", "r,e,d", "r,i,d", "r,o,d")), "Picture of Red; Select the correct spelling of the word displayed");
        //question 7
        super.addQuestion("j,a,r", new ArrayList<>(Arrays.asList("j,r,a", "r,a,j", "c,a,r", "j,a,r")), "Picture of Jar; Select the correct spelling of the word displayed");
        //question 8
        super.addQuestion("b,i,r,d", new ArrayList<>(Arrays.asList("b,a,r,d", "b,e,r,d", "b,i,r,d", "b,u,r,d")), "Picture of Bird; Select the correct spelling of the word displayed");
        //question 9
        super.addQuestion("a,i,r", new ArrayList<>(Arrays.asList("a,i,r", "a,y,r", "a,r,e", "a,r,i")), "Picture of Air; Select the correct spelling of the word displayed");
        //question 10
        super.addQuestion("b,u,s", new ArrayList<>(Arrays.asList("b,u,t", "b,u,s", "s,u,b", "b,e,s")), "Picture of Bus; Select the correct spelling of the word displayed");
        //question 11
        //COLOR MATCHING/SPELLING
        super.addQuestion("red", new ArrayList<>(Arrays.asList("yellow", "green", "red", "orange")), "Picture of Red; Select the correct spelling of the word displayed");
        //question 12
        super.addQuestion("orange", new ArrayList<>(Arrays.asList("oringe", "orrange", "orringe", "orange")), "Picture of Orange; Select the correct spelling of the word displayed");
        //question 13
        super.addQuestion("yellow", new ArrayList<>(Arrays.asList("yellow", "yelow", "orange", "yelo")), "Picture of Yellow; Select the correct spelling of the word displayed");
        //question 14
        super.addQuestion("green", new ArrayList<>(Arrays.asList("green", "blue", "bleu", "gren")), "Picture of Green; Select the correct spelling of the word displayed");
        //question 15
        super.addQuestion("blue", new ArrayList<>(Arrays.asList("bleu", "bloo", "blue", "blou")), "Picture of Blue; Select the correct spelling of the word displayed");
        //question 16
        super.addQuestion("purple", new ArrayList<>(Arrays.asList("perple", "purple", "purrple", "purpul")), "Picture of Purple; Select the correct spelling of the word displayed");
        //question 17
        super.addQuestion("brown", new ArrayList<>(Arrays.asList("brown", "brone", "browwn", "borwn")), "Picture of Brown; Select the correct spelling of the word displayed");
        //question 18
        super.addQuestion("pink", new ArrayList<>(Arrays.asList("peenk", "penk", "red", "pink")), "Picture of Pink; Select the correct spelling of the word displayed");
        //question 19
        super.addQuestion("black", new ArrayList<>(Arrays.asList("black", "blak", "blac", "blacc")), "Picture of Black; Select the correct spelling of the word displayed");
        //question 20
        super.addQuestion("white", new ArrayList<>(Arrays.asList("wite", "wyte", "gray", "white")), "Picture of White; Select the correct spelling of the word displayed");


    }
}
