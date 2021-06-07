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
        ArrayList<Double> arrayListNumbers = new ArrayList<>();
        double sum = 0;
        int currentElementIndex;
        for (int i = 0; i < 5; i++) {
            currentElementIndex = i;
            System.out.println(" Enter " + (i + 1) + " value:");
            Scanner scanner = new Scanner(System.in);
            try {
                double number = scanner.nextDouble();
                sum = sum + number;
                arrayListNumbers.add(number);

            } catch (InputMismatchException e) {
                int inputError = currentElementIndex;
                System.out.println("Only numbers can be entered!");
            }
        }
        return sum;
    }
}



