package assignment.object_oriented;

public class localinnerclass {

        private int count=10;
                                                    //class inside method called local inner class 
        void display(){

        class Local{

        void message(){System.out.println(count);}

        }

        Local l=new Local();
        l.message();

        }
        public static void main(String args[]){
            
        localinnerclass o=new localinnerclass();
        o.display();


        } }
    

