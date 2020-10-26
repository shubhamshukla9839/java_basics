package collections;

public class generic {    

    public static void main(String[] args)
    {
        samplegeneric<String,Integer> demo=new samplegeneric<String,Integer>("123",555);      // passing string
        samplegeneric<Integer,String> demo1=new samplegeneric<Integer,String>(12354,"shubhm");  // passing integer

        System.out.println(demo.getvalue());
        System.out.println(demo1.getnext());
    }
    
}
