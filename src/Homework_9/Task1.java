package Homework_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("You are going to sum 5 values!");
        System.out.println("The Sum of entered values is: " + getSum());
    }

    public static double getSum() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> arrayListSize = new ArrayList<>();
        double sum = 0;
        for (int i = 1; i < 6; i++) {
            int currentNumber = i;
            System.out.println(" Enter " + currentNumber + " value:");
            double number = scanner.nextDouble();
            for (double n : arrayListSize) {
                n = number;
            }
            sum = sum + number;
            arrayListSize.add(number);
        }
        return sum;
    }
}


//        for (double n : values) {
//            for (int i = 1; i < values.size(); i++) {
//                int currentNumber = i;
//                System.out.println(" Enter " + currentNumber + " value:");
//                double number = scanner.nextDouble();
//                n = number;
//                values.add(number);
//                sum = sum + number;
//            }

