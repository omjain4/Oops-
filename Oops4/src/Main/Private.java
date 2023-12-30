package Main;

public class Private {
    private int num3; //Private things can only be accessed in same class only.
    String name;

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public Private(int num3, String name) {
        this.num3 = num3;
        this.name = name;
    }
}
