package main.java.br.com.leetcode.juncal.sumofdigitsofstringafterconvert;

import java.util.ArrayList;
import java.util.List;

public class SumOfDigitsOfStringAfterConvert {

    public static void main(String[] args) {
        System.out.println(getLucky("leetcode", 2));
    }

    public static int getLucky(String s, int k) {
        //Map<Character, Integer> alphabetToNumber = IntStream.rangeClosed('a', 'z').collect(HashMap::new, (map, c) -> map.put((char) c, c + (1 - 'a')), HashMap::putAll);
        List<Integer> valueCharactersAlphabet = new ArrayList<>();
        for (char c : s.toCharArray()) {
            valueCharactersAlphabet.add(c - 96);
        }
        List<Integer> receivingList = new ArrayList<>();
        for (int i = valueCharactersAlphabet.size() - 1; i >= 0; i--) {
            int temp = valueCharactersAlphabet.get(i);
            while (temp > 0) {
                receivingList.add(temp % 10);
                temp /= 10;
            }
        }
        var sum = 0;
        while (k != 0) {
            sum = 0;
            for (int i = 0; i < receivingList.size(); i++) {
                sum += receivingList.get(i);
            }
            receivingList.clear();
            k = k - 1;
            if (k != 0) {
                var temp = sum;
                while (temp > 0) {
                    receivingList.add(temp % 10);
                    temp /= 10;
                }
            }
        }
        return sum;
    }
}
