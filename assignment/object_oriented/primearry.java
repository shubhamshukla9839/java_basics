package assignment.object_oriented;

import sun.tools.java.Scanner;
import java.util.Scanner;
public class primearry {
    
    public static void main(String[] args)
    {
          Scanner reader=new Scanner(System.in);
        int[] array=new int[5];
        for(int i=0;i<array.length;i++)
        {
            int a=reader.nextInt();
            array[i]=a;  }
        for(int i=0;i<array.length;i++)
        {
            int c=0;
            int u=array[i];
            for(int j=1;j<=u;j++)
            {
                if(u%j==0)
                {
                    c++;
                } }
            if(c==2)
            {
                System.out.println("the element "+  u   +"is prime");  }
            else{
                System.out.println("the element "+  u   +"is not prime"); }  }  }
    
}