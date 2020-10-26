package assignment.object_oriented;

public class A {

         static int data=30;
         static class Inner{
         void msg(){System.out.println("data is "+data);}
         }
        }

         public class test4
         {
         public static void main(String args[]){
         A ni=new A();
         A.Inner obj=new A.Inner();
         obj.msg();

         }
         }
        
    
