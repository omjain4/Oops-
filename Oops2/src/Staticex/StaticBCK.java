package Staticex;

public class StaticBCK {
    public static void main(String[] args) {
        System.out.println("I am inside the main method ");
        StaticBCK lol = new StaticBCK();
        lol.funnnyyy2();
    }
    static void message(){
       // funny();
        /* The reason why the funny method is not called in the above sentence because
        Non-Static stuff cannot be called inside static stuff
        Either can it static or create an Object of that
        The Main reason of this is because non-static things have an instance of the class
        For - ex we have seen in the main file "Om and harry" wee instances of the class manusya
        and static stuff do not have instances we have seen with Manusya.population
         */
        StaticBCK object = new StaticBCK();
        object.funny();
        /*
        Now that we have created the object we can add it inside the static stuff
         */
    }
    void funny(){
        message();
        //We can add static stuff in non-static bcz they do not limit themselves
        System.out.println("Have funnn guyzzz ");
    }
    void funnnyyy2(){
        /*
        We can also add non-static stuff inside the non-static because we know at the end inside
        the main method the object of this will be created so indirectly the non-static stuff inside
        will also have an object
        As in line number 7 object of funnnyyy 2 is created which can also be used by funny
         */
        funny();
    }
}
