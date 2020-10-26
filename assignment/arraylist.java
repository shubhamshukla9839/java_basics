package assignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arraylist {

    
    public static void main(String[] args){


        ArrayList <Integer> arraylist = new ArrayList<Integer>();

        arraylist.add(4);
        arraylist.add(2);
        arraylist.add(1);

        System.out.println ("before sortting");
        System.out.println (arraylist);
        System.out.println ("after sort");
        Collections.reverse(arraylist);

        Collections.sort(arraylist);
        System.out.println (arraylist);



           Object[] b=new Object[]{arraylist}    ;                // //  its is use when we deal with different datatype                                                

            for(Object atrribule:b)  {                
                   System.out.println(atrribule);  }


        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));                 //without itereting we can print
        
    }

}