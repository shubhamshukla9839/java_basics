package constructor;

public class innerclass {

   static class animal {    // use static keyword if you want to make object in void main
          String name;
          
          String voice;

    }
    public static void main(String[]  args){

        animal an = new animal();
        an.name="shubham";
        an.voice="hihi";
        System.out.println(an.name);


    }
    
}