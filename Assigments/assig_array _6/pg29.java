//29. Suppose a one-dimensional array AR containing integers is arranged in ascending order. Write a java program to search for an integer from AR with the help of Binary search method,
import java.util.Scanner;

class TestMain{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int arr[] = {4,5,6,7,8,9};
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  System.out.println();

  System.out.print("Enter a element for search in arr: ");
  int target  = sc.nextInt();

  int start = 0;
  int end = arr.length-1;
  boolean status = false;
  while(start <=  end){
      int mid = (start + end)/2;

      if(arr[mid] == target){
         status = true;
      }
     else if(target > arr[mid]){
        start = mid;
     }else{
      end = mid;
     }
     start++;
     end--;
  }
  if(status){
    System.out.print("element is found");
  }else{
    System.out.print("element is not  found");
  }
  }
}