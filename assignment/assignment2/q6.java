package assignment.assignment2;

import java.util.Scanner;

public class q6 {

    public static void main(String[] args)
    {
        
        Scanner reader=new Scanner(System.in);
        char a1 = reader.next().charAt(0);
        int s1=a1;
        int s2=s1;
        if(0<=s1&&s1<=65)
        {
        s1=s1+32;
        System.out.print((char)s1);
        }
        else{
        s2=s2-32;
        System.out.print((char)s2);

    }
}
    
}