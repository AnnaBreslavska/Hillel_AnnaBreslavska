package Homework_4;

import java.util.Arrays;

public class Task3 {
    //Написать программу, которая сортирует массив от минимума в максимум
    public static void main(String[] args) {
        int[] array = {1, 11, 3, 14, 16, 7};
        boolean isSorted=false;
        while (!isSorted) {
            isSorted=true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted=false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}