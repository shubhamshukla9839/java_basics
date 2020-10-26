
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class fileread {

   static Scanner sr= new Scanner(System.in);
 public static void main(String[] args){
    System.out.println("enetr 1 if you want write file  \n enter 2 if you want to read file");
    int as =sr.nextInt();
    if(as==1){
        filewriteon("write");
    }
else if(as==2){
  filereadon("read");
}
else{
    System.out.println("not valid input");
}
 }
static  void filewriteon(String sw){
try{
    FileWriter fo= new FileWriter("file1.txt");
    fo.write("shubhamkumarshukla");
    fo.close();
}
catch(Exception ex){
    System.out.println("exceptin is   "+ex.getMessage());
}
}
static void filereadon(String sr){
    int c;
    try{
    FileReader fr = new FileReader("file1.txt");
    while((c = fr.read())!=-1)
    {
          System.out.print((char)c);
    }
   
}
     catch(Exception ee){
         System.out.println("our file read exception  "+ ee.getMessage());
}
}
}

