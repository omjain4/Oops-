package Main;

import OtherOne.Protected;
import OtherOne.Public;

public class Main {
    public static void main(String[] args) {
        Public one = new Public(4, "Om Jain");
        System.out.println(one.num+ "," +one.name);

//        Protected two = new Protected(4, "Om jain");
//        System.out.println(two.num1+","+two.naam);
//   protected cannot be used in different package without subclass
        //If it ia subclass it can be used in different package also

        Nothing three = new Nothing(6,"Om Jain");
        System.out.println(three.num2+","+ three.name);
        //If there is nothing than it can only be accessed in that package only.

        Private four = new Private(56,"Om");
        System.out.println(four.getNum3());
        four.setNum3(46);
        System.out.println(four.getNum3());

        //There are ways to get private things in other class
        //Getter and setter method for getting and setting the values of the private stuff.
    }
}
