package main.java.br.com.leetcode.juncal.concatenationofarray;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 3})));
    }

    public static int[] getConcatenation(int[] nums){
        int[] concatenated = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            concatenated[i] = nums[i];
            concatenated[i + nums.length] = nums[i];
        }
        return concatenated;
    }

}
