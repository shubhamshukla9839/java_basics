package assignment.assignment2;
import java.util.Scanner;

public class q51 {
    public static void main(String[] args)
    {
    Scanner reader=new Scanner(System.in);
    int n=reader.nextInt();
    if(n>0)
    System.out.println("it is positive number");
    else if(n<0)
    System.out.print("it is negative number");
    else
    System.out.print("it is zero");

    }

    
    
}