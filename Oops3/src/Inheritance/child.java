package Inheritance;

public class child extends Parent {
    double weight;

    public child(double length, double height, double width, double weight) {
        //The super keyword calls the parent class constructor
        //It is used to initialize values present in parent class
        super(length, height, width);
        this.weight = weight;
    }
        /*
        We can use the super keyword directly also
       Suppose we also have a same nane variable in parent class too
       and we want to access that one not the one in class we ue super then
       ex - let there are weight too in parent and we want to access that one only.... get it

        System.out.println(super.height);
         */

    public child() {
        super();
        this.weight = weight;
    }
    child(child old){
        super(old);
        this.weight = old.weight;
    }
}
