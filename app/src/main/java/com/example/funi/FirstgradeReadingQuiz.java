package com.example.funi;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstgradeReadingQuiz extends Quiz {
    public FirstgradeReadingQuiz() {
        setQuestions();
    }

    public void setQuestions() {
        //eventually set this to 30 for 30 questions
        //question 1
        super.addQuestion("tree", new ArrayList<>(Arrays.asList("tree", "trie", "teree", "trey")), "Picture of Tree; Select the correct spelling of the word displayed.");
        //question 2
        super.addQuestion("woman", new ArrayList<>(Arrays.asList("wuman", "woman", "man", "wooman")), "Picture of Woman; Select the correct spelling of the word displayed.");
        //question 3
        super.addQuestion("man", new ArrayList<>(Arrays.asList("mann", "woman", "man", "mane")), "Picture of Man; Select the correct spelling of the word displayed.");
        //question 4
        super.addQuestion("star", new ArrayList<>(Arrays.asList("star", "starr", "stare", "stir")), "Picture of Star; Select the correct spelling of the word displayed.");
        //question 5
        super.addQuestion("cake", new ArrayList<>(Arrays.asList("kake", "cake", "cakke", "caake")), "Picture of Cake; Select the correct spelling of the word displayed.");
        //question 6
        super.addQuestion("eyes", new ArrayList<>(Arrays.asList("iyes", "eeyes", "eyees", "eyes")), "Picture of Eyes; Select the correct spelling of the word displayed.");
        //question 7
        super.addQuestion("bee", new ArrayList<>(Arrays.asList("bee", "bie", "beey", "bey")), "Picture of Bee; Select the correct spelling of the word displayed.");
        //question 8
        super.addQuestion("water", new ArrayList<>(Arrays.asList("watur", "weter", "watir", "water")), "Picture of Water; Select the correct spelling of the word displayed.");
        //question 9
        super.addQuestion("bread", new ArrayList<>(Arrays.asList("bred", "bread", "brred", "brad")), "Picture of Bread; Select the correct spelling of the word displayed.");
        //question 10
        super.addQuestion("mouse", new ArrayList<>(Arrays.asList("mowse", "mose", "mouse", "moose")), "Picture of Mouse; Select the correct spelling of the word displayed.");
        //question 11
        super.addQuestion("book", new ArrayList<>(Arrays.asList("book", "bock", "booke", "booc")), "Fill in the blank of the sentence with the correct spelling.\nJimmy placed his favorite __________ on his desk.");
        //question 12
        super.addQuestion("cow", new ArrayList<>(Arrays.asList("coo", "cow", "chow", "kow")), "Fill in the blank of the sentence with the correct spelling.\nThe neighbor's farm has a new baby __________ in their barn.");
        //question 13
        super.addQuestion("sock", new ArrayList<>(Arrays.asList("socc", "sook", "suck", "sock")), "Fill in the blank of the sentence with the correct spelling.\nI always lose a __________ after a good night of sleep.");
        //question 14
        super.addQuestion("lock", new ArrayList<>(Arrays.asList("lock", "locc", "look", "lick")), "Fill in the blank of the sentence with the correct spelling.\nAlways __________ your front door before going to bed.");
        //question 15
        super.addQuestion("dime", new ArrayList<>(Arrays.asList("dyme", "diime", "dime", "dyeme")), "Fill in the blank of the sentence with the correct spelling.\nI found a __________ on the side of the road.");
        //question 16
        super.addQuestion("truck", new ArrayList<>(Arrays.asList("truck", "truk", "trruck", "trukc")), "Fill in the blank of the sentence with the correct spelling.\nThe garbage man drives a large __________.");
        //question 17
        super.addQuestion("panda", new ArrayList<>(Arrays.asList("panduh", "panda", "pandu", "pande")), "Fill in the blank of the sentence with the correct spelling.\nThe __________ was eating bamboo in the jungle.");
        //question 18
        super.addQuestion("tiger", new ArrayList<>(Arrays.asList("tigur", "tygur", "tyger", "tiger")), "Fill in the blank of the sentence with the correct spelling.\nI saw a __________ at the zoo today!");
        //question 19
        super.addQuestion("head", new ArrayList<>(Arrays.asList("head", "hed", "had", "hedd")), "Fill in the blank of the sentence with the correct spelling.\nJessie fell down the stairs and hit her __________ on the floor.");
        //question 20
        super.addQuestion("grass", new ArrayList<>(Arrays.asList("grras", "grass", "grrass", "gras")), "Fill in the blank of the sentence with the correct spelling.\nWe mow the __________ every week to keep our lawn looking fresh.");
    }
}
