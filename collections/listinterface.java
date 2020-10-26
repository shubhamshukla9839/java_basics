package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listinterface {

    public static void main(String[] args)
    {
        List<String> li=new ArrayList<String>();

        li.add("john");
        li.add("mice");
        li.add("shubham");
        li.add(1,"micenew");
        li.remove("john");

        ListIterator le=li.listIterator();
        while(le.hasNext())
        {
            System.out.println(le.next());
            //System.out.println(li.get(1));

        }
    }
    
}
