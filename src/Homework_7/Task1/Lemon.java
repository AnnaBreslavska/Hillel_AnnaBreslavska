package Homework_7.Task1;

public class Lemon extends Fruit {

    public void squeezeLemon() {

        System.out.println("Лимон выжымается...");
    }
    public Lemon (){
        super(35);
    }

    @Override
    public void makeJuice() {
        System.out.println("Изготавливается лимонный сок...");
    }
}
