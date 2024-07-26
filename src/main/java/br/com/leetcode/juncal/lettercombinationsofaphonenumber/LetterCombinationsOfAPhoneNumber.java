package main.java.br.com.leetcode.juncal.lettercombinationsofaphonenumber;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        //System.out.println(letterCombinations("234"));
        System.out.println(letterCombinations("23"));
        //System.out.println(letterCombinations(""));

//        ["adg","adh","adi","aeg","aeh","aei","afg",
//                "afh","afi","bdg","bdh","bdi","beg","beh","bei","bfg",
//                "bfh","bfi","cdg","cdh","cdi","ceg","ceh","cei","cfg","cfh","cfi"]

    }

    private static List<String> letterCombinations(String digits) {
        List<String> resultList = new ArrayList<>();
        List<List<Character>> digitCharacters = new ArrayList<>();
        Map<Character, List<Character>> hashMap = Map.of('2', Arrays.asList('a','b', 'c'), '3', Arrays.asList('d','e', 'f'),
                '4', Arrays.asList('g','h', 'i'), '5', Arrays.asList('j','k', 'l'),'6', Arrays.asList('m','n', 'o'),
                '7', Arrays.asList('p','q', 'r', 's'),'8', Arrays.asList('t','u', 'v'), '9', Arrays.asList('w','x', 'y', 'z'));
        char[] digitChars = digits.toCharArray();
        int counter = 0;
        int pointer = 0;
        if (digitChars.length == 0){
            return Collections.emptyList();
        } else if (digitChars.length == 1) {
            hashMap.get(digitChars[0]).forEach(word -> resultList.add(word.toString()));
            return resultList;
        }
        for (char c : digitChars) {
            digitCharacters.add(hashMap.get(c));
        }
        for (int i = 0; i < digitCharacters.size(); i++) {
            List<Character> characterList = digitCharacters.get(i);
            for (int j = i; j < characterList.size(); j++) {

                System.out.println(characterList.get(0));
            }

        }
//        int allCharactersSize = digitCharacters.size();
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < allCharactersSize * allCharactersSize; i++) {
//            digitCharacters.get(i).toString();
//            resultList.add(digitCharacters.get(i).toString() + digitCharacters.get(3).toString() + digitCharacters.get(6).toString());
//            resultList.add(digitCharacters.get(0).toString() + digitCharacters.get(3).toString() + digitCharacters.get(7).toString());
//            resultList.add(digitCharacters.get(0).toString() + digitCharacters.get(3).toString() + digitCharacters.get(8).toString());
//            resultList.add(digitCharacters.get(0).toString() + digitCharacters.get(4).toString() + digitCharacters.get(6).toString());
//            resultList.add(digitCharacters.get(0).toString() + digitCharacters.get(4).toString() + digitCharacters.get(7).toString());
//            resultList.add(digitCharacters.get(0).toString() + digitCharacters.get(4).toString() + digitCharacters.get(8).toString());
//            resultList.add(digitCharacters.get(0).toString() + digitCharacters.get(5).toString() + digitCharacters.get(6).toString());
//            resultList.add(digitCharacters.get(0).toString() + digitCharacters.get(5).toString() + digitCharacters.get(7).toString());
//            resultList.add(digitCharacters.get(0).toString() + digitCharacters.get(5).toString() + digitCharacters.get(8).toString());
//        }


        return resultList;
    }
}
