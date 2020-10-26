package assignment.assignment2;
import java.util.Scanner;

public class q7 {

    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        int[] arr=new int[10];
        int sum1=0;
       for(int i=0;i<arr.length;i++)
       {
           arr[i]=reader.nextInt();
           if(i%2==0)
           sum1=sum1+arr[i];
       }
       System.out.print("the total sum of elements of even indexes is  = "+sum1);

    }
    
}