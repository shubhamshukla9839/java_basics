package SQLiteDatabaseBrowserPortable.App.exception_hendling.datastructure;

public class linklistdemo {

 public static void main(String[] args) {

    linklist<String> ls=new linklist<String>();
    ls.add("shubham");
    ls.add("shukla");
    ls.add("hjk");
    ls.add("ec");
    ls.display();
    System.out.println("after delete");
    ls.delete();
    ls.display();
        
    }
    
}
