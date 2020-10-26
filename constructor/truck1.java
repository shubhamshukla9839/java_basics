package constructor;

public class truck1  {

    public static void main(String[] args){
        truck tr2 =new truck();
        tr2.prize=100;
        tr2.owner="shubham5";
        tr2.milesdrive=52;
        //tr.hastruck=true;
        //tr.hastruck=true;
        tr2.hastruck(true);
        //tr.hastruck();//private hastruck is not acecessable
        tr2.get_prize();
    }
    
}