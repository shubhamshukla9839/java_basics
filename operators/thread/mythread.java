package operators.thread;

public class mythread extends Thread {
    boolean isrun;
    String t;
 
    public mythread(final String string) {
        this.t = string;
    }

    @Override
    public void run() {
        int i = 0;
        while (isrun) {
            System.out.println("thread  is    "+this.t + i);
            try {
                Thread.sleep(1000);
            } catch (final InterruptedException e1) {

                e1.printStackTrace();
            }
            i++;
        }

    }

    public static void main(final String[] args) throws InterruptedException {

        final mythread th1 = new mythread("t1");
        final mythread th2 = new mythread("t2");
        th1.isrun=true;
        th2.isrun=true;
        th1.start();
        System.out.println("thread is working");
        Thread.sleep(6000);
        th2.start();
        th1.isrun=false;
    }
    
}