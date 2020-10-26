package assignment.object_oriented;

import java.util.Scanner;

public class prime {
     void prime(int a)
    {
        int c=-1;
        int n=a;
        if(n==0||n==1)
        {
            System.out.println("not a prime num");  }
        else{
            for(int i=2;i<a;i++)
            {
                if(n%i==0)
                {
                  c=0;
                }}     
        if(c==0)
        {
            System.out.print("it is not prime number"); }
        else{
            System.out.println("it is prime number "); }}
        }
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        int y=reader.nextInt();
        prime ob=new prime();
        ob.prime(y);
    }}