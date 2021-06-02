package Homework_7.Task1;

public class JuiceMarket {
    public static void main(String[] args) {
        Apple Apple = new Apple();
        System.out.println("Каллорий в яблоке: " + Apple.getCalories());
        Apple.cutApple();
        Apple.makeJuice();

        Banana Banana = new Banana();
        System.out.println("Каллорий в банане: " + Banana.getCalories());
        Banana.peelBanana();
        Banana.makeJuice();

        Lemon Lemon = new Lemon();
        System.out.println("Каллорий в лимоне: " + Lemon.getCalories());
        Lemon.squeezeLemon();
        Lemon.makeJuice();

        Orange Orange = new Orange();
        System.out.println("Каллорий в апельмине:  " + Orange.getCalories());
        Orange.removeSeeds();
        Orange.makeJuice();



    }



}
