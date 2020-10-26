package SQLiteDatabaseBrowserPortable.App.exception_hendling;

public class ex1 {

    // exception condition aries during run time   it is runtime error
    // java has exception hendling machanism
    // error and exception is 2 different things though it looks same 

    // exception is object , that describe the exceptionn
    // when exception occurs , an object representing that expression is thrown
    // this thrown exception can then be caught and can be handled

    // keyword used --  try a block which might have cause exception 
    //  catch catches the exceptio so that we can handle it
    /// throw used when we want to manually throw exception
    // finally     any code that has to be executed after try block ends 

    public static void main(String[] args)
    {
        final int a=10;
        final int b=0;
    try{
        System.out.println(a/b);                // exception devide by zero
        System.out.println("hi");              //  it doesnt run becouse exception occurs before and control immidiatly go at catch 
    }
    catch(Exception e){
        System.out.println("this is  devide by zero error please use non zero value todevide");
        System.out.println(e);

    }

    finally{System.out.println("you are in final ");}
    
}
}
