package Polymorphism;

public class Main {
    public static void main(String[] args) {
     Shapes one = new Shapes();
     Sqaure two = new Sqaure();
     Circle three = new Circle();
     Triangle four = new Triangle();

        one.area();
        two.area();
        three.area();
        four.area();
     //Act of representing same name in multiple ways.
        //Here Void area is represented in multiple ways it's an example for polymorphism
    // There are 2 types of ex. for this
    /*
    1. (Method Overloading)Static/Compile time ---
    Early Binding
    Example for this is Parents and Inheritance.child
    same name Inheritance.Parent but different parameters are passed
    which constructor to use or which one to use happens at compile time
     that's why it is known as compile time polymorphism

     2. Method Overriding or Runtime/Dynamic ---
     (Late Binding)
     Example is of shapes.
     void area() is being overridden by Inheritance.child classes
     when name/parameters and return type are same but body is different from it in this case,
     it can also be checked by writing @override above that method

     The Final keyword is also used for the method which cannot be overridden
     Also Static methods cannot be overridden
     As overriding depends on objects of the class and static stuff do not.
     */

    }
}
