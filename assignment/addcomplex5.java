package assignment;
import java.util.Scanner;
public class addcomplex5 {

  int real ;      int img ;

  addcomplex5 add (final addcomplex5 c1, final addcomplex5 c2){

         final addcomplex5 z=new addcomplex5();
         z.real = c1.real+c2.real;      z.img = c1.img+c2.img;
         return z;
   }

public static void main(final String[] args){

  final Scanner reader = new Scanner(System.in);
  final addcomplex5 c1 = new addcomplex5();
  final addcomplex5 c2 = new addcomplex5();
  addcomplex5 c3 = new addcomplex5();

  System.out.println("enter real part of first complex num");
  final int r1 = reader.nextInt();
  c1.real = r1;
  System.out.println("enter imgeninary part of first complex num");
  final int i1 = reader.nextInt();
  c1.img = i1;
  System.out.println("enter real part of secound complex num");
  final int r2 = reader.nextInt();
  c2.real = r2;
  
  System.out.println("enter imeginary part of first complex num");
  final int i2 = reader.nextInt();
  c2.img =i2;
  c3 = c3.add(c1,c2);       
  System.out.println("the final result after adding is   "+ c3.real+"+"+"i"+c3.img);  

}

}

