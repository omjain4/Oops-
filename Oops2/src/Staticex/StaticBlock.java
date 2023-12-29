package Staticex;

public class StaticBlock {
    static int a = 24;
    static int b;

    static {
        //Now this print statement or static thing will only run only
        // i.e. when the first object is created or when the class is
        //loaded for the first time which means the same thing
        System.out.println("Hey! I am inside the static block");
        b = a*3;
    }

    public static void main(String[] args) {
        StaticBlock object = new StaticBlock();
        System.out.println(StaticBlock.a + "  " + StaticBlock.b);
        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + "  " + StaticBlock.b);
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + "  " + StaticBlock.b);
    }
}
