package Homework_4;

import java.util.Arrays;

public class Task7 {
    //7. Написать программу, который переворачивает массив
    public static void main(String[] args) {
        int[] array = {1, 10, 20, 30, 40, 50, 60, 70, 80};
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }
    }
}
