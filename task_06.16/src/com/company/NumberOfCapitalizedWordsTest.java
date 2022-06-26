package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class NumberOfCapitalizedWordsTest {
    NumberOfCapitalizedWords numberOfCapitalizedWords = new NumberOfCapitalizedWords();

    @Test
    public void testCountNumberOfWordsWithCapitalLetterWithMap1() {
        String text = "Привет я Егор Егор";

        HashMap<String, Integer> factualResultWithMap = numberOfCapitalizedWords.countNumberOfWordsWithCapitalLetter(text);

        HashMap<String, Integer> expectedResultWithMap = new HashMap<>();
        expectedResultWithMap.put("Егор", 2);

        Assert.assertEquals(expectedResultWithMap, factualResultWithMap);
    }

    @Test
    public void testCountNumberOfWordsWithCapitalLetterWithMap2() {
        String text = "Я сказал привет Николай";

        HashMap<String, Integer> factualResultWithMap = numberOfCapitalizedWords.countNumberOfWordsWithCapitalLetter(text);

        HashMap<String, Integer> expectedResultWithMap = new HashMap<>();
        expectedResultWithMap.put("Николай", 1);

        Assert.assertEquals(expectedResultWithMap, factualResultWithMap);
    }

    @Test
    public void testCountNumberOfWordsWithCapitalLetterWithMap3() {
        String text = "Почему Ты так громко разговариваешь А А";

        HashMap<String, Integer> factualResultWithMap = numberOfCapitalizedWords.countNumberOfWordsWithCapitalLetter(text);

        HashMap<String, Integer> expectedResultWithMap = new HashMap<>();
        expectedResultWithMap.put("А", 2);
        expectedResultWithMap.put("Ты", 1);

        Assert.assertEquals(expectedResultWithMap, factualResultWithMap);
    }

    @Test
    public void testCountNumberOfWordsWithCapitalLetterWithMap4() {
        String text = "Java";

        HashMap<String, Integer> factualResultWithMap = numberOfCapitalizedWords.countNumberOfWordsWithCapitalLetter(text);

        HashMap<String, Integer> expectedResultWithMap = new HashMap<>();

        Assert.assertEquals(expectedResultWithMap, factualResultWithMap);
    }

    @Test
    public void testCountNumberOfWordsWithCapitalLetterWithMap5() {
        String text = "Завтра Сессия Сессия Сессия Сессия";

        HashMap<String, Integer> factualResultWithMap = numberOfCapitalizedWords.countNumberOfWordsWithCapitalLetter(text);

        HashMap<String, Integer> expectedResultWithMap = new HashMap<>();
        expectedResultWithMap.put("Сессия", 4);

        Assert.assertEquals(expectedResultWithMap, factualResultWithMap);
    }

}

