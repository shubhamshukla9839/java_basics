package assignment.assignment2;
import java.util.Scanner;

public class q1 {

    String S;
    int A;

   public q1(){}

   public q1(String S1,int A1){
        this.S=S1;
        this.A=A1;
        if(S.compareTo("female")==0 && A<=58 && A>1)
          System.out.print(" "+this.S+"::"+"  her age is=  "+this.A+"/n"+"  her interest =  "+"8.2%");
       else if(S.compareTo("female")==0 && A>=59 && A<=100)
         System.out.print(" "+this.S+"::"+"  her age is=  "+this.A+"  her interest =  "+"9.2%");
       else if (S.compareTo("male")==0 && A>=1 &&A<=58)
         System.out.print(" "+this.S+"::"+"  his age is=  "+this.A+"  his interest = "+"8.4%");
      else if (S.compareTo("male")==0 && A>=59 &&A<=100)
         System.out.print(" "+this.S+"::"+"  his age is=  "+this.A+"  his interest =  "+"10.5%");
   }
    public static void main(final String[] args ){

        final Scanner reader = new Scanner(System.in);
        System.out.println("enter gender and then age ");
        final String g=reader.next();
    
        final int a=reader.nextInt();
        q1 q=new q1(g,a);

    }   
}