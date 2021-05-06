package Homework_3;

import java.util.Scanner;

public class CheckOddEven {
    //2.Написать программу с названием “CheckOddEven”, которая печатает “Odd Number”
    //если переменная “number” типа int нечетная. Или “Even Number” если переменная
    //четная. Программа всегда должна перед выходом печатать “BYE”
    public static void main(String[] args) {
        System.out.println( " Enter any number to check if it is Even or Odd:");
        Scanner scanner = new Scanner(System.in);
        int number =  scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println( "Even Number"); }
        else {
            System.out.println( "Odd Number"); }
        System.out.println( "BYE");
    }
}
