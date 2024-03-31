public class Consumer implements Runnable{
    Company c;
    Consumer(Company c)
    {
        this.c=c;
    }

    public void run() {
        while(true)
        {
            try {
                this.c.consume_item();
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }



        }
    }
}
