package SQLiteDatabaseBrowserPortable.App.exception_hendling.datastructure;

import java.util.ArrayList;

public class q1 {


     public static void main(String[] args) {
        
    

int arr[] ={1,0,1,0,1,1,0,1,0,1,1};
int s=0;
int max=0;

ArrayList<Integer> list=new ArrayList<Integer>();
int max1=0;
for(int i:arr)
  {
    
      
      if(i==1 ){
          s++;       
  }
  else{
      if(s>0)
      {
          list.add(s);
         
      }
      list.add(i);
      s=0;

  }
}
list.add(s);
System.out.println(list);
int[] array=new int[list.size()];
for(int i=0;i<list.size();i++){

    
    if(list.get(i)==0)
    {
        int y=list.get(i-1)+list.get(i+1);
        array[i]=y+1;
        
    }
}
for(int i:array)
{
    max1=i;
    if(i>=max)
       max1=i;
    if(i!=0)
        System.out.println(i);
}
     }
    }
