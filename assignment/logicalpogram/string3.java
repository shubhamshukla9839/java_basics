package assignment.logicalpogram;

public class string3 {


    public static void main(String[] args){


        StringBuffer sb=new StringBuffer("shubham");     // 16+7
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append("shukla");
        System.out.println(sb);                            //      mutable   (original string will change)
        sb.insert( 2, "oooo");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0,5);
        System.out.println(sb);
        System.out.println("    ///     ");
        sb.deleteCharAt(10);
        System.out.println("   ///     ");
        System.out.println(sb);
        sb.replace(0, 5, "shubh");
        System.out.println(sb);
        sb.substring(0,5);
        System.out.println(sb);                                 // here buffer will not changed in substring method
    }
    
}