
public class Furniture {
    //свойства. приватные переменные
    private double weight = 68;
    private String color;
    private int height;

    public Furniture(double weight, String color, int height) {
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        String result = "A piece of furniture is " + color + " and its dimensions are " + height + " by " + weight;
        return result;
    }
}
