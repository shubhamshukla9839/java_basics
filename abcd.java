import java.util.Scanner;

interface Shape

{   void Area();
    void Perimeter();

}
 class Triangle implements Shape
	{	float area;
         float perimeter;
		Scanner i=new Scanner(System.in);
	  //  System.out.println("enter base and height and sides of triangle");
		int b=i.nextInt();
	    int h=i.nextInt();
		int a=i.nextInt();
		int c=i.nextInt();
		public void Area()
			{ 
			  area=0.5f*b*h;
			  System.out.println("Area of Triangle is "+area);
			}
		public void Perimeter()
			{
                          
			  perimeter=a+b+c;
			  System.out.println("Perimeter of Triangle is "+perimeter);
			}
	}
 class Circle implements Shape
	{	float area;
 		float perimeter;
		Scanner i=new Scanner(System.in);
	//	System.out.println("enter radius");
		int r=i.nextInt();
		public void Area()
			{ area=3.14f*r*r;
			  System.out.println("Area of Circle is "+area);
			}
		public void Perimeter()
			{ perimeter=2*3.14f*r;
			  System.out.println("Perimeter of Circle is "+perimeter);
			}
		}
 public class abcd
{
	public static void main(String[] args)
{ 
Shape t=new Triangle();
Shape c=new Circle();
t.Area();
t.Perimeter();
c.Area();
c.Perimeter();
}
}
	

