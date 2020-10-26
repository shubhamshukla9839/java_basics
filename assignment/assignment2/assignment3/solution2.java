package assignment.assignment2.assignment3;

import java.util.Scanner;

public class solution2 {

    public static void main(String[] args)
    {
        Scanner reader =new Scanner(System.in);
        
        System.out.println("enter strings ");
        String s1=reader.nextLine();
        s1=s1.toLowerCase();
        String s2=reader.nextLine();
        s2=s2.toLowerCase();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        int c=0;
        for(int i=0;i<c1.length;i++)
        {
            for(int j=0;j<c2.length;j++)
            {
                if(c1[i]==c2[j]){
                   c++;
                   c2[j]=0;
                   break;
                }} } 
        if(c==c1.length)
           System.out.println("this is   anagrams ");
        else  
            System.out.println("this is not  anagrams "); 
    }}
