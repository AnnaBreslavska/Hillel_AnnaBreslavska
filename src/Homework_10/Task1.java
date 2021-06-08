package Homework_10;


public class Task1 {
    public static void main(String[] args) {
        String inputString = "Get a modern feel with a smudge-resistant only for $2.50, you can finish now";
        System.out.println(afterFeelInUpperCase(inputString));
    }


    public static String afterFeelInUpperCase(String inputString) {
        String[] arrayString = inputString.split("\\s");
        String stringInUpperCase=" ";

        for (int i = 0; i < arrayString.length; i++) {
            String currentWord = arrayString[i];
            if (currentWord.equals("feel")) {
                i++;
                stringInUpperCase=arrayString[i];
            }
        }
        return stringInUpperCase.toUpperCase();
    }
}
