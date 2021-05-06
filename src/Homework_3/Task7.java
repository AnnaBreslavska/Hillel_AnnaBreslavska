package Homework_3;

import java.util.Scanner;

public class Task7 {
    // Написать программу, для расчёта зарплаты менеджера по продажам. Если
    //менеджер совершил более 10 продаж он получает бонус 250$. Базовая ставка 1000$.
    public static void main(String[] args) {
        System.out.println(" Enter count of manager's sales");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        int basicSalary = 1000;
        int totalSalary;
        totalSalary = sales >= 10 ? basicSalary + 250 : basicSalary;
        System.out.println("Manager's month salary is " + totalSalary);
        System.out.println( "BYE");
    }
}
