package assignment.assignment2;
import java.util.Scanner;
public class q2 {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        final int[] ar = new int[10];
        System.out.println("enter the 10 elemnts in array");
        for(int i=0;i<ar.length;i++){
            ar[i]=reader.nextInt();
            
        }
        for(int i=0;i<ar.length;i++){
           int  temp=0;
            for(int j=1;j<ar.length;j++){

                if(ar[j]<ar[j-1]){
                    temp=ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=temp;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                }

            }
        }
        System.out.print("  --...-- The first maximum elements is  = "+ar[ar.length-1]+"  "+"the secound max element is = "+ar[ar.length-2]);
        } 


       }