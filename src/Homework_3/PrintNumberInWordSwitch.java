package Homework_3;

import java.util.Scanner;

public class PrintNumberInWordSwitch {
    ///3.Написать программу с названием “PrintNumberInWord”, которая напечатает “ONE”,
    //“TWO”, …, “NINE”, “OTHER” если переменная “number” типа int будет 1, 2, 3, 4, … 9, или
    //любой другой
    //. Решить задачу двумя способами: 1) с использованием if..else if 2) с использованием
    //switch-case
    public static void main(String[] args) {
        System.out.println( " Enter Number from 1 to 10 to Print it in Word:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numberInWord;
        switch (number) {
            case 1:
                numberInWord="ONE";
                break;
            case 2:
                numberInWord="TWO";
                break;
            case 3:
                numberInWord="THREE";
                break;
            case 4:
                numberInWord="FOUR";
                break;
            case 5:
                numberInWord="FIVE";
                break;
            case 6:
                numberInWord="SIX";
                break;
            case 7:
                numberInWord="SEVEN";
                break;
            case 8:
                numberInWord="EIGHT";
                break;
            case 9:
                numberInWord="NINE";
                break;
            case 10:
                numberInWord="TEN";
                break;
            default:
                numberInWord="Please, enter number from 1 to 10.";
        }
        System.out.println( numberInWord);
        System.out.println( "BYE");
        }

}
