package Homework_4;

public class Task6 {
    //Написать программу, которая подсчитывает количество элементов массива int*ов,
    //которые делятся на 2, но не делятся на 3 и выводит в консоль
    public static void main(String[] args) {
        int [] numbers = {10, 30, 15, 20, 12};
        int count=0;
        for ( int i =0; i<numbers.length; i++){
            if (numbers[i] % 2==0 &&  numbers[i] % 3 !=0 ){
                //System.out.println( "The number is divided into 2, but not divided into 3: " + numbers[i]);
                count++;
            }
        }
        System.out.println( "The Count of the numbers that are divided into 2, but not divided into 3: " + count);
    }
}
