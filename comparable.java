import java.util.ArrayList;

import java.util.*;
public class comparable {

    public static void main(final String[] args){
        final ArrayList<String> arraylist=new ArrayList<>();
        arraylist.add("ahubham");
        arraylist.add("kumar");
        arraylist.add("shukla");
        print( arraylist);
           System.out.println("array before sort");
        for(String a:arraylist){
           System.out.println(a);
    }
        System.out.println("array after sort   ");
        Collections.sort(arraylist);                //already having comparables
       for(String a:arraylist){
          System.out.println(a);

}
    }
     static void print(ArrayList<String> arraylist){
        for(String a:arraylist){
            System.out.println(a);
      }
}
}