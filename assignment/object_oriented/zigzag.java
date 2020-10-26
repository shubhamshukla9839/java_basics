package assignment.object_oriented;

import java.util.Scanner;

public class zigzag {
    public static void main(String[] args){
     Scanner reader=new Scanner(System.in);
    int[][] ar1=new int[4][4];
    System.out.print("enter element in 2 d array");
    for(int i=0;i<ar1.length;i++)
    {
       for(int j=0;j<ar1[i].length;j++)
       {
           int a=reader.nextInt();
           ar1[i][j]=a;               }}
    for(int i=0;i<ar1.length;i++)
    {
       for(int j=0;j<ar1[i].length;j++)
       {
          System.out.print(ar1[i][j]+"  ");
       }
       System.out.println("   ");
    }
    System.out.println("              after applying zigzag :    array is   ---   ");
for(int i=0;i<ar1.length;i++ ){
  for(int j=0; j<ar1[i].length ;j++)
  {   System.out.print(ar1[i][j]+"     ");
      if(j==ar1.length){
          break  ;       
            } } 
 System.out.println("    ");
     i++; 
for(int j=ar1[i].length-1; j>=0 ;j--)
  {
      System.out.print(ar1[i][j]+"     ");
    }
    System.out.println("  ");      
        } }   }

