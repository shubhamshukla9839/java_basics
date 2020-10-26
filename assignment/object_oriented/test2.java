package assignment.object_oriented;

 class test2 {
        static int data=30;
        static class Inner{
        void msg(){System.out.println("data is "+data);}
        }
        public static void main(String args[]){
        Inner obj=new Inner();
        obj.msg();
        }
        } 
    

