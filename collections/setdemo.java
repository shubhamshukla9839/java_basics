package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import assignment.object_oriented.employe;

/*   set :             no duplicate elements ,no order 
        Hashset(c):      not sync,unordered
       LinkedHashset(c):  not  sync , insertion order , no dublicate,
       treset:         no dublicate        */


/*   list:    dublicate element , insertion order 
arraylist:  not sync ,duplicate,insertion order
vector  sync,  duplicate,insertion order
linklist:  not sync and remaining same as  list      */


public class setdemo {


    public static void main(String[] args)
    {
        Set<String> obj9=new HashSet<String>();              
        obj9.add("shubham");                        
        obj9.add("harsh");
        obj9.add("shubham");
        obj9.add("sushil");
        System.out.println(obj9);
        System.out.println(obj9.size());           // size will be 2 becouse set always take unique value

        Set<String> obj4=new TreeSet<String>();
        obj4.add("harsh");              
        obj4.add("shubham");                        
        obj4.add("shubham");
        obj4.add("sushil");
        System.out.println(obj9);
        System.out.println(obj9.size());           // size will be 2 becouse set always take unique value


        LinkedHashSet<employe> employeset=new LinkedHashSet<employe>();
        employe e1=new employe("shubham222", 20, 2000,"sunder");        ////  this employee class is present in objectoriented folder ////
        employeset.add(e1);
        employe e2=new employe("shubham22", 20, 2000,"sunder");
        employeset.add(e2);
        
       // System.out.println(employeset.size());

        System.out.println(employeset);
        System.out.println("         ........--------");

    }

    
}