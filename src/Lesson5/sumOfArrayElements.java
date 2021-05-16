package Lesson5;

public class sumOfArrayElements {
    public static void main(String[] args) {
        int [] testArray = {25, 5};
        System.out.println( "Sum of input array is: " + sumOfArrayElement (testArray));
    }
    static int sumOfArrayElement(int[]arrayOfInt){
        int sum = 0;
        for (int elementOfArray : arrayOfInt){
            sum = sum + elementOfArray;
        }
        return sum;
    }

}
