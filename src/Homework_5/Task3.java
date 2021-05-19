package Homework_5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter amount of used gigabytes: ");
        int gigabytes = scanner.nextInt();
        System.out.println(" Enter amount of wasted minutes: ");
        int minutes = scanner.nextInt();
        System.out.println(" Enter amount of sms: ");
        int sms = scanner.nextInt();
        System.out.println(" Enter amount of minutes for roaming Zone 1: ");
        int roamingZone1 = scanner.nextInt();
        System.out.println(" Enter amount of minutes for roaming Zone 2: ");
        int roamingZone2 = scanner.nextInt();
        double totalPaymentWithoutTax = internet(gigabytes) + calls(minutes) + messages(sms) + roamingZoneOne(roamingZone1) + roamingZoneTwo(roamingZone2);
        System.out.println( "Yor total without Tax" + totalPaymentWithoutTax);
        double tax = ((totalPaymentWithoutTax / 100) * 7);
        double totalPaymentWithTax = totalPaymentWithoutTax + tax;
        System.out.println("Your total month payment with 7% tax is: " + totalPaymentWithTax + " hrn");
    }

    ////Стоимость интернета до 8гб включена в пакет, после 50 грн / 500 мб (вход
    //параметр кол-во потраченных гб)
    static int internet(int gigabytes) {
        int megabytes = gigabytes * 1000;
        int totalForInternet = 0;
        if (gigabytes > 8) {
            int additionalMegabytes = megabytes - 8000;
            if (additionalMegabytes <= 500) {
                totalForInternet = 50;
            }
            else
                totalForInternet = (additionalMegabytes / 500) * 50;
        }
        return totalForInternet;
    }

    //Звонки по Украине до 500 минут 0,5 грн / мин после 0,75
    static double calls(int minutes) {
        double totalForCalls;
        if (minutes <= 500) {
            totalForCalls = minutes * 0.5;
        } else
            totalForCalls = minutes * 0.75;
        return totalForCalls;
    }

    //Смс до 50 шт 1 грн после 1,50
    static double messages(int messageAmount) {
        double totalMessages;
        if (messageAmount <= 50) {
            totalMessages = messageAmount * 1;
        } else
            totalMessages = messageAmount * 1.5;
        return totalMessages;
    }

    //Звонки за рубеж зона 1: 1.5 грн/мин
    static double roamingZoneOne(int minutes) {
        double totalRoamingZoneOne = minutes * 1.5;
        return totalRoamingZoneOne;
    }

    //Звонки за рубеж зона 2: 2 грн/мин
    static double roamingZoneTwo(int minutes) {
        double totalRoamingZoneTwo = minutes * 2;
        return totalRoamingZoneTwo;
    }
}
