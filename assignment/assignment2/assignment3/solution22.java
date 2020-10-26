package assignment.assignment2.assignment3;

import java.util.Scanner;

public class solution22 {

    public static void main( String[] args) {                                        //task----

                                                                         // i am deviding whole program in small segments
        final Scanner reader = new Scanner(System.in);
                                                                        // then try to solve for all test cases and varify every time 
        System.out.println("enter max number of testcases");      
        int q = reader.nextInt();

        for (int j = 0; j < q; j++) {

            System.out.println("you are processing in test case  :->>>>>       "+(j+1));
            
            int i;

            System.out.println("enter the sequence of B (n elements)");
            final int n = reader.nextInt();

            System.out.println("enter the number of floor");
            final int m = reader.nextInt();

            System.out.println("enter the elements in sequences");
             int[] arr = new int[n];

            for (i = 0; i < arr.length; i++)       
             {
                arr[i] = reader.nextInt();
             }

            for(i=0;i<arr.length;i++)
            {
                if(arr[0]!=-1)                         // i devided whole possible cases in 2 part first which start -1 and others remainning                          
                {
                    for (i = 0; i < arr.length-1; i++){

                        if(arr[i]<m&&arr[i+1]==-1)    // we got condion like if out next num is -1 i replace is privious+1
                           arr[i+1]=arr[i]+1;        
                           
                    }
                }
                else{

                     arr[0]=1;  // after that here if start with -1 then first num always start with 1

                    for (i = 0; i < arr.length-1; i++){

                        if(arr[i]<m&&arr[i+1]==-1)    // same logic as privious 
                           arr[i+1]=arr[i]+1;
                                     }
                    }
                    int u=arr[arr.length-1]-arr[arr.length-2];   // check last 2 number difference and print desired results
                    if(u==-1)
                            System.out.println(" result ----->   "+ 1);
                    else if(u==1)
                             System.out.println(" result ---->   "+ 0);    
                    else    
                              System.out.println("result ---->   " + -1);                      
                }
            }
            
            }

}
    

