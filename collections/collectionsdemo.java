package collections;
///////////////////////////////////////////////////                          .....Arraylist
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import assignment.object_oriented.employe;

public class collectionsdemo {

    //datatype int long double float  ::   ---primitive data type
    // when we use collection we cant use primitive data type we can use 
    // Wrapper classes (similat)      ::  Integer Long Double Float 

    public static void main(String[] args){

        String [] str=new String[3];
        str[0]="amit";
        str[1]="shubham";
        System.out.println(str);                                  // we cant acess elements like this 

        List<String> list=new ArrayList<String>();               // we have not given size  like normal array (advantage)
        list.add("shubham");                                     // this is having dynamic size
        list.add("shukla");
        list.add("EC");
        System.out.println(list);
        System.out.println("we can get size and value of perticuler index");
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.add("202"));


        List list1=new ArrayList();         // when you not using generic then we can store all type of data in the list
        list1.add("shubham");                // this is having dynamic size
        list1.add("shukla");
        list1.add(200);
        System.out.println(list1);

       // list.add(12);  error 


//////////   vector   /////  both are same but      arraylist is not synchonize   and vector is syncronize 


        Vector <String> list3=new Vector<String>();
        list3.add("shubham");
        list3.add("shukla ");
        System.out.println("output of vector list"+list3);

        List<employe> employlist=new ArrayList<employe>();
        employe e1=new employe("shubham222", 20, 2000,"sunder");        ////  this employee class is present in objectoriented folder ////
        employlist.add(e1);
        employe e2=new employe("shubham222", 20, 2000,"sunder");
        employlist.add(e2);
        System.out.println(list3.size());
        System.out.println(employlist);
        System.out.println("         ........--------");

     for(employe ob : employlist)
     {

        System.out.println(ob.getName()+" "+ob.getAddress()+" "+ob.getAge());
          
     }


        // linkedlist

    }
    
}