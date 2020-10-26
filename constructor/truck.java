package constructor;

public class truck extends car1 {
       private boolean hastruck;
    void hastruck( boolean hastruck){ 
        this.hastruck=hastruck;

        
        System.out.println("now truck hastruck is acess");
        System.out.println(super.get_prize());
                                                //here we get prize of this same class truck when use 
                                                // get_prize but when we want to get get_prize of car1 then use super
                                                //System.out.println("get prize of upper or car1 class"+ get_prize());

    }
    @Override
    double get_prize(){                                      //here we overwrite the function get_prize in this class from car class
        System.out.println("owner    "+car.owner);
        double new_prize1=prize-(milesdrive*10);
        return new_prize1; 

    }
    public truck(){
       // super();
        super(10,10);    //we cant use 2 super at a same time                                    //constructor for car1 is created ....acecess ca1 class
        System.out.println("truck constructor created ");
    }
    public static void main(String[] args){

        truck tr = new truck();
        tr.prize=100;
        tr.owner="shubham5";
        tr.milesdrive=52;
        //tr.hastruck=true;
       // tr.hastruck=true;
        tr.hastruck(true);
        System.out.println("yes it is truck    ");
        System.out.println("get prize of this class" + tr.get_prize());
       

    }
    
}