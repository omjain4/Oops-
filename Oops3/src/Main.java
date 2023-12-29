
public class Main {
    public static void main(String[] args) {
        child one = new child(4,5,6,8);
        System.out.println(one.length+","+one.height+","+one.width+","+ one.weight);


        Parent three = new Parent(4,5,6);
        System.out.println(three.length+","+three.height+","+three.width);

     /*
     The reference variable is of type Parent class but the object is of type child.
     In this case,it will only be able to access what's in parent class
     Here it will not be able to access weight as it is in child class
     It will initialize, but we cannot get or print if it's out of reach for the reference variable,
     So what can be accessed will be depended upon the reference variable not on the type of the object.


        Parent four = new child(4,5,6,6);
        System.out.println(four.length+","+four.height+","+four.width+","+ four.weight);

     Also, we cannot create an object of a parent using the reference variable of a child class

     Child five = new Parent(89989,887,87);

     Finally, there are many variables in both parent and child classes
     you are given access to variables there are in the reference type i.e., child
     hence, you should have access to weight variable
     this also means that the ones you are trying to access should be initialized
     but here when the obj itself is of the type parent class, how will you call the constructor
     of the child class
      */

        Grandchid six = new Grandchid(2,3,4,3,4);
        Grandchid seven = new Grandchid(six);
        System.out.println(seven.length+","+seven.height+","+seven.width+","+ seven.weight+","+seven.cost);
    }
}