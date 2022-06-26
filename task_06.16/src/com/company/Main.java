package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String text = "Сегодня вечером я со Славиком и Димой пошли в магазин";

        NumberOfCapitalizedWords numberOfCapitalizedWords = new NumberOfCapitalizedWords();
        NumberOfCapitalizedWordsWithMyMap numberOfCapitalizedWordsWithMyMap = new NumberOfCapitalizedWordsWithMyMap();

        HashMap<String, Integer> hashMap = numberOfCapitalizedWords.countNumberOfWordsWithCapitalLetter(text);
        SimpleHashMap<String, Integer> myMap = numberOfCapitalizedWordsWithMyMap.countNumberOfWordsWithCapitalLetter(text);

        System.out.println(hashMap);
        myMap.printMap();
    }
}