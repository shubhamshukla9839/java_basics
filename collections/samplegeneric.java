package collections;

public class samplegeneric <T,u> {

       T value;
       u val;

       public  samplegeneric(T v, u va)
       {
            value = v;
            val =va;
       }

          public samplegeneric(double d) {
	}

		T getvalue(){

           return value;
    }
    u getnext()
    {
        return val;
    }
}
