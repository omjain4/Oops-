package Staticex;

public class Manusya {
    int age;
    String naam;
    int tankaah;
    boolean student;
    static long population;
    /*
    Now Static things do not depend upon the object they directly deal business with the class
    The things which are common to all the objects of the class are declared as static
    Or such properties which are not directly related to the objects of the class
    Static methods belongs to the class not to the object
    */
    static void message(){
        System.out.println("Hello Manusya");
    }
    public Manusya(int age, String naam, int tankaah, boolean student) {
        this.age = age;
        this.naam = naam;
        this.tankaah = tankaah;
        this.student = student;
        Manusya.population += 1;//As static things are not related to the object
        // to access static variables you should just use the class name
        //You can also use the "This" Keyword but class name makes more sense
        Manusya.message();
    }
}

