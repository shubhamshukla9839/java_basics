package assignment.object_oriented;

public class text2 {

    public text2(int a)
    {
        System.out.println(" with one parametes constructor"+a);
    }
    public text2(int a,int b)
    {
        System.out.println(" with 2 parametes constructor"+ a+""+b);
    }
    public text2(int a,int b,int c)
    {
        System.out.println(" with 3 parametes constructor"+a+" "+b+""+c);
    }
    public text2(){  }    // becouse when you make ob then compiler confused

    void show(int a)
    {
        System.out.println(" int "+a); // always call lowest size 
    }
    void show(long b)
{
    System.out.println(" long "+b);
}


public static void main(String[] args)
{
    text2 ob =new text2();
    ob.show(123);              
    text2 obc1=new text2(1);   // for invoke constructor this is one way 
    text2 obc2=new text2(1,2);

}
   
}
