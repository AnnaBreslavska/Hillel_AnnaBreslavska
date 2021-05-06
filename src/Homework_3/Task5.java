package Homework_3;

import java.util.Scanner;

public class Task5 {
    //5.Написать программу, которая сравнивает два числа типа int и определяет, какое из
    //чисел большее, а какое меньшее. Программа должна вывести что-то типа “The number
    //x has the greatest value”. Где “x” одно из чисел

    public static void main(String[] args) {
        System.out.println( " Enter a:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println( " Enter x:");
        int x = scanner.nextInt();
        if ( a>x){
            System.out.println( "The number x: " + x + " has the greatest value.");
        }
        else if ( x>a){
            System.out.println( "The number x: " + x + " has the greatest value.");
        }
        else if ( x==a){
            System.out.println( " The Numbers are equal.");
        }
        System.out.println( "BYE");
    }
}
