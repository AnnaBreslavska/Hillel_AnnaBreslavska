package Homework_3;

import java.util.Scanner;

public class Task9 {
    //9. Получение ипотеки
    //Имеем 2 переменные - возраст мужа и жены
    //Написать программу, которая выводит в консоль результат.
    //Задачу решить используя вложенный if (сначала проверить возраст жены, потом мужа)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Wife's age:");
        int wifeAge = scanner.nextInt();
        System.out.println(" Enter Husband's age:");
        int husbandAge=scanner.nextInt();
        System.out.println(" Do you want to get a credit? (True/False) ");
        boolean credit = scanner.nextBoolean();
        if (credit){
            if ( wifeAge<=35 & husbandAge<35){
                System.out.println( "Credit is Approved.");
            }
            else
                System.out.println( " Credit is not Approved.");
        }
        System.out.println( "BYE!");
    }
}