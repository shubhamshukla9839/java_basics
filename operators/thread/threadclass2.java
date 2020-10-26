package operators.thread;

public class threadclass2 extends Thread {

    threadclass2(){
        super("new thread");   // thread name 
    }

    public void run(){
        System.out.println("thread is running");

    }

     public static void main(String[] args) {
         threadclass2 tc=new threadclass2();
         tc.start();
        
    }
    
}
