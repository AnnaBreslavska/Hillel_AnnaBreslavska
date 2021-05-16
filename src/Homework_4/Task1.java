package Homework_4;

public class Task1 {
    public static void main(String[] args) {
        //Написать программу, которая находит минимальное значение в массиве
        double[] numbers = {10.2, 75.4, 88.1, 1.4};
        double minValue = numbers[0];
        double minIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<minValue){
                minValue = numbers[i];
                minIndex=i;
            }
        }
        System.out.println( "Minimal value: " + minValue);
        System.out.println( "Minimal index: " + minIndex);
    }
}
