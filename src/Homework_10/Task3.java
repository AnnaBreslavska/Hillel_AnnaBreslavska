package Homework_10;

public class Task3 {
    public static void main(String[] args) {
        String inputString = "Java";
        System.out.println(repeatRepeatRepeat(inputString));

    }
    public static String repeatRepeatRepeat(String inputString ) {
        String repeatString;
        if (inputString.length()<=3){
            repeatString=inputString;
        } else {
            char[] inputStringChar = inputString.toCharArray();
            char[] firstThreeSymbols = {inputStringChar[0], inputStringChar[1], inputStringChar[2]};
            String b = new String(firstThreeSymbols);
            repeatString=b+b+b;
        }
        return repeatString;
    }
}
