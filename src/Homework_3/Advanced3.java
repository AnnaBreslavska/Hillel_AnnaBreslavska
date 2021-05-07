package Homework_3;

import java.util.Scanner;

public class Advanced3 {
    // 3.Определить, является ли число а делителем числа b
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a :");
        int a = scanner.nextInt();
        System.out.println( " Enter b :");
        int b = scanner.nextInt();
        int c;
        if (a%b==0){
            c=a/b;
            System.out.println( " Number a: " + a + " can be divided to " + b + " . It equals " + c);
        }
        else
            System.out.println( " Number a: " + a + " can NOT be divided to " + b );

    }
}

