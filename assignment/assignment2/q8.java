package assignment.assignment2;
import java.util.*;

public class q8 {
    
    public static void main(String[] args)
    {

        Scanner reader=new Scanner(System.in);
        int[] arr=new int[10];
        int l=arr.length;

       for(int i=0;i<arr.length/2;i++)
       {

           arr[i]=reader.nextInt();  
           
       }
       
       System.out.print("the total sum of elements of even indexes is  = "+sum1);

    }
    
}