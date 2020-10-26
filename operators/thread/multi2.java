package operators.thread;

public class multi2 extends Thread {

    public void run(){

        for(int i=1;i<=5;i++)
        {
            try{

                Thread.sleep(1000);

            }

            catch(final Exception e){ System.out.println("exceptio occures");

            }

            System.out.println(i);
        }
    }

    public static void main(final String args[])
    {
         final multi2 t1=new multi2();
         System.out.println(" "+t1.getPriority());
         final multi2 t2=new multi2();
         System.out.println(" "+t1.getPriority());
         t1.start();
         t2.start();
    }
    
}
