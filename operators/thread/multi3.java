package operators.thread;

public class multi3 implements Runnable {

    public void run(){
        System.out.println("thrad is running ");
    }
     public static void main(String[] args) {
         multi3 m1=new multi3();
         Thread t=new Thread(m1);
         t.start();
        
    }
    
}
