public class static_1 {

    int id;
    String name;
    float mark;
    static String university="gla" ;

    public static_1(int b,int c)
    {
        int f =b+c;
        System.out.println(f);

    }
    public static_1(final int a, final int b, final int c)
    {
        final int d= a+b+c;
        System.out.println(d);
    }

    static void change(){
        System.out.println(university);
        university="gla university";
        System.out.println(" u    "+university);
    }
    // university="gla univer";   we cant do this;

public static void main(final String[] args) {
  final static_1 obj5=new static_1(1,2);
  static_1 obj4=new static_1(1, 2, 3);

}
}