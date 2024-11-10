package classwork_42.map_examples;

import java.util.HashMap;
import java.util.Map;

public class WordsFrequencyAppl {

    public static void main(String[] args) {

        String[] words = {"a", "abc", "ab", "limit", "ab", "a", "ab", "limit", "a", "a", "a"};

        printWordFrequency(words);

    }//end of main

    private static void printWordFrequency(String[] words){
        //Key - это словоб value - это сколько раз оно попалось в массиве
        Map<String, Integer> resultMap = new HashMap<>();
        for (String word : words) {
            if(!resultMap.containsKey(word)){ //когда слово попалось в первый раз
                resultMap.put(word, 1);
            } else {// когда слово повторилось
                resultMap.put(word, resultMap.get(word) + 1); //увеличиваем value на единицу
            }
        }
        System.out.println(resultMap);
    }

}//end of class
