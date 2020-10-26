package collections;

public class lambda2 {

    public static void main(String[] args)
    {
        person p;
        p=(age) -> {

            if(age>18)
            {
            System.out.println("adults");
            }
            else System.out.println("not adults");

        };
        // it is blocks programming of lambda expression

        p.checkforaduld(20);  // from here we pass 20  which will go in interface and then main and main will return accourdind to given condition
    }
    
}
