package assignment;

import java.util.Scanner;
public class evenodd {


   public static void main(final String[] args) {

       final Scanner reader = new Scanner(System.in);
       System.out.println("enter the number");
       final int num = reader.nextInt();

    if(num%2==0)
    {
        System.out.println("this is even number");
    }
    else{
        System.out.println("this is not even number");
    }

    }
}

