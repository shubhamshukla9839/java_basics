package assignment.assignment2;
import java.util.Scanner;

public class v1 {

public static void main(String args[])
{
 String s=
 Scanner re=new Scanner(System.in);
int a=re.nextInt();
if(s.compareTo("female")==0)
{
if(1<a&&a<=58)
{System.out.println("8.2%");}
else if(59<=a&&a<=100)
{System.out.println("9.2%");}
}
else if(s=="Male")
{
if(1<a&&a<=58)
{System.out.println("8.4%");}
else if(59<=a&&a<100)
{System.out.println("10.5%");}
}
else
{System.out.println("invalid");}

}}