package Staticex;

public class Main {
    //Most important static or comman static method is the Main method
    //We want our class to run without making objects of it
    //In other words it should be able to run wit or without the the objects
    //Or It should not depend upon the objects to make it run
    //That's why it is declared as static
    public static void main(String[] args) {
        Manusya Om = new Manusya(22, "Om Jain", 55000, false);
        Manusya Harry = new Manusya(28, "Harry Jain", 165000, true);
        System.out.println(Om.population);
        System.out.println(Harry.population);
        //As there are only 2 objects/ Manusya(hehe) in this case that's why the population is 2
        System.out.println(Manusya.population);
        Manusya.message();
        Om.message();
        //Without creating object also we can ascess the static variable using the class name
        // It shows that it really does not depend upon the objects of the class



    }

}
