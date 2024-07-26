package main.java.br.com.leetcode.juncal.minimumoperationstoexceedthresoldvalue1;

import java.util.ArrayList;

public class MinimumOperationstoExceedThresholdValueI {
    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{1,1,2,4,9}, 9));
    }

    public static int minOperations(int[] nums, int k) {
        ArrayList<Integer> lesserElementsThanK = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k){
                lesserElementsThanK.add(nums[i]);
            }
        }
        return lesserElementsThanK.size();
    }
}
