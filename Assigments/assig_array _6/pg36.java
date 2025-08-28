//36  Write a java program to implement bubble sort algorithm
import java.util.Scanner;
import java.util.Arrays;

class bubbleSort{
  public void sort(int arr[]){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr.length-i-1; j++){
          if(arr[j] >  arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
          }
      }
    }
  }
}

class TestMain{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);

    int arr[] = {90,56,80,70,30,50,60,20};
    System.out.print(Arrays.toString(arr));
    System.out.println();

    bubbleSort bs = new  bubbleSort();
    bs.sort(arr);
    System.out.print(Arrays.toString(arr));
  }
}