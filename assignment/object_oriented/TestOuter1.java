package assignment.object_oriented;

    public class TestOuter1{

        static int data=30;
        static class Inner{
        void msg(){System.out.println("data is "+data);}
        }
    
        public static void main(final String args[]) {
            final Inner obj = new Inner();
        obj.msg();
        }
    }
         
    

