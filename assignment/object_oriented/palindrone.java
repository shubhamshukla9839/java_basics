package assignment.object_oriented;

import java.util.Scanner;

public class palindrone {

    void palindrone(int a)
    {
        int n=a;
        int x=0;
        while(a>0)
        {
            int u=a%10;
            x=x*10+u;
            a=a/10;
        }
        if(x==n)
        {
            System.out.println("it is palindrone num");
        }
        else{
            System.out.println( "not a palindrone num");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("enter number ");
        Scanner reader=new Scanner(System.in);
        int r=reader.nextInt();
         palindrone obj=new palindrone();
         obj.palindrone( r);
         


    }
    
}