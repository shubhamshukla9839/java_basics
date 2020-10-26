package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset {

    // class that implements sortedset interface
    // data structure used to store elements : tree.
    // contains unique elements
    // provides8/+ fast retrival and acces
    // doesnot allow null elements
    //objects in treeset are stored in sorted ascending order
    // doesnot allow null value
    // objects in treeset are stored in sorted ascending order

 public static void main(String[] args) {
    
    // TreeSet()   : create empty TreeSet elements stored in natural sorting order
    // TreeSet(Comparator comparator)  : Comparator specifies external specificatons of sorting order
    // TreeSet(SortedSet s) : covert SortedSet objects to TreeSet objects 

    TreeSet <car> tr=new TreeSet<car>();
    
    car c1=new car(100, "ab", "a");
    car c2=new car(50,"abc","ab");
    car c3=new car(300,"abcd","abc");

    tr.add(c1);
    tr.add(c2);        // tree set follow sortting by default so here its confuse about which paramentes it have to sort elements 
    tr.add(c3);

    for(car ca:tr)
    {
        System.out.println(ca.brand+"  "+ca.name+" "+ca.prize);
    }


}

    
}
