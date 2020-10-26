package assignment.object_oriented;
import java.util.Scanner;
public class cupsarrag {
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        int [] cups=new int[3];
        int [] saucer=new int[3];
        System.out.println("enter elements in arrrays ");
        int sum1=0;  int sum2=0;
        for(int i=0;i<cups.length;i++) { 

            int c=reader.nextInt();
            int s=reader.nextInt();     cups[i]=c;
            sum1=sum1+cups[i];          saucer[i]=s;
            sum2=sum2+saucer[i];}
            for(int i=0;i<cups.length;i++) { 
                System.out.print(cups[i]+"  ");
            }  System.out.println("     --    ");

                for(int i=0;i<cups.length;i++) { 
                    System.out.print(saucer[i]+"  ");
                }       System.out.println("enter max number of  shelves ");
         int ca=reader.nextInt(); int cb=5;   int sb=10;
         if(sum1%cb==0)
            sum1=(sum1/cb);
         else 
             sum1=(sum1/cb)+1;   
        if(sum2%sb==0)
             sum2=(sum2/sb);
        else 
              sum2=(sum2/sb)+1;
         int sum=(sum1)+(sum2);
         if(sum<=ca)
           System.out.println("yes");  
         else{
            System.out.println("no");    }}  }
    