package assignment.logicalpogram;

public class stringdemo {

    public static void main(String[] args ){


        String str1=new String("abc");                     //     heap memory      new always creat new object in heap area 
    
        String str2="abc";                                //    string pool         both str2 and str4 pointer same string pool in memory
    
        
        String str7=new String("abc").intern();           //     intern method take abc and put it in string pool (in memory)
    
        System.out.println(str7==str2);                     //    it now output true becouse both the objects are same string pool and objects reduces


        String str9="abc";  

        String str3=new String("abc");                      //heap memory
        
        String str4="abc";                                 //string pool
          
        if(str1.equals(str2))                             //   check value 
        {
            System.out.println("true");

        }
        
        if(str1==str2)
        {
            System.out.println("true");         // output false

        }
         else{
             System.out.println("false");
         }

         if(str2==str4)
        {
            System.out.println("true");

        }
         else{
             System.out.println("false");
         }


         String str5="abc"+"xyz"+new String("123");        /// it create total 6 objects

        // object 1 abc                                   // why its creating a lot of objects becouse string is imutable type of class 
        // ,,     2 xyz
        // ,,     3 abc+xyz
        //  ,,     4 "123"
        //  ,,     5 abc+xyz+123
        // ,,      6 new (abcxyz123)
        // there are lot of string class created so how can resiolve so we are using 
        //   StringBuffer(is thread safe)    StringBuilder(not thread safe)



        StringBuffer sb= new StringBuffer("abc");        ////       2 objects
        sb.append("xyz");
        sb.append("123");                                 //   if you make any change then its only use 1 objects not create more objects 

        System.out.print(sb.length());


    }
    
}