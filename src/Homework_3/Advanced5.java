package Homework_3;

import java.util.Scanner;

public class Advanced5 {
    //5.Даны три различных числа. Определить, какое из них (первое, второе или третье) -
    //самое большое - самое маленькое - является средним
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a :");
        int a = scanner.nextInt();
        System.out.println(" Enter b :");
        int b = scanner.nextInt();
        System.out.println(" Enter c:");
        int c = scanner.nextInt();
        if (a > b & a > c) {
            System.out.println("a - the biggest.");
            if (b>c){
                System.out.println( "b - the middle. c - the smallest.");
            }
            else
                System.out.println("c - the middle. b - the smallest.");

        }
        if ( b>a & b>c){
            System.out.println( "b - the biggest");
            if ( a>c){
                System.out.println("a - the middle. c - the smallest");
            }
            else
                System.out.println( "c - the middle. a - the smallest");
        }
        if (c>a & c>b){
            System.out.println("c - the biggest.");
            if (a>b) {
                System.out.println("a - the middle. b - the smallest.");
            }
            else
                System.out.println( "b - the middle. a - the smallest.");
        }
    }
}
