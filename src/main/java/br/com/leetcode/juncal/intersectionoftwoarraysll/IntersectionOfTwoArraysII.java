package main.java.br.com.leetcode.juncal.intersectionoftwoarraysll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        //Cases test
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1, 7, 7}, new int[]{2, 2, 7})));
        System.out.println(Arrays.toString(intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
        System.out.println(Arrays.toString(intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1}, new int[]{2})));
        System.out.println(Arrays.toString(intersect(new int[]{61, 24, 20, 58, 95, 53, 17, 32, 45, 85, 70, 20, 83, 62, 35, 89, 5, 95, 12, 86, 58, 77, 30, 64, 46, 13, 5, 92, 67, 40, 20, 38, 31, 18, 89, 85, 7, 30, 67, 34, 62, 35, 47, 98, 3, 41, 53, 26, 66, 40, 54, 44, 57, 46, 70, 60, 4, 63, 82, 42, 65, 59, 17, 98, 29, 72, 1, 96, 82, 66, 98, 6, 92, 31, 43, 81, 88, 60, 10, 55, 66, 82, 0, 79, 11, 81}, new int[]{5, 25, 4, 39, 57, 49, 93, 79, 7, 8, 49, 89, 2, 7, 73, 88, 45, 15, 34, 92, 84, 38, 85, 34, 16, 6, 99, 0, 2, 36, 68, 52, 73, 50, 77, 44, 61, 48})));

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> resposta = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int contador1 = 0;
        int contador2 = 0;

        do {
            if (nums1[contador1] == nums2[contador2]) {
                resposta.add(nums1[contador1]);
                contador1++;
                contador2++;
            } else if (nums1[contador1] > nums2[contador2]) {
                contador2++;
            } else {
                contador1++;
            }
        } while (contador1 < nums1.length && contador2 < nums2.length);

        return resposta.stream().mapToInt(i -> i).toArray();
    }

    public static int[] intersectAnotherOpt(int[] nums1, int[] nums2) {
        ArrayList<Integer> intersection = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    intersection.add(nums2[j]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        return intersection.stream().mapToInt(i -> i).toArray();
    }
}