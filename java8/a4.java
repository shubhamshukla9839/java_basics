package java8;

public class a4 {

    public static void main( String[] args) {
        //lambda expression
          
         playgame myplay = (int a) -> { 
            System.out.println("game is on   : "+a);
        } ;
        myplay.play1(5);
    }
    //without lambda we have to first implement playgame interface then overide method and the make a object in main then print

    public interface playgame
    {
        void play1(int a);
        
    }
    
}