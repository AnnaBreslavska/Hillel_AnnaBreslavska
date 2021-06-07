package Homework_9;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("You are going to sum 5 values!");
        System.out.println("The Sum of entered values is: " + getSum());
    }

    public static double getSum() {
        double[] arrayValues = new double[5];
        double sum = 0;
        for (int i = 0; i < arrayValues.length; i++) {
            try {
                System.out.println(" Enter " + (i + 1) + " value:");
                Scanner scanner = new Scanner(System.in);
                double number = scanner.nextDouble();
                arrayValues[i] = number;
                sum = sum + number;
            } catch (InputMismatchException e) {
                System.out.println("Only numbers can be entered!");
                i--;
            }
        }
        System.out.println("Your array is the following ->: " + Arrays.toString(arrayValues));
        return sum;
    }
}



