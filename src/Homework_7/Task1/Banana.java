package Homework_7.Task1;

public class Banana extends Fruit {

    public void peelBanana() {

        System.out.println("Банан чиститься...");
    }

    public Banana() {
        super(70);
    }

    @Override
    public void makeJuice() {
        System.out.println("Изготавливается банановый смузи...");
    }
}
