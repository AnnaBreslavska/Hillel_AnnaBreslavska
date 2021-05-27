package Lesson5;

public class HiThere {
    public static void main(String[] args) {
        printTheName( "AQA's");
        printTheName( "Guys");
        printTheName( "Boys");

    }
    static void  printTheName (String name) {
        System.out.println( "Hello " + name);
    }
    // каждый объект-метод должен отвечать за одно действие. Метод возвращает ОДНО значение.
}
