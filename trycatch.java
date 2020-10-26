import java.util.Scanner;
public class trycatch {

    public static void main(String[]  args){
        System.out.println("enetr the number");
        Scanner reader = new Scanner(System.in);
        try{

            int a= reader.nextInt();
            System.out.println(a);

        }
        catch(Exception ex){
            System.out.println("the exception is "+ ex.getMessage());
        }
        finally{
            System.out.println("you are outside the try1 catch1");
        }
    }
    
}