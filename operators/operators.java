package operators;

public class operators {


 void increment (){
        
    //some basic operations   
    int a= 10;
        System.out.println(++a);
        System.out.println(a++);
    
    //do not do this last opertions (increment ) has no effect 
    int b= 0;
        b=b++ +1 + b++;
        System.out.println(b);

    int c=0;
       c=c++ +1 +c;
       c++;
       System.out.println(c);

    int d=10;
    int e= d++ + --d -d++ +d-- + ++d - --d +d++ + ++d ;
    System.out.println("value of d->>>"+d);
    System.out.println("value of e->>>"+e);

    }

void conditional(){

     int a=-10;
    int absValue=0;
    if (a<0){
       absValue = -a;
    }
    else{
        absValue = a;
    }
      System.out.println("absValue-->>>"+absValue);

int result= a<0 ? -a : a;
     System.out.println("absValue->>>"+result);
}
void leftrightshift(){

    int bitpattern1 =127;
    bitpattern1 =bitpattern1<<2;
    System.out.println("after left shift value of bitpattern->>>"+bitpattern1);//here the lsb filled with 0;

    int bitpattern2 =127;
    bitpattern2 =bitpattern2>>2;
    System.out.println("after right shift value of bitpattern->>>"+bitpattern2);//here the msb filed with sign bits.

    int bitpattern3 =127;
    bitpattern3=bitpattern3>>>2;
    System.out.println("after unsigned right shift value of bitpattern->>>"+bitpattern3);//here the msb filed with zero bits.

}
void Instanceof(){
    String a= "asdfg";
    boolean result = a instanceof String;
    System.out.println("result     ->>> "+result);

    }


  public static void main( String[] args){
          
        System.out.println("1.increment 2. conditional  3. leftright shift  4. instanceof");
        operators o= new operators();
        o.increment();
        o.conditional();
        o.leftrightshift();
        o.Instanceof();

    }

    
        
}
    
