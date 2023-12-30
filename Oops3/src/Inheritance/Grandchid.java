package Inheritance;

public class Grandchid extends child {

    double cost;
    public Grandchid(double length, double height, double width, double weight, double cost) {
        super(length, height, width, weight);
        this.cost = cost;
    }

    public Grandchid() {
        super();
        this.cost = -1;
    }

    public Grandchid(Grandchid old) {
        super(old);
        this.cost = old.cost;
    }
}
