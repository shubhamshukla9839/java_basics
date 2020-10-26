package constructor;

/*abstract*/ public class car1 {      //when you use abstract then we can make object of this class (car1) if u enherited (carmain)or not 

    int type;
    int prize;
    int model;
    int milesdrive;
    int a;
    int b;
    String owner;     //here is static keyword so that it will share with all instance

   public car1(){
       System.out.println("constructor for car1 is created without arguments ");

   }
   public car1(int a,int b){
    System.out.println("constructor for car1 is created with arguments "+(a+b));

    }

    double get_prize(){
        System.out.println("owner=    "+owner);
        double new_prize=prize-(milesdrive*100);
        System.out.println(new_prize);
        return new_prize;
    }
    


public static void main(String[] args)  {
car1 c1=new car1();
car1 c2=new car1();  
c1.prize=10;
c1.milesdrive=10;
car1 c8=new car1(10,10);
c8.prize=10;
c8.milesdrive=10;
//truck c3=new truck();
//c3.hastruck=true;
System.out.println("truck prize");
c1.owner="shubham";
c2.owner="shukla";
double prize1= c1.get_prize();
double prize2=c2.get_prize();
System.out.println("prize will    "+prize1);
System.out.println("prize will    "+prize2);
   
}
}