package java8;

public class a3 {
                   // functional interface means interface having only on method
    public static void main(String[] args)
    {
        //  myrunable newrun=new myrunable();
      Runnable newrun=()->System.out.println("thread is running");   // lambda expression
        
      Thread t=new Thread(newrun);
        t.start();
    } 
}
   /* class myrunable implements  Runnable  
    {
        public void run(){
           // System.out.println("thread running");
        }
    }
    */
