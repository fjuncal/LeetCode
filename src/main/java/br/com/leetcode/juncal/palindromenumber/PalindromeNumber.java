package main.java.br.com.leetcode.juncal.palindromenumber;

import java.util.Collections;
import java.util.LinkedList;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1003003001));
    }

    private static boolean isPalindrome(int value) {
        LinkedList<Integer> result = new LinkedList<>();

        if (value < 0){
            return false;
        }

        while (value > 0){
            result.push(value % 10);
            value /= 10;
        }
        LinkedList<Integer> resultReverse = new LinkedList<>(result);
        Collections.reverse(resultReverse);
        return result.equals(resultReverse);
    }
}
