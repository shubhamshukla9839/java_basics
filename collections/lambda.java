package collections;

public class lambda {

    public static void main(String[] args)
    {
        number n;                                             // creat reference for lambda expression
        n = () -> 200*100;

        System.out.println(n.displaynumber());
        demo d;
        d=(a) -> a+20;                                        // expression body (a+20)  // w can also use block body
        System.out.println(d.demomethod(5));

        genericmess<String>message;

        message = (m)-> {
            
            return m;
        };
        
        System.out.println(message.displaymessage("shubham "));
    }
    
}
