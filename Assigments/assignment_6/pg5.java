import java.util.Scanner;

class Test{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

    int arr[] = {20,34,67,23,78,89,44};
    int larget = 0;

    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();

    System.out.print("Enter the kth element ");
    int k = sc.nextInt();
    
    for(int i=0; i<arr.length-1;i++){
        if(larget < arr[i]){
          larget = arr[i];
        }
    }
    System.out.print("Larget element in array : "+larget);
  }
}