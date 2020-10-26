package assignment.logicalpogram;

import java.util.Arrays;

public class logicwrite {


    public static void main(String[] args){
        
       // System.out.println("enter the number");
    
        String str="abcd";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        System.out.println(rev);

        int[] arr={1,2,4,5,3};
        str=Arrays.toString(arr);
        String r=""; 
        for(int i=str.length()-2;i>0;i--){
            r=r+str.charAt(i);
        }
        System.out.println(r);


        String s="abcd";
        StringBuffer b1= new StringBuffer(s);
        System.out.println(b1.reverse());
        
        
        int s1=12345 ;
        String s2=String.valueOf(s1) ;
        StringBuffer b2= new StringBuffer(s2) ;
        System.out.println(b2.reverse()) ;
        

        int s3=12345;
        String s5="";
        
        while(s3>0)
        {

            int s6=s3%10;
            String h=String.valueOf(s6);
            s5=s5+h;
            s3=s3/10;

        }

            System.out.println(s5);
        
    }
    
}