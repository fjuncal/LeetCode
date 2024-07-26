package main.java.br.com.leetcode.juncal.searchinsertposition;

public class SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{-1,3,5,6}, 0));

        //expected 1
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] - 1 == target) || (nums[i] + 1 > target) || nums[i] == target){
                return i;
            } else if (nums[i] + 1 == target){
                return i + 1;
            } else if (i == nums.length - 1){
                return nums.length;
            }
        }
        return target;
    }



    public static int searchInsertAnotherOpt(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] + 1 > target){
                return i;
            }

            if (nums[i] - 1 == target){
                return i;
            }
            if (nums[i] + 1 == target){
                return i + 1;
            }
            if (i == nums.length - 1){
                return nums.length;
            }
        }
        return target;
    }
}
