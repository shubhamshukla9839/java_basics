package assignment.assignment2.assignment3;

class Arithmatic
{
    int add(int i,int j)
    {
        return i+j;
    }
}
class adder extends Arithmatic{

}
public class solution1 {

    public static void main(String[] args)
    {
        adder a=new adder();
        String s=a.getClass().getSuperclass().getName();
        System.out.println("My superclass is : ->>   "  +s.substring(35,45));
    }
    
}
