package Lesson5;

public class isOddOrEven {
    public static void main(String[] args) {
        boolean isIntegerEven = isEven(11);
        System.out.println("Integer is Even: " + isIntegerEven);
    }
    static boolean isEven(int input){
      boolean isParameterEven = input % 2 ==0;
      return isParameterEven;
    }
}
