// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {

   //     System.out.println(Thread.currentThread().getName());
//        // naam karankan //
//        Thread.currentThread().setName("Main hu mein bc");
//        System.out.println(Thread.currentThread().getName());
//
//        System.out.println(Thread.currentThread().getPriority());
//        // 10 is the highest priority and 1 is lowest
//        Thread.currentThread().setPriority(10);
//        System.out.println(Thread.currentThread().getPriority());

//        for (int i = 0; i < 10; i++) {
//                Thread.sleep(1000); // try catch or throws Interrupted Exception anyone one should be present
//                System.out.println(i);
//        }

//        MYthread t = new MYthread();
//         MyRunnable runnable = new MyRunnable();
//         Thread t1 = new Thread(runnable);
//
//       t.start();
//
//       t.join();
//       t1.start();

        Company comp=new Company();
        Producer p=new Producer(comp);
        Consumer c=new Consumer(comp);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();


    }
}