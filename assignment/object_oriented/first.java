package assignment.object_oriented;


public class first {

    public static void main(String[] args){
        //show obj = new show();//if we make outside 
        first obj = new first();
        obj.s();
        obj.s(4,"shubham");
        obj.s(4,"shukla");  ///  arguments pass
        //obj.s(1,2);

    }
    void s(){
        System.out.println("show class");     //  overloading no of arguments, datatype, orderof parameter
    }
    void s(String a,int b)  // parameters acecess
    {
        System.out.println("this is another"+a+""+b);
    }
    void s(int b,String a){
        System.out.println("this is after changing order"+b+" "+a);
    }
    void s(Double c ,String a )
    {
        System.out.println("double and int here same as so error");
    }
    void s(int a,double b)
    {
        System.out.println("this is another"+a+""+b);
    }
    void s(double a,int b)   // important q becouse both int and double we accept the given 1 ,2 value so 
    {
        System.out.println("this is another"+a+""+b);
    }
    
    
}