//2D array printing 

import java.util.Arrays;
class Test{
  public static void main(String args[]){
    int arr[][] = {
                {2,3,4,5},
                {4,5,6,7},
                {7,8,9,1}
    };
    //using inbuild array pakeage
    // for(int i=0; i<arr.length; i++){
    //   System.out.print(Arrays.toString(arr[i]));
    //   System.out.println();
    // }

   //using for each loop
    for(int[] a : arr){
      System.out.println(Arrays.toString(a));
    }
  }
}