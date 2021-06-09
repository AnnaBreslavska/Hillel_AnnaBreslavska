package Homework_10;

public class Task2 {
    public static void main(String[] args) {
        String inputString = "Hello from the other side";
        System.out.println(withoutFirstAndLastChar(inputString));
    }

    public static String withoutFirstAndLastChar(String inputString) {
        String stringWithoutFirstAndLastChar = "";
        try {
            stringWithoutFirstAndLastChar = inputString.substring(1, inputString.length() - 1);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Input string cannot be empty!");
        }
        return stringWithoutFirstAndLastChar;
    }
}
