public class bolean {
    boolean isflag;
    void turnon()
    {
        isflag=true;
        System.out.println("Light is on     " +isflag);
    }
    void turnoff()
    {
        isflag=false;
        System.out.println("light off    "+isflag);
    }
public static void main(final String args[]) {
    final bolean l1 = new bolean();
    final bolean l2 = new bolean();
    l1.turnon();
    l1.turnoff();

}
}





    
