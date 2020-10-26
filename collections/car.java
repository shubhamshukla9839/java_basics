package collections;

import javax.lang.model.util.ElementScanner6;

public class car implements Comparable<car> {

    int prize;
    String name;
    String brand;

    car(int p,String n,String b){
        this.prize=p;
        this.name=n;
        this.brand=b;

    }

    @Override
    public int compareTo(car c) {
        
        // TODO Auto-generated method stub

        if(prize>c.prize)
            return 1;
        else if (prize<c.prize)
             return -1;
        else  
             return 0;      
        
    }
    
}
