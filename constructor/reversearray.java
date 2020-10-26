
package constructor;
import java.util.Scanner;
public class reversearray {
    public static void main(final String[] args){
    final int [] a = new int[5];
    int l= a.length;
    final Scanner reader = new Scanner(System.in);
    for(int i=0;i<a.length;i++){
        System.out.println("enter the elements");
        a[i]=reader.nextInt();
    }
    int s=-1;
    for(int j=(a.length-1);j>=a.length/2; j--)
    {
        s++;
        int temp=a[j];
        a[j]=a[s];
        a[s]=temp;
    }

    for(int k=1;k<l;k++){
        System.out.println(a[k]);
    }

}
}