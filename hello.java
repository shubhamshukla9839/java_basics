
public class hello {
   public static int i;
   public static long f = 1;
   public static int num;

   public static void main(final String[] args)  {
       System.out.println("shubham");
        final int num = Integer.parseInt(args[0]);

       for (i = num; i >= 1; i--) {
           f = f * i;
           

        }
        System.out.println("the factorial of num is "+f);
        
    }
}
