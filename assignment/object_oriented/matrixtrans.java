package assignment.object_oriented;

public class matrixtrans {

    public static void main(String[] args ){

        int[][] array1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] array2=new int [3][3];

       
        for(int i=0;i<array1.length;i++)  {
       for(int j=0;j<array1[i].length;j++){
             int a=array1[i][j];
             array2[j][i]=a; }
        }
        System.out.println("transpose of matrix is which is given is       ");
        for(int i=0;i<array2.length;i++)
        {
       for(int j=0;j<array2[i].length;j++)
       {
           System.out.print("   "+array2[i][j]);; 

    }
    System.out.println("  ") 
}}}