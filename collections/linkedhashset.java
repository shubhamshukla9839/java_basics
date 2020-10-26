package collections;

import java.util.LinkedHashSet;

public class linkedhashset {          // order of elements preserverd
    
    // inherited hashset class impliments set interface 
    // doubly linkset across elements 
    // used when interation order is needed 
    // hashset : unpredictable order during iteration
    // linkedhashset : iteration order predictable
    // contain unique values (no dublicate)
    
    // creatting a link hash set----
    // LinkHashSet()   : creates a default HashSet
    // LinkedHashSet(Collection c)  : initialize a hash set with elements of collections c 
    // LinkedHashSet(int capacity)   : initialize the hashset with the given capacity
    //LinkHashset (int capacity,float fillRatio): initializes the hashset with the given capacity and given fill ratio


     public static void main(String[] args) {

     LinkedHashSet<car> l= new LinkedHashSet<car>();
     car c1= new car(100, "bmw0", "a0");
     car c2= new car(100, "bmw1 ", "a1");
     car c3= new car(100, "bmw2", "a2");

     l.add(c1);
     l.add(c2);
     l.add(c3);
        
     for(car ca:l)
     {

        System.out.println(ca.name+"   "+ca.brand+"  "+ca.prize);
     }
    }
}
