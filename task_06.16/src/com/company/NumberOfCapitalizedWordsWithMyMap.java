package com.company;

import java.util.*;

public class NumberOfCapitalizedWordsWithMyMap {

    public SimpleHashMap<String, Integer> countNumberOfWordsWithCapitalLetter(String text) {
        String[] arr = splitWordsIntoArray(text);
        List<String> list = new ArrayList<>(Arrays.asList(arr));

        SimpleHashMap<String, Integer> map = new SimpleHashMap(list.size());

        List<String> newListWithWord = new ArrayList<>();
        List<Integer> newListWithCount = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String word = "";
            if (i > 0) {
                char[] wordToArray = list.get(i).toCharArray();
                if (Character.isUpperCase(wordToArray[0])) {
                    word = list.get(i);
                }
            }
            int count = 0;
            for (int j = 0; list.contains(word); j++) {
                if (Objects.equals(word, list.get(j))) {
                    count++;
                    list.remove(list.get(j));
                    j--;
                }
            }
            if (count > 0) {
                newListWithWord.add(word);
                newListWithCount.add(count);
                i = 0;
            }
        }
        for (int i = 0; i < newListWithCount.size(); i++) {
            map.put(newListWithWord.get(i), newListWithCount.get(i));
        }
        return map;
    }

    private String[] splitWordsIntoArray(String text) {
        return text.split("[^A-Za-zА-Яа-я0-9]");
    }
}
