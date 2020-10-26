public class arrayasending {

    int k =0;
    int p=0;
    int temp=0;
    int[] a = new int[10];
    int g=0;
    int ok=-10000;
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
        
         a[g]=max;
         g++;
         
    }
    for(k=0;k<r.length;k++){
        System.out.println("  "+a[k]);
       }

    
}
}