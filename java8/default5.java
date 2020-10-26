package java8;

public interface default5 {
    int sum(int x,int y);
    default void display(){
        System.out.print(" method defination inside inteface");
    }
    public class opimplem implements default5{
        public int sum(int x, int y) {
            return x + y;
        }
    }

    public static void main(String[] args)
    {
        opimplem op=new opimplem();
        int u=op.sum(1, 4);
        System.out.println(u);
        op.display();
     
    
}
}