package assignment.object_oriented;


    abstract class shape7{
        int l=3,b=4;
         public abstract void printArea();}
         public class Rectangle2 extends shape7{
         public void printArea()
        {
            final int ar = l * b;
            System.out.println("Area of rectangle is" + ar);
        }
    }

    public class Triangle2 extends shape7 {
        public void printArea() {
            final double ar = 0.5 * l * b;
            System.out.println("Area of triangle is" + ar);
        }
    }

    public class Circle2 extends shape7 {
        public void printArea() {
            final double ar = 3.14 * l * l;
            System.out.println("Area of circle is" + ar);
        }
    }

    public class ShapeArea1 {
        public static void main(final String[] args)
        {
        final Shape obj=new Rectangle2();
        obj.printArea();
        final Shape obj2=new Triangle2();
        obj2.printArea();
        final Shape obj3=new Circle2();
        obj3.printArea();

        }}
    
}
}
