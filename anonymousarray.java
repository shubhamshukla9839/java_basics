

public class anonymousarray {


    static void printarray(int arr[])
    {
        int i=0;
        for (i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
    }

    public static void main(String args[]){
      //  int[] h =  new int[]{1,5,6,4};
        printarray(new int[]{1,5,9,8});
    }
    
}