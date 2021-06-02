package Homework_7.Task2;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake BirthdayCake = new BirthdayCake();
        WeddingCake WeddingCake = new WeddingCake();
        System.out.println("Birthday Cake is: " + BirthdayCake.getTaste() + ". It costs: " + BirthdayCake.getPrice());
        System.out.println("Birthday Cake with " + BirthdayCake.getCandles() + " candles on it.");

        System.out.println("Wedding Cake is: " + WeddingCake.getTaste() + ". It costs: " + WeddingCake.getPrice());
        System.out.println("Wedding Cake with " + WeddingCake.getTier() + " tiers.");

    }
}
