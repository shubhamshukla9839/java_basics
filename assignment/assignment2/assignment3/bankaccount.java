package assignment.assignment2.assignment3;

import java.util.Scanner;


public class bankaccount {

   int accountnumber;
   String name_of_depositor;
   String type;
   float balance;
   bankaccount(int accountnumber,String name_of_depositor,String type,int balance){
         
  System.out.println("\n: your account is created succesfully, with above given details \n");
  this.name_of_depositor=name_of_depositor;
  this.accountnumber=accountnumber;
  this.type=type;
  this.balance=balance;

System.out.println("\nusername:  \n"+name_of_depositor+"\naccount_number :  \n"+accountnumber); 
}
void deposite_ammount(int a){
    
   balance=balance+a;
   System.out.println("now total ammount in your account is :  "+balance);
}
void withdrown_ammount(int b)
{
    if(balance<b)
    {
        System.out.println("you have less ammount :   currently you have only "+balance);

    }
    else
    {
        System.out.println(" you withdrown total ammount :  "+b+"\n now your balance is:  "+(balance-b));

     }
}
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        bankaccount b =new bankaccount(1234,"shubham","withdroe",500);
        System.out.println(" if you want to deposite some ammount please enter your ammount");
        int a=reader.nextInt();
        b.deposite_ammount(a);
        System.out.println("if you want to withdrown some ammount please eanter ammount");
        int l=reader.nextInt();
        b.withdrown_ammount(l);

    }
    
}
