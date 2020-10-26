package SQLiteDatabaseBrowserPortable.App.exception_hendling;

public class ex2 {


    public static void main(String[] args)
    {
        final int a=10;
        final int b=0;
        int[] c=new int[2];
        try{
            c[0]=5;             // two cases one when index is 0 another when index is 5 ;
            try{  
                                   // from here 111111
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e);

        }
    }
        catch(ArithmeticException e){
    
        System.out.println(e);
       
    }
    catch(ArrayIndexOutOfBoundsException e)     // then here 111111
    {
        System.out.println(e);
    }

    
}
}
