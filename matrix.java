public class matrix
{
public static void main(String[] args) 
	{
      int[][] arr1 = {{1,3,1},{1,0,0}};
      int[][] arr2 = {{0,0,5},{7,5,0}};
      int[][] arr3 = new int[2][3];
      
      for(int i = 0; i < 2; ++i) {
         for(int j = 0; j < 3; ++j) {
             arr3[i][j] = arr1[i][j] + arr2[i][j]; 
         }
      }      
      System.out.println(arr3[2][3]);
   }

}