package Homework_7.Task2;

public class WeddingCake extends Cake {
    int tier;

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public WeddingCake() {

        super("Delicious", 150.50);
        setTier(3);
    }

}
