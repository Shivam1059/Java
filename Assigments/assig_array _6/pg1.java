import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n = sc.nextInt();
    
    int arr[] = new int[n];
    for(int i=0; i<n; i++ ){
       System.out.println("Enter the number : "+i);
       arr[i] = sc.nextInt();
    }
    int peak = 0;
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
    for(int i=1; i<n; i++){
      if(arr[i] > arr[i-1]){
        peak = arr[i];
      }
    }
    System.out.print("Peak element : "+peak);
  }
}