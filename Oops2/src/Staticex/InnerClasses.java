package Staticex;

public class InnerClasses { // Outside class like this cannot be created as Static
    static class Test{ // We have to create this as static so to use this in main file
        //As this is inside another class that's why we are creating as static
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test A = new Test("Om");
        Test B = new Test("Harry");
        System.out.println(A.name);
        System.out.println(B.name);
        //Class Test is static but the output is different not same as seen in population is
        //bcz the static here means it will not depend upon the objects of the outer class
        //here that is InnerClasses , But it can have it's own object.
    }
}
