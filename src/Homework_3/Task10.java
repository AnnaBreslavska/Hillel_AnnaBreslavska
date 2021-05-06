package Homework_3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        //10. Написать метод, используя switch, который принимает в себя номер пальца -
        //переменную типа int и в зависимости от номер выводит название пальца (1-”большой”
        //и т д)

        System.out.println( " Enter Number of a finger:");
        Scanner scanner = new Scanner(System.in);
        int fingerNumber = scanner.nextInt();
        String finger;
        switch (fingerNumber) {
            case 1:
                finger="Thumb";
                break;
            case 2:
                finger="Forefinger";
                break;
            case 3:
                finger="Middle finger";
                break;
            case 4:
                finger="Ring finger";
                break;
            case 5:
                finger="Little finger";
                break;
            default:
                finger="Please, enter number from 1 to 7 to get a finger name.";
        }
        System.out.println( finger);
        System.out.println( "BYE");
    }

}
