package Homework_7.Task1;

public class Orange extends Fruit {

    public void removeSeeds() {

        System.out.println("Косточки из апельсина удаляются...");
    }

    public Orange() {

        super(10);
    }

    @Override
    public void makeJuice() {
        System.out.println("Изготовляется апельсиновый сок...");
    }
}
