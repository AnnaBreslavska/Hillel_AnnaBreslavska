package Homework_9;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TEStArray {
    public static void main(String[] args) {


        ArrayList<Double> arrayListSize = new ArrayList<>();
        double sum = 0;
        int currentElementIndex;
        for (int i = 0; i < 5; i++) {
            currentElementIndex = i;
            System.out.println(" Enter " + (i + 1) + " value:");
            Scanner scanner = new Scanner(System.in);
            try {
                double number = scanner.nextDouble();
                sum = sum + number;
                arrayListSize.add(number);

            } catch (InputMismatchException e) {
                int inputError  = currentElementIndex;
                System.out.println("Only numbers can be entered!");
            } finally {

            }
        }
        System.out.println("The Sum of entered values is: " + sum);
    }
}
