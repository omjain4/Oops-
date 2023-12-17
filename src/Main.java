import java.util.Scanner;

// Mainly about Classes and object with "this" function and "." feature also "Final" keyword and garbage dump
// which I have skipped in this code go watch kunal oops 1 notes aur notes
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollnum = input.nextInt();
        String naam = input.next();
        float marks = input.nextFloat();

        Student om = new Student(rollnum, naam, marks);
//        System.out.println(om.rollno);
//        System.out.println(om.name);
//        System.out.println(om.marks);

//        Student random = new Student();
//        System.out.println(random.rollno);
//        System.out.println(random.name);
//        System.out.println(random.marks);

        Student random2 = new Student(om);
        System.out.println(random2.rollno);
        System.out.println(random2.name);
        System.out.println(random2.marks);

      final A harry = new A("Om Jain");
        harry.name = "Kuch aur dal do";// Aise change kar sakte hai final keyword mein
        //harry = new A("naya object"); Lekin aisa nahi kar sakte
    }
}
class Student{
    int rollno;
    String name;
    float marks;
    Student(){
     this(0, "Default", 0.00f);
    }
    Student(int rollnum,String naam, float marks){
       this.name = naam;
       this.marks = marks;
       this.rollno = rollnum;
    }
    Student( Student other){
        this.name = other.name;
        this.marks = other.marks;
        this.rollno = other.rollno;

    }
    }

    class A{
        String name;
  A(String name){
        this.name= name;
    }
    }

