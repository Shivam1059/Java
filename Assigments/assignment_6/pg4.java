import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the lenght of arr ");
    int n = sc.nextInt();

    int arr[] = new int[n];

    for(int i=0; i<n; i++){
      System.out.println("Enter the element "+i+" of array ");
      arr[i] = sc.nextInt();
    }
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.print("After sort of array ");
    for(int i=0; i<n; i++){
      for(int j=n-1; j>0; j--){
        if(arr[i] > arr[j]){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
        }
      }
    }
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
  }
}