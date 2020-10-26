public class ri {

  int real ;
  int img ;

  ri add (ri c1, ri c2){
         ri z=new ri();
         z.real = c1.real+c2.real;
         z.img = c1.img+c2.img;
         return z;
   }

public static void main(String[] args){

  ri c1 = new  ri();
  ri c2 = new  ri();
  ri c3 = new  ri();
  c1.real=5;
  c1.img =5;
  c2.real =5;
  c2.img=5;
  c3 = c3.add(c1,c2);
  System.out.println(c3.real+"i"+c3.img);
}

}

