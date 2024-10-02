package main.java.br.com.leetcode.juncal.checkifarraypairsaredivisiblebyk;

import java.util.ArrayList;
import java.util.List;

public class CheckIfArrayPairsAreDivisibleByK {

    public static void main(String[] args) {
        //System.out.println(canArrange(new int[]{1, 2, 3, 4, 5, 10, 6, 7, 8, 9}, 5));
        //System.out.println(canArrange(new int[]{1, 2, 3, 4, 5, 6}, 7));
        //System.out.println(canArrange(new int[]{1, 2, 3, 4, 5, 6}, 10));
        //System.out.println(canArrange(new int[]{3, 8, 7, 2}, 10));
        //System.out.println(canArrange(new int[]{-1,1,-2,2,-3,3,-4,4}, 3));
        System.out.println(canArrange(new int[]{75,5,-5,75,-2,-3,88,10,10,87}, 85));
        System.out.println(canArrange(new int[]{-4615,-9783,-3300,-7193,9641,6765,-2632,-497,-6438,6638,6274,-9152,4059,6057,-5516,495,-1750,2610,7226,-8568,2904,-383,-6419,-6859,-2072,5335,-2818,-7778,9423,-8318,4086,3316,5461,-1219,-6698,-8725}, 92));
        //System.out.println(canArrange(new int[]{3,8,17,2,5,6}, 10));
    }

//    public static boolean canArrange(int[] arr, int k) {
//        //se o tamanho for impar, já é falso
//        if ((arr.length % 2) != 0) {
//            return false;
//        }
//        List<String> list = new ArrayList<>(arr.length / 2);
//        int[] arrayClone = arr.clone();
//        boolean preencheu = false;
//        for (int i = 0; i < arrayClone.length; i++) {
//            if (preencheu) {
//                i = 0;
//            }
//            for (int j = arrayClone.length - 1; j >= arrayClone.length / 2; j--) {
//                if ((arrayClone[i] + arrayClone[j]) % k == 0) {
//                    list.add("(" + arrayClone[i] + "," + arrayClone[j] + ")");
//                    int[] removedI = removeElement(arrayClone, i);
//                    int[] removeJ = removeElement(removedI, j - 1);
//                    arrayClone = removeJ.clone();
//                    preencheu = true;
//                    break;
//                }
//                preencheu = false;
//            }
//        }
//        System.out.println(list);
//        return list.size() == arr.length / 2 || list.size() == k
//    }
//
//    public static int[] removeElement(int[] array, int index) {
//        if (array == null || index < 0 || index >= array.length) {
//            return array;
//        }
//
//        int[] newArray = new int[array.length - 1];
//        for (int i = 0, j = 0; i < array.length; i++) {
//            if (i != index) {
//                newArray[j++] = array[i];
//            }
//        }
//        return newArray;
//    }
public static boolean canArrange(int[] arr, int k) {
    // Se o tamanho do array for ímpar, é impossível fazer pares
    if (arr.length % 2 != 0) {
        return false;
    }

    // Array de marcação para saber quais elementos já foram usados
    boolean[] used = new boolean[arr.length];
    List<String> list = new ArrayList<>(arr.length / 2);

    for (int i = 0; i < arr.length; i++) {
        // Se o elemento já foi usado, pula
        if (used[i]) {
            continue;
        }

        boolean foundPair = false;

        for (int j = i + 1; j < arr.length; j++) {
            // Se o elemento já foi usado, pula
            if (used[j]) {
                continue;
            }

            // Verifica se a soma dos elementos é divisível por k
            if ((arr[i] + arr[j]) % k == 0) {
                list.add("(" + arr[i] + "," + arr[j] + ")");
                used[i] = true;
                used[j] = true;
                foundPair = true;
                break; // Para o loop quando encontrar um par
            }
        }

        // Se não encontrou par para o elemento i, retorna falso
        if (!foundPair) {
            return false;
        }
    }

    // Se conseguimos encontrar pares suficientes, retornamos true
    return list.size() == arr.length / 2;
}
}
