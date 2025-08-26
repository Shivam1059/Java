//33. Write a java program to impelment binary search algorithm

import java.util.Scanner;
import java.util.Arrays;
class Search{
     public String   findElement(int arr[], int target ){
       int start = 0;
       int end = arr.length-1;
       while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
              return "Element is found ";
            }
            else if(target > arr[mid]){
              start = mid;
              start++;
            }else{
              end = mid;
              end--;
            }
       }
      return "Element is not found";
    
     }
}


class TestMain{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int arr[] = {10,20,30,40,50,60,70,80,90};
      System.out.print(Arrays.toString(arr));
      System.out.println();

      System.out.print("Enter any element from this give arr : ");
      int target = sc.nextInt();

      Search s = new Search();
      System.out.print( s.findElement(arr,target));
 
    }
}