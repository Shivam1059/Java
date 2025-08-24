import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of arr : ");
    int n = sc.nextInt();
      int arr[] = new int [n];
      for(int i=0; i<n; i++){
        System.out.println(i+" Enter the number : ");
          arr[i] = sc.nextInt();
      }
      for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
      int start = 0;
      int end = arr.length-1;
      while(start<=end){
          if(arr[start] > arr[end]){
              int temp = arr[end];
              arr[end] = arr[start];
              arr[start] = temp;
              
          }
              start++;
              end--;
        
      }

      for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
      }
  }
}