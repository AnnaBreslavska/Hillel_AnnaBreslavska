package Homework_6.Task1;

import static Homework_5.Task2.workedHours;
import static Homework_5.Task2.seniority;
import static Homework_5.Task2.bonus;
import static Homework_5.Task2.salesBonus;

public class SalesAgentSalary {
    private int hours;
    private int rateInHour;
    private int experience;
    private int salesAmount;
    private double salesTotalSum;
    private double salary;


    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public SalesAgentSalary(int hours, int rateInHour, int experience, int salesAmount, double salesTotalSum) {
        this.hours = hours;
        this.rateInHour = rateInHour;
        this.experience = experience;
        this.salesAmount = salesAmount;
        this.salesTotalSum = salesTotalSum;
        setSalary((workedHours(hours, rateInHour) * seniority(experience) )+ bonus(salesAmount) + salesBonus(salesTotalSum));
    }

    public SalesAgentSalary(int hours, int rateInHour) {
        this.hours = hours;
        this.rateInHour = rateInHour;
        setSalary( workedHours(hours, rateInHour));
    }
}
