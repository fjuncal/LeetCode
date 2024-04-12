package main.java.br.com.leetcode.juncal.twosum;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,5,5,11}, 10)));

    }

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        int arrayPosition = nums.length - 1 ;

        for (int i = 0; i < arrayPosition; i++){
            for (int j = i + 1; j <= arrayPosition; j++){
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
