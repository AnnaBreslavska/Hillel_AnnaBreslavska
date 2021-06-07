package Homework_9;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
        for (int i = 0; i < 5; i++) {
            System.out.println(" Enter " + (i + 1) + " value:");
            double number = scanner.nextDouble();
            sum = sum + number;
            arrayListSize.add(number);
        }
        return sum;
    }
}



