public class multiarray {


    public static void main(String[] args ){
        int[][] a={{1,2,3},{4,5},{6,8}};

        for(int[] arry1:a)
        {
            for(int arry2:arry1)
            {
                System.out.println(arry2);
            }
        }
    }
    
}