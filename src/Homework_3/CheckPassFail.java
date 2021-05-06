package Homework_3;

import java.util.Scanner;

public class CheckPassFail {
    ////1.Написать программу с названием “CheckPassFail”, которая выводит PASS если
    //переменная “mark” типа int больше или равно 50 или вывести “FAIL” в противном
    //случае. Программа всегда должна перед выходом печатать “DONE”

    public static void main(String[] args) {
        System.out.println( " ENTER MARK:");
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        if (mark>=50){
            System.out.println( "PASS");}
        else {
            System.out.println( "FAIL");}
        System.out.println( "DONE");
    }

}
