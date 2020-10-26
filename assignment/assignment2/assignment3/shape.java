package assignment.assignment2.assignment3;

 abstract class shape{

    int a;
    int b;

    void printarea(){ 
    }
}
class rectengle extends shape{
    void printarea(int a,int b ){

        System.out.println("area of rectengle "+ a*b);
    }
class triangle extends shape{
        void printarea(int a,int b){
            System.out.println("area of rectengle "+ (float)a*b*0.5);
        }
    }
 class circle extends shape{
            void printarea(int a){
                System.out.println("area of rectengle "+ 3.14*a*a);
            }       
}

     public static void main(String[] args)
     {

         shape r=new rectengle();
         r.printarea(5,4);
         shape c=new circle();
         c.printarea(4);


     } 
    }
    