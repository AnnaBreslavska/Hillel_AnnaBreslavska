package Homework_4;
// Написать программу, которая печатает значения sin(x), где x это каждые 10 градусов
//от 0 до 360.
public class Task2 {
    public static void main(String[] args) {

        int[] myArray = new int[361];
        for (int i = 0; i< myArray.length; i=i+10){
            System.out.println( "Syn " + i );

        }


    }
}
