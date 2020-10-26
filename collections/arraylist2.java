package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist2 {

    public static void main(String[] args)
    {
        ArrayList<String> l1=new ArrayList<String>();

        l1.add("shubham");
        l1.add("shukla");
        l1.add("anil");
        l1.add("sumit");

        System.out.println(l1.size());

       String s[] =new String[l1.size()];
        s=l1.toArray(s);                      //convert arraylist into array 
                                  
                /*  for(int i=0;i<s.length;i++)
                    {
                        System.out.println(s[i]);
                    }   */
                    
    

         Iterator i=l1.iterator();           //creat iterator object
         while(i.hasNext())
         {
             System.out.println(i.next());
         }



         ArrayList<Integer> l2=new ArrayList<Integer>();

         l2.add(5);
         l2.add(4);
         l2.add(1);
         l2.add(7);


         Iterator i2=l2.iterator();               //creat iterator object      //  means iterator works  on all type of array data
         while(i2.hasNext())
         {
             System.out.println(i2.next());
         }

 
}
}
