package collections;

import java.util.ArrayList;

public class main {

    public static  void main(String[] args ){

        car c1=new car(2000,"3series","bmw");
        car c2=new car(23000,"2series","bmw1");
        car c3=new car(2050,"1series","bmw2");
        
        ArrayList<car> c=new ArrayList<car>();       // we can add objects in arraylist
        c.add(c1);
        c.add(c2);
        c.add(c3);

        for(int i=0;i<c.size();i++)
        {
          System.out.println(c.get(i).brand);
        }
        
        
    }
    
}
