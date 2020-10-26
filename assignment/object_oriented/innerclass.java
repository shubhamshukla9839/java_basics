package assignment.object_oriented;

import assignment.object_oriented.A.Inner;

 class TestOuter {

         static int data=30;
         class Inner{
         void msg(){System.out.println("data is "+data);}
         }
         }
        class innerclass
         {
         public static void main(String args[]){
         Inner obj=new Inner();
         obj.msg();
         }
        }
