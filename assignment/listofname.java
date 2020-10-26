package assignment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class listofname {
    public static void main(String[] args ){
        Scanner reader= new Scanner(System.in);
              String[] names=new String[5];
        System.out.println("enter strings in array");
        for(int i=0;i<names.length;i++){
            String a = reader.nextLine();
                 names[i]= a;  }
        System.out.println("string array before sortting");
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]+ "  ");  }
        Arrays.sort(names);
        System.out.println("string array after sortting");
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]+ "  "); }}}