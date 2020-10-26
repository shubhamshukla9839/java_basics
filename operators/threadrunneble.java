package operators;

public class threadrunneble implements Runnable {

    boolean isrun;
    String t;


     public threadrunneble(String t) {
        this.t = t;
    }

    @Override
    public void run() {
      display();

    }
    void display() {
        int i = 0;

        while(i<=10){

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

         Thread tl1 = new Thread("t1");
          final Thread tl2 = new Thread("t2");
        tl1.start();
        tl2.start();
        System.out.println("thread is working");
        Thread.sleep(6000);

        threadrunneble r =new threadrunneble("runnable");
        Thread t= new Thread(r);
    
        t.start();
        
    }




	
    
}
    
