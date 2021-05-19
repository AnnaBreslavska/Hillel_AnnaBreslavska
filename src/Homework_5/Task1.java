package Homework_5;

import java.util.Arrays;

public class Task1 {
    //1 - Написать метод (void) который переворачивает массив. В main должен быть вызван
    //метод который переворачивает массив, потом вывести с помощью sout. Важно - не
    //вывести в консоль с последнего элемента, а проапдейтить существующий массив с
    //помощью void

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        arrayMethod(array);
        System.out.println(Arrays.toString(array));
    }
    static void arrayMethod(int[] arrayOfInt) {
        int temp;
        for (int i = arrayOfInt.length - 1, j = 0; i >= arrayOfInt.length / 2; i--, j++) {
            temp = arrayOfInt[j];
            arrayOfInt[j] = arrayOfInt[i];
            arrayOfInt[i] = temp;
        }
    }
}

