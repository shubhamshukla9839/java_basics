package assignment;

import java.util.Arrays;

public class sizechangeofarray {

    public static void main(String[] args){

            String[] listofname= new String[3];
            listofname[0]="shubham";
            listofname[1]="shukla";
            listofname[2]="saurabh";
            
            String[] newarray=new String[listofname.length+1];
            newarray[listofname.length]="shukla";
            System.arraycopy(listofname,0, newarray,0,listofname.length);
          System.out.println(  Arrays.toString(newarray));

          String[] newarra= Arrays.copyOf(listofname, listofname.length + 1);
          newarra[listofname.length]="shukla";
          System.out.println(Arrays.toString(newarra));   // directly print array without loop


    }
    
}