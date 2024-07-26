package main.java.br.com.leetcode.juncal.squaresofasortedarray;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] sortedArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sortedArray[i] = nums[i] * nums[i];
        }
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}
