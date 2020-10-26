package assignment.object_oriented;
interface shape8 {
     void area();
     void paremeter();
}
class triangle implements shape8{

   public void area(){
        System.out.println("area of triangle is"+20*30*0.5);

    }
   public void paremeter(){
       System.out.println("paremetes of triangle is"+20+30+20);
   }}
class circle7 implements shape8{

    public void area(){
         System.out.println("area of circle is"+3.14*30*30);   }
    public void paremeter(){
        System.out.println("paremetes of circle is"+4*3*30);
    }}
public class shape3  {
    public static void main(String[] args){
       shape8 ob=new triangle();
       ob.area();
       ob.paremeter();
       shape8 ob1=new circle7();
       ob1.area();
       ob1.paremeter();     } }
    
