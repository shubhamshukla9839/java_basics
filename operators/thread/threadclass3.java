package operators.thread;

public class threadclass3 implements Runnable {
    String name;
    Thread t;

    threadclass3(final String tname) {
        name = tname;
        t = new Thread(this, name);
        System.out.println(t);
    }

    @Override
    public void run() {

        for (int i = 0; i < 4; i++) {
            System.out.println("secound " + i);
        }

    }

    public static void main(final String[] args)

    {
        final threadclass3 tc1 = new threadclass3("2");
        // final threadclass3 tc2 = new threadclass3("2");
        // final threadclass3 tc3 = new threadclass3("3");
        // tc1.t.start();
        tc1.t.start();
        try {
            tc1.t.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        /*
         * try { tc1.t.join(); } catch (InterruptedException e) { e.printStackTrace(); }
         * tc2.t.start(); tc3.t.start();
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("main" + i);
        }
        
    }
}
