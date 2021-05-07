package Homework_3;

import java.util.Scanner;

public class Advanced4 {
    //Проверить, принадлежит ли число введенное с клавиатуры, интервалу (-5;3)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number:");
        int number = scanner.nextInt();
        if (number>=-5 & number<=3)
            System.out.println("The number: " + number + " belongs to interval -5 to 3");
        else
            System.out.println( "The number: " + number + " do not belong to interval -5 to 3");

    }
}
