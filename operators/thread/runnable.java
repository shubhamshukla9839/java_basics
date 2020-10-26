package operators.thread;

public class runnable implements Runnable {

    boolean isrun;
    String t;

     public void runnable( String t) {
        this.t = t;
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

        final runnable tl1 = new runnable ("t1");
          final runnable tl2 = new runnable("t2");
        tl1.isrun=true;
        tl2.isrun=true;
        tl1.start();
        System.out.println("thread is working");
        Thread.sleep(6000);
        tl2.start();
        tl1.isrun=false;
    }

	
    
}
    

    
}