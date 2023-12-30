package Inheritance;

public class Parent {
    double length;
    double height;
    double width;

    Parent(double length, double height, double width) {
        super();
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Parent(){
        this.height = -1;
        this.length = -1;
        this.width = -1;

    }
    Parent(double side) {
        this.length = side;
        this.height = side;
        this.width = side;
    }

    Parent(Parent old) {
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }
}
