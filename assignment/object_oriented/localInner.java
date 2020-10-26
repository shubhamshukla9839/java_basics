package assignment.object_oriented;

    public class localInner{

        private int count=10;
        void display(){
        class Local{
        void message(){System.out.println(count);}
        }
        Local l=new Local();
        l.message();
        }
        
        public static void main(String args[]){
        localInner o=new localInner();
        o.display();

        } }
    

