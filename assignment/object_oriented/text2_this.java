package assignment.object_oriented;

public class text2_this {

    public text2_this(int a)
    {
        this(20,20);
        System.out.println(" with one parametes constructor"+a);
    }
    public text2_this(int a,int b)
    {
        System.out.println(" with 2 parametes constructor"+ a+""+b);
    }
    public text2_this(int a,int b,int c)
    {
        this(1);
        System.out.println(" with 3 "+a+" "+b+""+c);
    }
 
public static void main(String[] args)
{
    text2_this ob =new text2_this(1,2,3);             
   // text2_this obc1=new text2_this(1);   //                 **for inside it the method of 2 parameters automatically invoked 
    //text2_this obc2=new text2_this(1,2);     // by using constructor chainning we can call all constructor using "  this() "


}
   
}

    
