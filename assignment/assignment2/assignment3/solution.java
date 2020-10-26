package assignment.assignment2.assignment3;

import java.util.Scanner;

 class fact                                        // my task------  ///////-------

{   int fact(int i)                                     // statements ------
    {                                                  // first we calculate total possible numbers by using standard formula of permulation
        int c=1;                                       //  then we fine total possible number using my own logic then varify                                                      // 
        while(i>=1)                                   //  we got that our both results is same 
        {
       c=c*i;
       i=i-1;
        }
        return c;  }}
public class solution {
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        System.out.println("enter total numbers which we have ");
        int n=reader.nextInt();
        System.out.println("enter size of number which you want to make from these numbers  ");
        int m=reader.nextInt();
        fact f=new fact();                   // create method fact for calculating factorial
        int r=f.fact(n);
        System.out.println(r);  
        int y=n-m;  
        int t=f.fact(y);
        System.out.println(t);
        System.out.println("total number of possible distinct number by using formula (fact method ) we can make   :    "+r/t);

         System.out.println("for given" + n + "number 1, 2, 3, 4  possible" + m + " digits are  ");
         int[] arr={1,2,3,4};          // store given number in array
         int [] num=new int[3];        // take a temporary array for storing our each number digits
         int[] total=new int[r/t];     // take a array for storing our whole number so that we can print at the last
         int f1=0;
         for(int i=0;i<arr.length;i++)
         {
            for(int j=0;j<arr.length;j++)
            {
              if(j!=i)                     // if we alredy find all possible combination of privious i then now for ignore it
              {
                  num[0]=arr[i]; 
                  num[1]=arr[j];
                  for(int k=0;k<arr.length;k++)
                  {
                      if(arr[k]!=num[0]&&arr[k]!=num[1]){  // ignore the number which is already in num array becouse repeatation not allowed
                          num[2]=arr[k];
                          total[f1]=num[0]*100+num[1]*10+num[2]*1;  
                          f1++;                                 

                      }}}}}
         int g=0;
         for(int u=0;u<total.length;u++){
         
             if(total[u]!=0){
                System.out.println(total[u]);        // print all posible numbers one by one 
                 g++;
             }
            }
         System.out.println("at the last total number is     ->    "+g);   // print total count of possible number 
         if(g==(r/t))
              System.out.println("results varify (through formula and through logic)"); 
           
         
            
}}
