package java8;

import assignment.object_oriented.override;
import constructor.operations;

public interface a5 {

    int sum(int x,int y); 
    
public static void main(String[] args)
{

   //opimplement impl=new opimplement();
   
}
}

public class opimplement implements a5
{
    int x=5;
    int y=10;
    opimplement op=new opimplement();
    
    

	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
    }
    @override
    public int getx(){
        return x;
    }
     
public interface a5{
    int sum(int x,int y);
    int getx();
   default void display(){            ///  "default" keyword is use for define method defination inside interface 
        System.out.println(getx());
    }
}
}

    
