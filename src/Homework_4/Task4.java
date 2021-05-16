package Homework_4;

public class Task4<palindrome> {
    //Написать программу, которая проверяет является ли строка палиндромом
    //(используя массив char)
    public static void main(String[] args) {
        char[] palindrome = "noon".toCharArray();
        boolean isEqual=true;
        for (int i = 0, j = palindrome.length-1; i != j && j>i; i++, j--) {
            if (palindrome [i] != palindrome[j]){
                isEqual = false;
                break;
            }
        }
        System.out.println( "If is Equal is true than it's a palindrome: " + isEqual);
    }
}
