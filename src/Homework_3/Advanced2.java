package Homework_3;

import java.util.Scanner;

public class Advanced2 {
    //2.Известны площади круга и квадрата. Определить: уместится ли круг в квадрате
    //уместится ли квадрат в круге
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter area of a square:");
        int areaSquare = scanner.nextInt();
        System.out.println( " Enter area of a circle:");
        int areaCircle = scanner.nextInt();
        double pi = 3.14;
        double sideOfSquare = Math.sqrt(areaSquare);
        double dCircle = 2 * Math.sqrt(areaCircle/pi);
        double dSquare = Math.sqrt(areaSquare) * sideOfSquare;
        if ( sideOfSquare>=dCircle){
            System.out.println( "Круг помещается в квадрат.");
        }
        else
            System.out.println( "Круг не помещается в квадрат.");
        if ( dCircle>=dSquare){
            System.out.println(" Квадрат помещается в круг");
        }
        else
            System.out.println( " Квадрат не помещается в круг");
    }

}


