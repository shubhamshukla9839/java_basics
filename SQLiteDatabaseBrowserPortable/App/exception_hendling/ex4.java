package SQLiteDatabaseBrowserPortable.App.exception_hendling;

public class ex4 {


    public static void main(String[] args)
    
    {
      int age=5;      
                                       
        try{

            if(age<18)
            {

                throw new NotanadultException();

            }
        }

        catch(NotanadultException e){

            System.out.println(e);

        }

    }
    
}
