package Homework_3;

import java.util.Scanner;

public class PrintNumberInWordIF {
    ///3.Написать программу с названием “PrintNumberInWord”, которая напечатает “ONE”,
    //“TWO”, …, “NINE”, “OTHER” если переменная “number” типа int будет 1, 2, 3, 4, … 9, или
    //любой другой
    //. Решить задачу двумя способами: 1) с использованием if..else if 2) с использованием
    //switch-case
    public static void main(String[] args) {
        System.out.println( " Enter Number to Print it in Word from 1 to 10:");
        Scanner scanner = new Scanner(System.in);
        int number =  scanner.nextInt();
        if ( number == 1){
            System.out.println( "ONE");
        }
        else if (number == 2) {
            System.out.println("TWO");
        }
        else if (number ==3){
            System.out.println( "THREE");
        }
        else if (number == 4){
            System.out.println( "FOUR");
        } else if (number == 5) {
            System.out.println("FIVE");
        }
        else if (number == 6){
            System.out.println("SIX");
        }
        else if ( number ==7){
            System.out.println("SEVEN");
        }
        else if (number == 8){
            System.out.println("EIGHT");
        }
        else if (number == 9){
            System.out.println("NINE");
        }
        else if (number ==10) {
            System.out.println("TEN");
        }
        else if (number >10) {
            System.out.println( "Please, enter number from 1 to 10.");
        }
        else if (number == 0){
            System.out.println("Please, enter number from 1 to 10.");
        }
        System.out.println( "DONE");
        }
    }
