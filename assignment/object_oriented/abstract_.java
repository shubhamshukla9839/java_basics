package assignment.object_oriented;

abstract class shape{

    abstract void print_area();
    
}

class rectangle extends shape{

    int a=5;
    int b=5;
    void print_area() {
        
          int d=this.a*this.b;
          System.out.println("area of rectenguler"+d);
    }
}
class circle extends shape{

    int r=5;
    int a;
    void print_area()
   
    {
        a=r*r;
        System.out.println("area of circle"+a);
    }

}

public class abstract_ {

    public static void main(String[] args){
        
    shape ob1 = new rectangle();
    ob1.print_area();

    shape ob2= new circle();
    ob2.print_area();

    }
    
}