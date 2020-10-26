package constructor;
////interface            
public interface operations {
 
    int sum(int a ,int b);                  // by defauld it is public inside interface 
    int mini(int a,int b);
    int mult(int a,int b);
    
    
public class operation1 implements operations{

    @Override
    public int sum(int a, int b) {
        
        return (a+b);
    }

    @Override
    public int mini(int a, int b) {
    
        return (a-b);
    }

    @Override
    public int mult(int a, int b) {
        
        return a*b;
    }

}
public class operation2 implements operations{

    @Override
    public int sum(int a, int b) {
        // TODO Auto-generated method stub
        return a+b+5;
    }

    @Override
    public int mini(int a, int b) {
        // TODO Auto-generated method stub
        return a-b-1;
    }

    @Override
    public int mult(int a, int b) {
        // TODO Auto-generated method stub
        return a*b*2;
    }
}

}
