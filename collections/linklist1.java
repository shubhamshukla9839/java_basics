package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class linklist1 {

    public static void main(String[] args)
    {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("john");
        ll.add("shubham");
        ll.add("class");

        ll.add(1,"shubham1");

        LinkedList<String> l1=new LinkedList<String>();
        l1.add("car");
        l1.add("bike");
        l1.add("race");

        ll.addAll(l1);                    //add linklist ll+l1
        ll.addFirst("firstname");
        ll.addLast("lastname");          //add string at specific position
       
        ll.remove("firstname");          // for removing 
        ll.remove(3);
        ll.clear();                      // for clear all list 

        Iterator<String> i=ll.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }


    }
    
}
