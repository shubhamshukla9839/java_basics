package assignment.object_oriented;

public class memberinnerclass {


        private int count=10;
         class Inner{
         void display(){System.out.println(count);}
         }
         public static void main(String args[]) {

         memberinnerclass o=new memberinnerclass();
         memberinnerclass.Inner in=o.new Inner();
         
        // Inner i=new Inner();
        // i.display();

         in.display();

         }
         }
    

