package Homework_7.Task1;

public class Apple extends Fruit {

    public void cutApple() {
        System.out.println("Яблоко нарезается...");
    }

    public Apple() {
       super(55);
    }

    @Override
    public void makeJuice() {
        System.out.println("Изготавливается яблочный сок..");
    }
}
