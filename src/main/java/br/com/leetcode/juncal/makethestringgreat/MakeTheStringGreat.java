package main.java.br.com.leetcode.juncal.makethestringgreat;

import java.util.Stack;

public class MakeTheStringGreat {
    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
        System.out.println(makeGoodWithStack("leEeetcode"));
    }

    private static String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while (i < sb.length() - 1 ){
            char currentChar = sb.charAt(i);
            char nextChar = sb.charAt(i + 1);

            //if they are equal return 32
            if (currentChar - nextChar == 32 || nextChar - currentChar == 32){
                sb.delete(i, i + 2);
                if (i > 0){
                    i--;
                }
            } else {
                i++;
            }
        }
        return sb.toString();
    }

    public static String makeGoodWithStack(String s){
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if (!stack.isEmpty() && Math.abs(c - stack.peek()) == 32){
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()){
            result.insert(0, stack.pop());
        }

        return result.toString();

    }
}
