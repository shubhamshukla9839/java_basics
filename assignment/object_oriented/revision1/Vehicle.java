package assignment.object_oriented.revision1;

 class Vehicle {

         void run(){System.out.println("Vehicle is running");}
         }
          class Bike2 extends Vehicle{
         void run(){System.out.println("Bike is running safely");}
         void display(){
        run();

         super.run();
         }
         public static void main(String args[]){
         Bike2 obj = new Bike2();
         obj.display();
         }
         }
         
    

