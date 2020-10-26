import java.io.FileWriter;
public class myfile {

    public static void main(String[] args){
   try{
        FileWriter fo= new FileWriter("file1.txt");
        fo.write("shubhamkumarshukla");
        fo.close();
    }
    catch(Exception ex){
        System.out.println("exceptin is   "+ex.getMessage());
    }

    
}

static void read1{

}
}