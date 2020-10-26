package assignment.object_oriented;

public class test3 {
        static int data=30;
        static class Inner{
        void msg(){System.out.println("data is "+data);}
        }
        public static void main(String args[]){
        test3.Inner obj=new test3.Inner();          // we dont need to create object of outer class
        obj.msg();
    
}
}

