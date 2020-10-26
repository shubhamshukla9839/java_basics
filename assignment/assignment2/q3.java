package assignment.assignment2;

import java.util.Scanner;

public class q3 {
    String s1;
    String s2;
   public q3(String S1,String S2){

        this.s1=S1;
        this.s2=S2;
        if(s1.compareTo("GLA")==s2.compareTo("Mathura"))
            System.out.print(s1+" University "+s2);

        else if(s1.compareTo("AAA")==s2.compareTo("Delhi")) 
            System.out.print(s1+" Technologies "+s2);
    }

    public static void main(String[] args ){

        Scanner reader=new Scanner(System.in);
         String S1=reader.next();
         String S2=reader.next();
         q3 q=new q3(S1,S2);

    }
    
}