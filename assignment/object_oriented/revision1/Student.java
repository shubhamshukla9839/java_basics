package assignment.object_oriented.revision1;

 class Student {

          int id;
         String name;
         float marks;
         static String univname="GLA";
         Student(final int i, final String n, final float ma) {
             id = i;
             name = n;
             marks = ma;
         }

         static void Change() {
             univname = "GLA University";
         }

         void display(){
             System.out.println(id+" "+name + ""+ marks +" "+ univname );  }

         public static void main(final String args[]) {
             final Student s1 = new Student(222, "mahesh", 34.6f);
             final Student s2 = new Student(22, "mahesh1", 134.6f);
         s1.display();
         s2.display();
         Change();               // we dont need make instance of static method 
         s1.display();
         s2.display();

         }
        }
         
