package assignment;
import java.util.Scanner;
public class powernum {
void power(int b,int p,int i){
    int u=1;
    int o=p;
    for(i=o;i>0;i-- ){
         u = b*u;
    }
    System.out.println("the final result will be:  "+u);
    
}

public static void main(String[]  args){
int i =0;
Scanner reader1 = new Scanner(System.in);
System.out.println("enetr base element");
int b = reader1.nextInt();
System.out.println("enetr the power element");
Scanner reader2 = new Scanner(System.in);
int p = reader2.nextInt();
powernum r = new powernum();
r.power( b, p,i);




}
}