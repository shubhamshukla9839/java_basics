import java.util.Scanner;

public class addingcomplex {

 public static void main(String[]  args)   {
 
 System.out.println("enter the real part of 1st ");
 Scanner r1= new Scanner(System.in);
 int a1= r1.nextInt();
 System.out.println("enter the imaginary part of 1st ");
 Scanner r2= new Scanner(System.in);
 int b1= r1.nextInt();

 System.out.println("first complex"+a1+"+"+"i"+b1);

 System.out.println("enter the real part of 2nd num");
 Scanner r3= new Scanner(System.in);
 int a2= r3.nextInt();
 System.out.println("enter the imaginary part of 2nd num ");
 Scanner r4= new Scanner(System.in);
 int b2=r4.nextInt();
 System.out.println("secound complex"+a2+"+"+"i"+b2);

 System.out.println("after adding both complex number "+(a1+a2) +"+"+  (b1+b2));




 }
}