package Homework_10.Task5;

public enum Ball {
    FOOTBALL_BALL(55.5, "Football", 49.99, "leather"),
    GOLF_BALL(10, "Golf", 150, "plastic"),
    BASKETBALL(70.7, "Basketball", 30.3, "leather"),
    TABLE_TENNIS(5.5, "Table tennis", 10.5, "plastic"),
    BEACH_BALL(55, "beach games", 45.5, "rubber");

    double size;
    String sportType;
    double price;
    String material;


    Ball(double size, String sportType, double price, String material) {
        this.size = size;
        this.sportType = sportType;
        this.price = price;
        this.material = material;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", sportType='" + sportType + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }
}


