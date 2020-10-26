package SQLiteDatabaseBrowserPortable.App.exception_hendling;

import java.util.Scanner;

public class ex5 {


    //list of buildin exceptions 


    public static void main(final String[] args ){

        final Scanner reader=new Scanner(System.in);

        System.out.println("enter id");

        final int id=reader.nextInt();

        try {

        if(id!=1234) {

            throw new InvalidUsridException();

        }
    }

    catch( Exception e) {

        System.out.println(e);

    }

    }
    
}
