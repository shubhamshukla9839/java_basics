package assignment.object_oriented;

public class v {

    abstract class Shape{
        int l=3,b=4;
         public abstract void printArea();}
         public class Rectangle extends Shape{
         public void printArea()
        {int ar=l*b;
        System.out.println("Area of rectangle is"+ar);
        }}
        public class Triangle extends Shape{
        public void printArea()
        { double ar=0.5*l*b;
        System.out.println("Area of triangle is"+ar);
        }}
        public class Circle extends Shape{
        public void printArea()
        { double ar=3.14*l*l;
        System.out.println("Area of circle is"+ar);
        }}
        public class ShapeArea{
        public static void main(String[] args)
        {
            Shape obj=new Rectangle();
        obj.printArea();
        Shape obj2=new Triangle();
        obj2.printArea();
        Shape obj3=new Circle();
        obj3.printArea();
        }
    }
    
}
