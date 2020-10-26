package assignment.object_oriented;
import java.lang.*;
import java.util.Scanner;

public class armstrong {

    void armstrong(int a){
        
       int sum=0;  int n=a;
       int b=a;
       int c=0;
       while(n>0)  {
          n=n/10;
          c=c+1;  }
       int p=a;
       System.out.println("size"+c);
       for(int i=1;i<=c;i++) {
         int q=p%10;
         int t= (int) Math.pow(q, c);
          sum=sum+t;
          p=p/10;  }
       if(sum==a)
           System.out.println("it is armstrong ");  
       else 
          System.out.println("it is not armstrong");}
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        int y=reader.nextInt();
        armstrong obj=new armstrong();
        obj.armstrong(y);
    }}