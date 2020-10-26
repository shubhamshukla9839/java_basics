package assignment.logicalpogram;

public class string2 {

    public static void main(String[] args){

    String s1="   hello worls hello hello     ";
    String s2="world";
    String s3=s1.concat(s2);
    System.out.println(s3);
    String s4=s1.replace("hello","hi");
    System.out.println(s4);
    System.out.println(s1);
    System.out.println(s1.trim());                              // it neglected spaces startting and end
   
    String sd=String.join("*,", "yes","i","am","best"); // first parametr id delimiter  // means first parameter define how string will saperate 
    System.out.println(sd);
    
    String date=String.join("/","12","1","2020");   
              
    System.out.println(date);


    
}
}