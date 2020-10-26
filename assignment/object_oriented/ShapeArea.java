package assignment.object_oriented;

import java.util.Scanner;

abstract class Shape {
    
        double l,b;                  // abstract class containing 2 varibales and one empty method 
         abstract void printArea();

        }

          class Rectangle1 extends Shape{
         public void printArea()

        {
            double ar=l*b;
        System.out.println("Area of rectangle is"+ar);

        }}

         class Triangle1 extends Shape{
        public void printArea()

        { 
            double ar=0.5*l*b;
        System.out.println("Area of triangle is"+ar);

        }}
         class Circle1 extends Shape{
        public void printArea()
        { 
        double ar=3.14*l*l;
        System.out.println("Area of circle is"+ar);

        }}

        public class ShapeArea{
        public static void main(String[] args)
        {
        Scanner reader=new Scanner(System.in);
        Shape obj=new Rectangle1();
        System.out.println("enter length and width of rectengle ");
        double a=reader.nextDouble();
        double b=reader.nextDouble();
        obj.l=a;
        obj.b=b;
        obj.printArea();
        Shape obj2=new Triangle1();
        System.out.println("enter height  and base of triangle ");
        double a1=reader.nextDouble();
        double b1=reader.nextDouble();
        obj2.l=a1;
        obj2.b=b1;
        obj2.printArea();
        Shape obj3=new Circle1();
        System.out.println("enter radias of circle");
        double a3=reader.nextDouble();
        obj3.l=a3;
        obj3.printArea();
        
    }}
