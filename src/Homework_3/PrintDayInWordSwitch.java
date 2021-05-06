package Homework_3;

import java.util.Scanner;

public class PrintDayInWordSwitch {
    //4.Написать программу с названием “PrintDayInWord”, которая печатает “Sunday”,
    //“Monday”, …. “Saturday”, если переменная “day” типа int будет 1, 2, 3, 4 … 7. В
    //противном случае программа должна вывести “Not a valid day”. Решить задачу двумя
    //способами: 1) с использованием if..else if 2) с использованием switch-case
    public static void main(String[] args) {
        System.out.println( " Enter Number from 1 to 7 to Print Day of the Week:");
        Scanner scanner = new Scanner(System.in);
        int day =  scanner.nextInt();
        String weekDay;
        switch (day){
            case 1:
                weekDay="Monday";
                break;
            case 2:
                weekDay="Tuesday";
                break;
            case 3:
                weekDay="Wednesday";
                break;
            case 4:
                weekDay="Thursday";
                break;
            case 5:
                weekDay="Friday";
                break;
            case 6:
                weekDay="Saturday";
                break;
            case 7:
                weekDay="Sunday";
                break;
            default:
                weekDay= "Not a valid day";
                break;
        }
        System.out.println( weekDay);
        System.out.println( "BYE");
    }
}