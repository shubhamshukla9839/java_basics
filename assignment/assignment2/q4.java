package assignment.assignment2;
import java.util.Scanner;

    

public class q4 {
    int s1;
    int s2;

   public q4(int S1,int S2){

        this.s1=S1;
        this.s2=S2;
       System.out.print("sum of both is  "+(s1+s2));
    }

    public static void main(String[] args ){

        System.out.print("enter 2 elements for adition ");
        Scanner reader=new Scanner(System.in);
         int S1=reader.nextInt();
         int S2=reader.nextInt();
         q4 q=new q4(S1,S2);

    }
    
}
    
