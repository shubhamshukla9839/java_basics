package assignment;
import java.util.Scanner;
public class jaggedarray {
     public static void main(final String[] args) {
         System.out.println("enter row size which you want in array ");
         final Scanner reader = new Scanner(System.in);
         final int r = reader.nextInt();
         final int[][] ar = new int[r][];
         for (int i = 0; i < r; i++) {
             System.out.println("enter the coloum size for each row like for row no     : " + i);    final int c1 = reader.nextInt();
              ar[i]=new int[c1];}
         for(int j=0;j<ar.length;j++){
            for (int k=0;k<ar[j].length;k++)
            {   System.out.println("enther element at position    "+j+" "+k);        ar[j][k]=reader.nextInt();   }}
         for(int f=0;f<ar.length;f++){
            for (int g=0;g<ar[f].length;g++)
              System.out.print( "  "+ar[f][g]+"  ");         System.out.println("\n"); } } }
           