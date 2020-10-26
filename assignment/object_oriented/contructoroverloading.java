package assignment.object_oriented;

public class contructoroverloading {


        int id;
         String name;
         float marks;
         contructoroverloading(int i,String n, float ma){
         id = i;
         name = n;
         marks=ma;
         }
         contructoroverloading(){};

     void display(){System.out.println(id+" "+name+ ""+marks);
    } 
        public static void main(String args[]){
            
         contructoroverloading s1 = new contructoroverloading(222,"mahesh",34.6f);
         contructoroverloading s2 = new contructoroverloading();
         s2=s1;
         s1.display();
         s2.display();
    
        }
    }