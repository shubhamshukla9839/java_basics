package assignment.object_oriented;

public class recursion {
   int x=1;
    
   int fact(int n)
    {
        if(n==1)
          return n;

         else 
           n=n*fact(n-1);
      return n;
    }

    public int n1=0;
    public int  n2=1;
     public int n3=0;
    void printfebonacci(int n)
    {
        if (n>0)
        {
        n3=n1+n2;
        n1=n2;
        n2=n3;
        System.out.print(" "+n3);
        printfebonacci(n-1);}
    }


   public static void main(String[] args) 
  {
        recursion obj =new recursion();
       int a= obj.fact(5);
       System.out.println(a);
       System.out.print(0 +" "+ 1);
       obj.printfebonacci(5);

  }
}
    
