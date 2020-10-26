import java.util.*;

class person implements Comparable<person>{
    
        String name ;
        int age;
        
       public person( final String name, final int age) {

           this.name = name;
           this.age = age;

       }

       @Override
       public int compareTo(person o) {
           return this.age-o.age;
      }
   }

   public class comparable1  {

       public static void main(final String[] args){
        final ArrayList<person> arraylist=new ArrayList<>();
        arraylist.add(new person("shubham", 82));
        arraylist.add(new person("saurabh", 28));
        arraylist.add(new person("golla",20));
         System.out.println("array before sort");
        
        for(person a:arraylist){
           System.out.println(a.name);
         }   
           System.out.println("array after sort   ");
            Collections.sort(arraylist);                //    already having comparable
            
        for(person a:arraylist){
            System.out.println(a.name);               
        }
    }
     /*  static void print(final ArrayList<person> arraylist) ;
           for (final person a : arraylist) ;
            System.out.println("name"+a.name);
            System.out.println("name"+a.age)         */

      
}

   
    
