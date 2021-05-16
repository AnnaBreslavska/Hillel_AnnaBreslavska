package Homework_4;

public class Task5 {
    public static void main(String[] args) {
        //Написать программу, которая выводит реверсивную строку
        char[] arrayOfChars = "Level".toCharArray();
        for (int i = arrayOfChars.length-1; i >= 0; i--){
            System.out.print( arrayOfChars [i]);
        }
    }
}
