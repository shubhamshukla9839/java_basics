import java.util.Scanner;
public class febonaki {


    public static void main(String[] args)
    {
        System.out.println("enter the max range onto you want to print");
      Scanner reader = new Scanner(System.in);
            int a=reader.nextInt();
        System.out.println("enter the initial number");
        int st=reader.nextInt();
        System.out.println("enter the next number");
        int en =reader.nextInt();
        int[] arr= new int[a];

        for(int i=2;i<arr.length;i++)
{
    arr[0]=st;
    arr[1]=en;
    arr[i]=arr[i-1]+arr[i-2];
}
    
    for(int i=0;i< arr.length;i++){
         System.out.println(arr[i]+"  ");
    }
}

}