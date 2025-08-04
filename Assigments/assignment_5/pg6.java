// sort the array
 import java.util.Scanner;

 class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of arr : ");
    int size  = sc.nextInt();

    int arr[] = new int[size];

    for(int i=0; i<size; i++){
        System.out.print("enter "+i+" element ");
        arr[i] = sc.nextInt();
      }
    
    for(int i=0; i<size-1; i++){
      for(int j=0; j<size-1; j++){
        if(arr[j]  > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

    for(int i=0; i<size; i++){
      System.out.printf(arr[i] + " ");
    }

  }
 }