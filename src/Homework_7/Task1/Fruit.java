package Homework_7.Task1;

public class Fruit {
    private int calories;

    public Fruit(int calories) {
        this.calories = calories;
        setCalories(calories);
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void makeJuice() {
        System.out.println("Сок сделан.");
    }

}
