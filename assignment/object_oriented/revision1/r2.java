package assignment.object_oriented.revision1;

public class r2 {
 public static void main(String[] args) {
    
    {
        byte b = 42;
        char c = 'a';
        int v=(int)'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println("result = " + result);
        System.out.println("result = " + f*b);
        System.out.println("result = " + i/c);
        System.out.println("result = " + d*s);
        System.out.println("result = " + v); 
    
}
 }
}
