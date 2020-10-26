package collections;

import java.util.HashSet;
import java.util.Iterator;

/* 
 set is child interface of collection 
duplicate not allowed
insertion order not preserverd
does not contain any new methods it inherits methods from collection
  
hasset is class which impliments set interface
uses hash table
duplicates are not allowed it return false if duplicate is added.

insertion order isn't preserved , as objects will be inserted on the basis of  hash 
search is the most efficient     ()                                                                     */


public class hasset {

    public static void main(String[] args)
    {
          //Hashing mechanism  //hash function //hash table 
          
          HashSet<String> ll=new HashSet<String>();
          ll.add("john");
          ll.add("shubham");
          ll.add("class");
  
         Iterator it=  ll.iterator();

         while(it.hasNext())

         {
             System.out.println(it.next());
         }
             
         }
  
         
    



    }
    

