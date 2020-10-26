 import java.util.Scanner;
    
    public class array {
        public static void main(String args[]) {
    
            Scanner reader= new Scanner(System.in);
            int[] a = new int[10];
            int sum= 0;
            int i;
            for (i = 0; i <a.length; i++) 
                a[i] = reader.nextInt();

            for ( i = 0; i < a.length; i++)
                sum = sum + a[i];
            System.out.println("sum of elements of array is :----"+sum);
            System.out.println("if u want to find largest and smallest element enter 1");
            int l =reader.nextInt();   
       if(l==1){
            int max_val=a[0];
            for (i=0;i<a.length;i++)
            {
                if (a[i]>max_val)
                {
                    max_val=a[i];
                }
                
            }
            System.out.println("maximum value is:   -->>"+max_val);
    
        int min_val=a[0];
            for (i=0;i<a.length;i++)
        {
            if (a[i]<min_val)
            {
                min_val=a[i];
            }
            
        }
        
        System.out.println("minimum value is:   -->>"+min_val);
    }

    System.out.println("if you want to sort the array press 2");
    int e= reader.nextInt();
    if(e==2)
    {

       
        int k =0;
        int p=0;
        int temp=0;
        int[] r = new int[10];
        int g=0;
        int ok=-1000007;
        for (k=0;k<a.length;k++){
            int max=a[k];
                int ind=k;
             for(p=0;p<a.length;p++){
                  if(a[p]>max)
                  {
                      max=a[p];
                      ind=p;
                  }
             }
             
             a[ind]=ok;
            
             r[g]=max;
             g++;
             
        }
        for(k=0;k<r.length;k++){
            System.out.println("  "+r[k]);
           }


   }
}
}




    