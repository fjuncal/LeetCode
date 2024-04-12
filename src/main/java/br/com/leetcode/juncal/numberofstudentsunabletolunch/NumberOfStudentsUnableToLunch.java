package main.java.br.com.leetcode.juncal.numberofstudentsunabletolunch;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.stream.Collectors;

public class NumberOfStudentsUnableToLunch {
    public static void main(String[] args) {
       System.out.println(countStudents(new int[]{1,1,0,0}, new int[]{0,1,0,1}));
       System.out.println(countStudents(new int[]{1,1,1,0,0,1}, new int[]{1,0,0,0,1,1}));
    }

    private static int countStudents(int[] students, int[] sandwiches) {
        int counter = 0;
        Queue<Integer> studentsQueue = new LinkedList<>(Arrays.stream(students).boxed().collect(Collectors.toList()));
        Queue<Integer> sandwichesQueue = new LinkedList<>(Arrays.stream(sandwiches).boxed().collect(Collectors.toList()));

        while (!studentsQueue.isEmpty() && counter < studentsQueue.size()){
            if (Objects.equals(studentsQueue.peek(), sandwichesQueue.peek())){
                sandwichesQueue.remove();
                studentsQueue.remove();
                counter = 0;
            } else {
                studentsQueue.add(studentsQueue.peek());
                studentsQueue.remove();
                counter++;
            }
        }
        return studentsQueue.size();
    }
}
