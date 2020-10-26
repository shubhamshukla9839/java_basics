package assignment.object_oriented;

 public class Method
{
    int z;
   public void addition(int x,int y)
   {
       z=x+y;
       System.out.println( +z);
   }
   public void substraction(int x,int y)
   {
       z=x-y;
       System.out.println(+z);
   }
}
public class My_calculations extends Method
{
    public void multiplication(int x,int y)
    {
        z=x*y;
        System.out.println( +z);
    }
    public static void main(String [] args)
    {
        int a=20,b=10;
        My_calculations demo=new My_calculations();
        demo.addition(a,b);
        demo.substraction(a,b);
        demo.multiplication(a,b);
    }

    
}
