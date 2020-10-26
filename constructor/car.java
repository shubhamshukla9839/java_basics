package constructor;

public class car {

    int type;
    int prize;
    int model;
    int milesdrive;
    static String owner="shubham";                   //  here is static keyword so that it will share with all instance 
    owners owners5;                                  //   owners is instance of owners class (aggregated)(concept of agregation)

    public car(int type,int prize,int model,int milesdrive){
        this.type=type;
        this.prize=prize;
        this.model=model;
        this.milesdrive=milesdrive;
        System.out.println("constructor 1 is created");
        owners ow=new owners();
        ow.firstname="shubham789";
        ow.lastname="shukla";
        System.out.println(ow.firstname);
        
    }
   public  car(int prize){
        
        this.prize=prize;
        System.out.println("constructor 2 is created");
        System.out.println("owner"+car.owner);
    }

    double get_prize(){
        System.out.println("owner"+car.owner);
        double new_prize=prize-(milesdrive*100);
        return new_prize;
    }
    


public static void main(String[] args)  {
car c1=new car(1,25,21,24); 
car c2=new car(28);
//truck c3=new truck();
//c3.hastruck=true;
System.out.println("truck prize");
car.owner="shubham";
double prize1= c1.get_prize();
double prize2=c2.get_prize();
System.out.println("prize will    "+prize1);
System.out.println("prize will    "+prize2);
   
}
}
