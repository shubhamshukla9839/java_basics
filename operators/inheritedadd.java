package operators;

class op {

    public void a(int a,int b){
        System.out.println(a+b);
    }
    public void b(int a,int b){
        System.out.println(a-b);
    }
    

}

public class inheritedadd extends op{


    public static void  main(String[] args) {
    int a=5;
    int b=5;
   inheritedadd c=new inheritedadd();
   c.a( a,  b);
    
}
}