package Homework_3;

import java.util.Scanner;

public class Task8 {
    //8. Написать программу, которая выведет в консоль если количество продаж больше 10
    //сообщение что менеджер заработал бонус, если меньше, то выполнит расчёт сколько
    //осталось продаж до получения бонуса

    public static void main(String[] args) {
        System.out.println(" Enter count of manager's sales");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        int basicSalary = 1000;
        int totalSalary;
        int salesLeft;
        if ( sales>10){
            totalSalary=basicSalary+250;
            System.out.println( " Manager gets Bonus! Total month salary is: " + totalSalary);
        }
        else {
            salesLeft =10-sales;
            System.out.println("Manager did not get a bonus this month. " + salesLeft + " Sales are left to get a bonus.");
        }
        System.out.println( "BYE");


    }
}
