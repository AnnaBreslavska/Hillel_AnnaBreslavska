package Homework_3;

import java.util.Scanner;

public class Task6 {
    //6. Написать программу, которая бы решала уравнение вида a*x + b = 0 Переменные a
//и b можно задать вручную. Далее нужно будет посчитать и вывести значение “х”.
//Программа должна также учитывать варианты, когда или а = 0 или b = 0

    public static void main(String[] args) {

        System.out.println( " Enter a:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println( " Enter b:");
        int b = scanner.nextInt();
        if (a==0 | b==0) {
            System.out.println( " Do NOT DO IT");}
        else {
            int x = - b/a;
        System.out.println( " For "  + a + " * x + " + b + "= 0, x = " + x);
        }
        System.out.println( "BYE");
    }
}
