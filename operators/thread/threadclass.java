package operators.thread;

import java.util.jar.Attributes.Name;

public class threadclass implements Runnable{

    Thread t;

    threadclass(){

        t=new Thread(this,"new thread");
        System.out.println(t);
    }

    @Override
    public void run() {
        System.out.println(" we are in new thread ");
        

    }
    public static void main(String[] args )
    {
        threadclass tc=new threadclass();
        tc.t.start();

    }
    
}
