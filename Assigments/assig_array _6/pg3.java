import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);


    System.out.print("Enter the length of arr ");
    int n = sc.nextInt();

    int arr[] = new int[n];
    for(int i=0; i<n; i++){
      System.out.println("Enter the element  "+i+" of array ");
      arr[i] = sc.nextInt();
    }

    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("After reverse the array ");
    for(int i=n-1; i>=0; i--){
      System.out.print(arr[i]+" ");
    }
  }
}