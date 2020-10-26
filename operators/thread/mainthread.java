package operators.thread;

public class mainthread {

    public static void main(String[] args)
    
    {

        Thread t=new Thread();
        t.setName("my demo thread");
        System.out.println(""+t.currentThread());    // name priority and group
        System.out.println(t.getName());
        System.out.println(""+t.getThreadGroup());
        System.out.println(""+t.getPriority());

    }
    
}
