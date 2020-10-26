package collections;

import java.util.ArrayList;

public class arraylist1 {

    public static void main(String[] args)
    {
        ArrayList<String> l1=new ArrayList<String>();

        l1.add("shubham");
        l1.add("shukla");
        l1.add("anil");
        l1.add("sumit");

        System.out.println(l1.get(1));

        l1.set(0, "new_shubham");
        System.out.println(l1.get(0));
        boolean a=l1.contains("shubham");

        System.out.println(l1.contains("new_shubham"));

        System.out.println(a);

      //  -----how can i print all elements 

        for(String i:l1)
            System.out.println(i);

            Object[] b=new Object[]{l1}    ;                // //  its is use when we deal with different datatype                                                

            for(Object atrribule:b)  {                
                   System.out.println(atrribule);  }
    }
    
}