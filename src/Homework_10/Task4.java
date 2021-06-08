package Homework_10;

public class Task4 {
    public static void main(String[] args) {
        String inputString = "Cat";
        System.out.println(backAround(inputString));
    }

    public static String backAround(String inputString) {
        char[] inputStringChar = inputString.toCharArray();
        char firstChar = inputStringChar[0];
        char lastChar = inputStringChar[inputStringChar.length - 1];

        String backAround = firstChar + inputString + lastChar;
        return backAround;
    }
}
