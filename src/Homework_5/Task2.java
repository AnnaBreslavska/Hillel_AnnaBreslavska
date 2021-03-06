package Homework_5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the Working Hours:");
        int hoursInput = scanner.nextInt();
        System.out.println(" Enter rate:");
        int rateInput = scanner.nextInt();
        System.out.println(" Enter your seniority:");
        int workingYearsInput = scanner.nextInt();
        System.out.println(" Enter how many Sales was performed this month:");
        int numberSalesBonus = scanner.nextInt();
        System.out.println(" Enter total sum of sales:");
        int amountSalesBonus = scanner.nextInt();

        double salary = (workedHours(hoursInput, rateInput) * seniority(workingYearsInput) )+ bonus(numberSalesBonus) + salesBonus(amountSalesBonus);
        System.out.println("Your salary is: " + salary);


    }

    //1
    public static double workedHours(int hours, int rate) {
        double totalForHours=hours*rate;
        if (hours >= 160) {
            double workOver = 1.5 * (hours - 160);
            totalForHours = (160 + workOver) * rate;
        }
        return totalForHours;
    }

    //2
    public static double seniority(int workingYears) {
        double seniorityRate = 0;
        if (workingYears < 2) {
            seniorityRate = 1;
        } else if (workingYears >= 2) {
            seniorityRate = 1.2;
        } else if (workingYears >= 4) {
            seniorityRate = 1.3;
        } else if (workingYears >= 6) {
            seniorityRate = 1.4;
        }
        return seniorityRate;
    }

    //3
    public static double bonus(int salesAmount) {
        double bonusTotal = 0;
        if (salesAmount >= 20) {
            bonusTotal = 250;
        } else if (salesAmount <= 10) {
            bonusTotal = -150;
        }
        else if (salesAmount>10 &&salesAmount<20){
            bonusTotal=0;
        }
        return bonusTotal;
    }

    //4
    public static double salesBonus(double sumOfSales) {
        double salesBonus;
        if (sumOfSales >= 15000) {
            salesBonus = 250;
        } else {
            salesBonus = 0;
        }
        return salesBonus;
    }

}

