import java.util.Scanner;
public class bucket
{
  int height;
  int width;
  int length;


  public bucket(int height,int width,int length)
  {
    this.height=height;
    this.width=width;
    this.length=length;
    int volumn = this.height*this.width*this.length;
    System.out.println("the volumn is"+volumn);
  }
public static void main(final String[] args) {
Scanner read = new Scanner(System.in);
System.out.println("enter height ");
int h = read.nextInt();
System.out.println("enter width ");
int w= read.nextInt();
System.out.println("enter length ");
int l = read.nextInt();
bucket b = new bucket(h,w,l);


}
}





    
