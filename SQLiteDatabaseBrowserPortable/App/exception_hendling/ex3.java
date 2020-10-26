package SQLiteDatabaseBrowserPortable.App.exception_hendling;

public class ex3 {



    public static void main(String[] args)
    {

        int age=15;
        try{
            if(age<18)
            {
                throw new ArithmeticException("age is less then 18");
            }
        }
        catch(ArithmeticException e){
            System.out.println(e);

        }

    }
    
}
