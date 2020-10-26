package assignment;

import java.lang.reflect.Array;

import java.util.Scanner;
public class twodarray {


    public static void main(String[] args){
        
        Scanner reader= new Scanner(System.in);
        
        int[][] a = new int[3][3];

        System.out.println("enetr element");
        
    for(int i=0;i<a.length;i++){

        for(int j =0;j<a[i].length;j++){

            a[i][j]=reader.nextInt();

        }

    }
    for(int i=0;i<a.length;i++){

        for(int j =0;j<a[i].length;j++){

            System.out.println(a[i][j]+"  ");

        }

    }
    }
    
}