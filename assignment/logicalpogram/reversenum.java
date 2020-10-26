package assignment.logicalpogram;
import java.util.Scanner;

public class reversenum {

public static void main(String[] args) {

    Scanner reader=new Scanner(System.in);
    int n=reader.nextInt();
    int no=n;
    int no1=n;
    int c=0;
    int d=0;
    while(n!=0){
        n=n/10;
         c++;
    }
    System.out.print(c);
    int b=10^(c-1);
   
    while(no!=0&b!=0){
        int a=no%10;
        int a1=no/b;
        if(a!=a1)
             d=1;
        no=no/b;
        b=b/10;  

    }
    if(d==1){
        System.out.println("not palendrome");
    }

    
}
}