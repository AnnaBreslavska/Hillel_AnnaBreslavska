package Homework_3;

import java.util.Scanner;

public class Advanced1 {
    //1.Сумма покупки составляет а рублей. Если а больше 1000 рублей, то предоставляется
    //скидка 15%. Вывести на экран сумму покупки с учетом скидки либо сообщение о том,
    //что скидка не предоставляется.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the Total of your purchase:");
        double purchaseSum = scanner.nextDouble();
        double totalPurchase;
        int discount=15;
        if ( purchaseSum>1000){
            totalPurchase=purchaseSum - (purchaseSum*15)/100;
            System.out.println( " Your Total is " + totalPurchase + " with 15% discount. Enjoy!");
        }
        else
            System.out.println( " No money no honey.");

    }
}
