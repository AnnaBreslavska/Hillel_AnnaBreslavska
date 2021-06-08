package Homework_10;

public class Task2 {
    public static void main(String[] args) {
        String inputString = "Hello from the other side";
        System.out.println(withoutFirstAndLastChar(inputString));
    }

    public static String withoutFirstAndLastChar(String inputString) {

        char[] inputStringChar = inputString.toCharArray();
        int stringEnd = inputStringChar.length -1;
        int stringStart = inputStringChar.length - inputStringChar.length +1;


        String stringWithoutFirstAndLastChar = inputString.substring(stringStart, stringEnd) ;

        return stringWithoutFirstAndLastChar;
    }
}
