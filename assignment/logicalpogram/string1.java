package assignment.logicalpogram;

import java.util.Scanner;

public class string1 {


    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        String s=reader.next();
        System.out.println(s);
        System.out.println(s.length());
        System.out.println("shukla"+s);                     //  concatination
       System.out.println(s.charAt(6));                      // acess by index
        
       String sen="this is my book";
       // void method getChar(int sourcestart, souce end,char target,int target start)
       int start=3;
       int end=10;
       char tar[] =new char[end-start];          //  where i store
       sen.getChars(start, end, tar, 0);         //  0 means it store from 0 index   [0(from here),1,2,3,4,.....]
       System.out.println(tar);


       System.out.println("now next---------------------");

       String sentance="icandothis";

       char c[]=sentance.toCharArray(); 
                                   //convert string into array
       for(int i=0;i<sentance.length();i++)
       {
            System.out.println(c[i]);
       }

       String s1="shubham";
       String s2="shubham";

       String s3="Shubham shukla";
       System.out.println(s1==s2);                        //true
       System.out.println(s1.equals(s2));                 //true
       System.out.print(s1.equalsIgnoreCase(s3));         //true


       System.out.println("next------------------------");


       System.out.println(s1.regionMatches( 0, s3, 0, 7));       // 0 index of s1, s2, range of s3  (0,7)
       System.out.println(s1.startsWith("hello"));               // same  like endwith also
       System.out.println(s1.substring(0,3));


       ////  string is imutable you cant change iit 
    }
    
}