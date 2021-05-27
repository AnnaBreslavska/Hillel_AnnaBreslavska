package Homework_6.Task1;



public class SalaryCalculation {
    public static void main(String[] args) {


        SalesAgentSalary salesAgentSalaryWithoutProbation= new SalesAgentSalary (160, 10,1,22,1500);
        SalesAgentSalary salesAgentSalaryWithProbation = new SalesAgentSalary(170,10);

        System.out.println("Your salary without Probation Period: "  + salesAgentSalaryWithoutProbation.getSalary());
        System.out.println("Your salary with Probation Period: " + salesAgentSalaryWithProbation.getSalary());



    }
}
