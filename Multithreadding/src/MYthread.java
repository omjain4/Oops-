import static java.lang.Thread.sleep;

public class MYthread extends Thread{
    @Override
    public void run(){
        for (int i = 10; i >= 0; i--) {
            System.out.println("thread 1 :" + i );
            try {
                Thread.sleep(1000); // try catch or throws Interrupted Exception anyone one should be present
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
       }
        System.out.println("Finished thread 1");
    }
}
