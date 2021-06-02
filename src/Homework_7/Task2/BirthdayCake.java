package Homework_7.Task2;

public class BirthdayCake extends Cake {
    int candles;

    public BirthdayCake() {
        super("Tasty", 500);
        setCandles(26);
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
    public void BDCake (){
        System.out.println("BD Cake method");
    }


}

