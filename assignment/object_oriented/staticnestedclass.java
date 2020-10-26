package assignment.object_oriented;

public class staticnestedclass {

        static int data=100;
        static class Inner{

        void msg(){System.out.println("data is "+data);}
        
        }

        public static void main(String args[]){                                             //We need to create the instance of static nested
         staticnestedclass.Inner obj=new staticnestedclass.Inner();
        obj.msg();                                                                        //  class because it has instance method msg(). We
                                                                                         // don't need to create the object of Outer class
                                                                                        // because nested class is static and static
                                                                                       // properties, methods or classes can be accessed
                                                                                      //  without object.*/
        
        }
    }

    

